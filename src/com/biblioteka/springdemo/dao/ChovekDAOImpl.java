package com.biblioteka.springdemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.biblioteka.springdemo.entity.Chovek;

@Repository
public class ChovekDAOImpl implements ChovekDAO {

	//need to inject the session factory
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public List<Chovek> getLugje() {
		//get the current hibernate session
		Session currentSession =sessionFactory.getCurrentSession();
		
		//create query
		Query<Chovek> theQuery= currentSession.createQuery("from Chovek", Chovek.class);
		
		//execute query and get result list
		List<Chovek> people =theQuery.getResultList();
		
		//return the results
		return people;
	}

	@Override
	public void zacuvajClen(Chovek nov) {
		Session currentSession =sessionFactory.getCurrentSession();
		
		currentSession.save(nov);
	}

	@Override
	public Chovek getChovek(String id) {
		Session currentSession =sessionFactory.getCurrentSession();
		
		Chovek covek=currentSession.get(Chovek.class, id);
		return covek;
	}

}
