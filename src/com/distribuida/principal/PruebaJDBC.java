package com.distribuida.principal;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String jdbcURL = "jdbc:mysql://localhost:3306/dblibreria60";
		String user = "root";
		String clave = "Julio1987";
		
		try {
			System.out.println("Estableciendo conexion a BD!!....");
			
			Connection connection = DriverManager.getConnection(jdbcURL, user, clave);
			
			System.out.println("conexion establecida!!");
			
		}catch (Exception e){
			e.printStackTrace();
			
			
			
		}
				
				

	}

}
