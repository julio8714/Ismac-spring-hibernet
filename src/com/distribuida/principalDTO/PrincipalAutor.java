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
		//add
		autorService.add(0, "nombre1", "apellido1","pais1","direccion1","telefono1","correo1");
		System.out.println(">>>>ADD>>>>>>"+autorService.findOne(72));
		
		//up
		autorService.up(72, "nombre2", "apellido2","pais2","direccion2","telefono2","correo2");
		System.out.println(">>>>UP>>>>>>"+autorService.findOne(72));
		
		//del
		autorService.del(72);
		try {System.out.println(">>>>DEL>>>>>>"+autorService.findOne(72));} catch (Exception e) {e.printStackTrace();} 
		
		//fin all
		for (Autor item : autorService.findAll()) {System.out.println(item.toString());}
		
	
		
		
		
		context.close();
		

	}

}
