package com.queries.mvc.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.queries.mvc.moldels.*;

public interface CitiesRepository  extends CrudRepository<Cities,Long>{

    @Query(value="select countries.name,  cities.name as nombreCiudad, cities.population from cities inner JOIN countries on countries.code = cities.country_code WHERE countries.name=\"Argentina\" and cities.population > 500000", nativeQuery=true)
    List<Object[]> consulta7();
    
    @Query(value="select name from cities where id =:x", nativeQuery=true)
    List<Object[]> consultaName(@Param("x") Long x);
    
}
