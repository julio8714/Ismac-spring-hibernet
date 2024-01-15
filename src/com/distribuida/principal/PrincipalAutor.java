package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.AutorDAO;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorDAO autorDAO = context.getBean("autorDAOImpl", AutorDAO.class);
		
		
		//crud
		
		
		//add
		
		Autor autor = new Autor(0, "nomnre1", "apellido1", "pais1","direccion1","telefono1","correo1");
		
		autorDAO.add(autor);
		
		
		//up
		Autor autor2 = new Autor(54, "nombre22", "apellido22", "pais22","direccion22","telefono22","correo22");
		//autorDAO.up(autor2);
		
		
		//del
		//autorDAO.del(54);
		
		//fidAll
		List<Autor> autores = autorDAO.findAll();
		
		
		for (Autor item : autores) {
			
			System.out.println(item);
			
		}
		
		
		//finOne
		
		//Autor autor = autorDAO.findOne(1);
		
		//System.out.println(autor.toString());
		
		
		context.close();

	}

}
