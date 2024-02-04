package com.distribuida.principalDTO;

import java.util.Date;
import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.LibroService;
import com.distribuida.entities.Libro;


public class PrincipalLibro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro = new Libro(0, "a", "B", 0, "t", "l", new Date(), "d ", "d ", "f", "g", "h", "d", 2.2);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		LibroService libroService = context.getBean("libroServiceImpl", LibroService.class);
		
		//crud
		//findall
		
		
		//for (Cliente item : clientes) {
			
		//	System.out.println(item.toString());
			
		//}
		
		//System.out.println(cliente.toString());
		
		//add agregar nuevo registro a la base de datos
		
		//Cliente cliente2 = new Cliente(0,"1722805866","Julio", "navarrete", "tababela", "1234567890", "julio@correo.com");
		//clienteService.add(cliente2);
		//clienteDAO.add(cliente2);
		
		//up editar un registro existente
		//Cliente cliente3 = new Cliente(42,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		//del borrar
		
		//Cliente cliente3 = new Cliente(40,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		//clienteService.del(41);
		
		
		List<Libro> libros = libroService.findAll();
		
	for (Libro item : libros) {
			
			System.out.println(item.toString());	
			
		}
		
		//findOne
		
		Libro libro1 = libroService.findOne(1);
		
		System.out.println(libro1.toString());
		
		
		
	
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}
