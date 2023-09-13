package com.queries.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.queries.mvc.moldels.*;

public interface CountriesRepository  extends CrudRepository<Languages,Long>{
	
	   @Query("SELECT d FROM Countries d")
	    List<Countries> todosLosPaises();
	  
	   @Query(value="SELECT countries.name,COUNT(cities.name) FROM countries INNER JOIN cities ON countries.code=cities.country_code GROUP by countries.name order by COUNT(cities.name) desc", nativeQuery=true)
	    List<Object[]> consulta2();
	    
	    @Query(value=" SELECT cities.name FROM cities INNER JOIN countries ON countries.code=cities.country_code WHERE countries.name = \"Mexico\" and cities.population>500000 order by cities.population DESC", nativeQuery=true)
	    List<String> consulta3();
	    
	    @Query(value="Select name from countries where population>100000 and surface_area<501 ", nativeQuery=true)
	    List<String> consulta5();
	    
	
	    
	    

	    @Query(value="SELECT name from countries where government_form = \"Monarchy\" and life_expectancy > 75 and surface_area>200", nativeQuery=true)
	    List<String> consulta6();
	    


	    @Query(value="Select continent ,COUNT(name) as cuenta from countries GROUP by continent order by cuenta DESC", nativeQuery=true)
	    List<Object[]> consulta8();
	    
}
