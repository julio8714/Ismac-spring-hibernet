package com.distribuida.principal;



import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.distribuida.dao.FacturaDetalleDAO;
import com.distribuida.entities.FacturaDetalle;




public class PrincipalFacturaDetalle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		
		FacturaDetalleDAO facturaDetalleDAO = context.getBean("facturaDetalleDAOImpl", FacturaDetalleDAO.class);
		
		
		//FINDALL
				
		List<FacturaDetalle> detalles = facturaDetalleDAO.findAll();
		
		for (FacturaDetalle facturaDetalle : detalles) {
			
			System.out.println(facturaDetalle.toString());
			
		}
		
		
		
		context.close();
		

	}

}
