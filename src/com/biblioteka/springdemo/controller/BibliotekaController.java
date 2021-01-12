package com.biblioteka.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.biblioteka.springdemo.dao.ChovekDAO;
import com.biblioteka.springdemo.entity.Chovek;
import com.biblioteka.springdemo.service.BibliotekaService;

@Controller
@RequestMapping("/biblioteka")
public class BibliotekaController {
	
	@Autowired
	private BibliotekaService bibliotekaS;
	
	@GetMapping("/list")
	public String listajLugje(Model theModel) {
		//get people from the dao
		List<Chovek> lugje =bibliotekaS.getLugje();
		
		//add the people to the model
		theModel.addAttribute("lugje", lugje);
		return "listaj-lugje";
	}
	
	@GetMapping("/pokaziFormaZaNovClen")
	public String pokaziFormaZaNovClen(Model theModel) {
		Chovek nov= new Chovek();
		
		theModel.addAttribute("clen", nov);
		
		return "forma-clen";
	}
	
	@PostMapping("/zacuvajClen")
	public String zacuvajClen(@ModelAttribute("clen") Chovek nov) {
		
		bibliotekaS.zacuvajClen(nov);
		
		return "redirect:/biblioteka/list";
	}
	
	@GetMapping("/pokaziFormaZaUpdate")
	public String pokaziFormaZaUpdate(@RequestParam("chovekID") String id, Model theModel) {
		Chovek covek = bibliotekaS.getChovek(id);
		
		theModel.addAttribute("clen",covek);
		
		return "forma-clen";
		
	}

}
