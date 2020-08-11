package com.entidad.springboot.backend.apirest.models.dao;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.entidad.springboot.backend.apirest.models.entity.Cliente;
import com.entidad.springboot.backend.apirest.models.entity.Region;


//Crud repository crea de forma automatica las consultas

public interface IClienteDao extends JpaRepository<Cliente,Long> {
	
	@Query("from Region")
	public List<Region>findAllRegiones();
	

}
