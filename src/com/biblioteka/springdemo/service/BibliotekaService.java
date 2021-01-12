package com.biblioteka.springdemo.service;

import java.util.List;

import com.biblioteka.springdemo.entity.Chovek;

public interface BibliotekaService {
	
	public List<Chovek> getLugje();

	public void zacuvajClen(Chovek nov);
	
	public Chovek getChovek(String id);

}
