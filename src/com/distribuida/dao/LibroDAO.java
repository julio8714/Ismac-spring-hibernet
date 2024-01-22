package com.distribuida.dao;

import java.util.List;

import com.distribuida.entities.Libro;

public interface LibroDAO {
	
	// spring boot - CrudeRepository
	
	public List<Libro> findAll();
	
	public Libro findOne(int id);
	
	public void add(Libro libro);
	
	public void up(Libro libro);
	
	public void del(int id);
	
	//
	
	public List<Libro> findAll(String busqueda);
	

}
