package com.queries.mvc.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.queries.mvc.moldels.Countries;
import com.queries.mvc.repositories.CitiesRepository;
import com.queries.mvc.repositories.CountriesRepository;
import com.queries.mvc.repositories.LanguageRepository;
@Service

public class Servicios {
private final LanguageRepository laRepository;
private final CountriesRepository coRepository;
private final CitiesRepository ciRepository;

public Servicios(LanguageRepository laRepository, CountriesRepository coRepository,  CitiesRepository ciRepository) {
	this.laRepository = laRepository;
	this.coRepository = coRepository;
this.ciRepository = ciRepository;
}

public List<Countries> paises(){
	List<Countries> paises = coRepository.todosLosPaises();
	return paises;
}

public List<Object[]> consulta1(){
	
	return laRepository.consulta1();
	
}






public List<Object[]> consulta2(){
	
	return coRepository.consulta2();
	
}

public List<String> consulta3(){
	
	return coRepository.consulta3();
	
}



public List<String> consulta4(){
	
	return laRepository.consulta4();
	
}




public List<String> consulta5(){
	
	return coRepository.consulta5();
	
}



public List<String> consulta6(){
	
	return coRepository.consulta6();
	
}


public List<Object []> consulta7(){
	
	return ciRepository.consulta7();
	
}


public List<Object []> consultaNOmbre(Long id){
	
	return ciRepository.consultaName(id);
	
}


public List<Object []> consulta8(){
	
	return coRepository.consulta8();
	
}




}