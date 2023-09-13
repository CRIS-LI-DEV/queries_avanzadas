package com.queries.mvc.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.queries.mvc.moldels.Countries;
import com.queries.mvc.services.Servicios;
@RestController
public class ApiPaises {
private final Servicios servicios;
	
public ApiPaises( Servicios servicios) {
		this.servicios = servicios;
	}

@RequestMapping("/")
public List<Countries> paisesQueHablan() {
	
	List<Countries> paises = servicios.paises();
	for (Countries cou : paises) {
		System.out.println(cou.getName());
	}
	return paises;
}


@RequestMapping("/consulta1")
public List<Object[]> paisesQueHablanSloveno() {
	
	List<Object[]> paisesList = servicios.consulta1();
	Object[] pais = paisesList.get(0);
	Object nombrePais = pais[0];
	Object porcentajePais = pais[1];
	
	return paisesList;
}




@RequestMapping("/consulta2")
public List<Object[]> numeroDeCiudades() {
	
	List<Object[]> paisesList = servicios.consulta2();
	Object[] pais = paisesList.get(0);
	Object nombrePais = pais[0];
	Object porcentajePais = pais[1];
	
	return paisesList;
}




@RequestMapping("/consulta3")
public List<String> ciudadesDeMex() {
	
	List<String> paisesList = servicios.consulta3();
	
	
	return paisesList;
}




@RequestMapping("/consulta4")
public List<String> leguajesSobreel89() {
	
	List<String> paisesList = servicios.consulta4();
	
	
	return paisesList;
}



@RequestMapping("/consulta5")
public List<String> paisesSuperficie() {
	
	List<String> paisesList = servicios.consulta5();
	
	
	return paisesList;
}



@RequestMapping("/consulta6")
public List<String> paisesMonarquia() {
	
	List<String> paisesList = servicios.consulta6();
	
	
	return paisesList;
}

@RequestMapping("/consulta7")
public List<Object[]> ciudadesDeArgentina() {
	
	List<Object[]> paisesList = servicios.consulta7();
	
	
	return paisesList;
}


@RequestMapping("/consulta8")
public List<Object[]> regionesDelMundo() {
	
	List<Object[]> paisesList = servicios.consulta8();
	
	
	return paisesList;
}



@RequestMapping("/con/{id}")
public List<Object[]> con( @PathVariable(value="id") Long id) {
	
	List<Object[]> paisesList = servicios.consultaNOmbre(id);
	
	
	return paisesList;
}
}
