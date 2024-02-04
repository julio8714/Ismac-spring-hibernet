package com.distribuida.principalDTO;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.distribuida.dto.ClienteService;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteService clienteService = context.getBean("clienteServiceImpl", ClienteService.class);
		
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
		Cliente cliente3 = new Cliente(42,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		//clienteDAO.up(cliente3);
		//clienteService.up(cliente3);
		
		//del borrar
		
		//Cliente cliente3 = new Cliente(40,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		clienteService.del(41);
		
		
		List<Cliente> clientes = clienteService.findAll();
		
		//findOne
		
		//Cliente cliente = clienteService.findOne(1);
		
		
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());	
			
		}
		
		
		
		
		
		
		
		
		
		context.close();
		

	}

}
