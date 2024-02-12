package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.CategoriaService;
import com.distribuida.entities.Categoria;

public class PrincipalCategoria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		CategoriaService categoriaService = context.getBean("categoriaServiceImpl", CategoriaService.class);
		//CategoriaDAO categoriaDAO = context.getBean("categoriaDAOImpl", CategoriaDAO.class);
		
	 // categoriaService.add(0,"categoria2", "descripcion categoria2 " );
		
	//categoriaService.del(51);
		
		
		
		//add
		
	  
	//  List<Categoria> categorias2 = categoriaService.findAll("med");
		
		
		List<Categoria> categorias = categoriaService.findAll();
		

		for (Categoria  categoria : categorias) {
			
			System.out.println(categoria.toString());	
			
		}
		
		
		
		//findOne
		
			//Categoria categoria = categoriaService.findOne(1);
		//System.out.println(categoria.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}
