package com.biblioteka.springdemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.biblioteka.springdemo.dao.ChovekDAO;
import com.biblioteka.springdemo.entity.Chovek;

@Service
public class BibliotekaServiceImpl implements BibliotekaService {

	@Autowired
	private ChovekDAO chovekDAO;
	
	
	@Override
	@Transactional
	public List<Chovek> getLugje() {
		return chovekDAO.getLugje();
	}


	@Override
	@Transactional
	public void zacuvajClen(Chovek nov) {
		chovekDAO.zacuvajClen(nov);
	}


	@Override
	@Transactional
	public Chovek getChovek(String id) {
		
		return chovekDAO.getChovek(id);
	}

}
