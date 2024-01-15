package com.distribuida.principal;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.ClienteDAO;
import com.distribuida.entities.Cliente;

public class PrincipalCliente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		ClienteDAO clienteDAO = context.getBean("clienteDAOImpl", ClienteDAO.class);
		
		//crud
		//findall
		
		
		//for (Cliente item : clientes) {
			
		//	System.out.println(item.toString());
			
		//}
		
		//System.out.println(cliente.toString());
		
		//add agregar nuevo registro a la base de datos
		
		//Cliente cliente2 = new Cliente(0,"1722805866","Julio", "navarrete", "tababela", "1234567890", "julio@correo.com");
		//clienteDAO.add(cliente2);
		
		//up editar un registro existente
		//Cliente cliente3 = new Cliente(40,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		//clienteDAO.up(cliente3);
		
		//del borrar
		
		//Cliente cliente3 = new Cliente(40,"1722805855","Roberto", "Oyana", "Quito", "1234567894", "correo@correo.com");
		//clienteDAO.del(39);
		
		
		
		List<Cliente> clientes = clienteDAO.findAll();
		
		//findOne
		
		Cliente cliente = clienteDAO.findOne(1);
		
		
		
		for (Cliente item : clientes) {
			
			System.out.println(item.toString());
			
		}
		
		
		
		
		
		
		
		
		context.close();
		

	}

}
