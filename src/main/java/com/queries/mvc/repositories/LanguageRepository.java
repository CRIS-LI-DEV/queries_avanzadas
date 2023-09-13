package com.queries.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


import com.queries.mvc.moldels.*;

public interface LanguageRepository  extends CrudRepository<Cities,Long>{
	   
	   @Query(value="SELECT countries.name, languages.percentage, languages.language FROM countries INNER JOIN languages ON countries.code=languages.country_code WHERE language = \"Slovene\";  ", nativeQuery=true)
	    List<Object[]> consulta1();

	    
	    @Query(value="SELECT languages.language from languages inner JOIN countries on countries.code = languages.country_code where languages.percentage>89.0 order by percentage DESC", nativeQuery=true)
	    List<String> consulta4();

}
