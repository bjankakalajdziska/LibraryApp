package com.biblioteka.springdemo.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="chovek")
public class Chovek {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="EMBG")
	private String embg;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@Column(name="datum_ragjanje")
	private Date datumRagjanje;
	
	public Chovek() {
		
	}

	public Chovek(String embg, String ime, String prezime, Date datumRagjanje) {
		this.embg = embg;
		this.ime = ime;
		this.prezime = prezime;
		this.datumRagjanje = datumRagjanje;
	}

	public String getEmbg() {
		return embg;
	}

	public void setEmbg(String embg) {
		this.embg = embg;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public Date getDatumRagjanje() {
		return datumRagjanje;
	}

	public void setDatumRagjanje(Date datumRagjanje) {
		this.datumRagjanje = datumRagjanje;
	}

	@Override
	public String toString() {
		return "Chovek [embg=" + embg + ", ime=" + ime + ", prezime=" + prezime + ", datumRagjanje=" + datumRagjanje
				+ "]";
	}
	
	

}
