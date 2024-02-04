package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dto.AutorService;
import com.distribuida.entities.Autor;

public class PrincipalAutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		AutorService autorService = context.getBean("autorServiceImpl", AutorService.class);
		
		//crud
		//findall
		
		//Autor autor = new Autor(0, "a", "d", "g", "r", "b", "r");
		//autorService.add(autor);
		
		
		
		//for (Cliente item : clientes) {
			
		//	System.out.println(item.toString());
			
		//}
		
		//System.out.println(cliente.toString());
		
		//add agregar nuevo registro a la base de datos
		
		//Cliente cliente2 = new Cliente(0,"1722805866","Julio", "navarrete", "tababela", "1234567890", "julio@correo.com");
		//clienteService.add(cliente2);
		//clienteDAO.add(cliente2);
		
		//up editar un registro existente
		//Autor autor = new Autor();
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		//del borrar
		
		//Cliente cliente3 = new Cliente(40,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		autorService.del(0);
		
		
		List<Autor> autores = autorService.findAll();
		

		for (Autor item : autores) {
			
			System.out.println(item.toString());	
			
		}
		
		
		
		//findOne
		
	Autor autor = autorService.findOne(1);
		System.out.println(autor.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}
