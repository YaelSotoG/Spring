package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UsoSingletonPrototype {
	public static void main(String[] args) {
		
		//carga de xml
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml"); //se genera un contexto
		
		//peticion de beans al contenedor spring
		//singleton
		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		SecretarioEmpleado Pedro=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
		
		//los dos apuntan al mismo objeto de memoria
		System.out.println(Maria);
		System.out.println(Pedro);
		
		///para el prototype se genera en el bean con el scope
		
		
	}

}
