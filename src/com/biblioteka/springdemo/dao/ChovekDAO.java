package com.biblioteka.springdemo.dao;

import java.util.List;

import com.biblioteka.springdemo.entity.Chovek;

public interface ChovekDAO {
	
	public List<Chovek> getLugje();

	public void zacuvajClen(Chovek nov);

	public Chovek getChovek(String id);

}
