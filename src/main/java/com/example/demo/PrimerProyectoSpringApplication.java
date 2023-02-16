package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class PrimerProyectoSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimerProyectoSpringApplication.class, args);
		
		
		//creacion de objetos de tipo empleado
		
		//JefeEmpleado Empleado1=new JefeEmpleado();
		//Empleados Empleado1=new SecretarioEmpleado();
		//Empleados Empleado2=new DirectorEmpleado();
		//uso de los objetos creados
		
		//System.out.println(Empleado1.getTareas());
		
		//se llama al xml
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml"); //se genera un contexto
		/*Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(Juan.getTareas());
		System.out.println(Juan.getInforme());*/
		
		
		
		
//		Inyaccion de campos
//		SecretarioEmpleado Maria=contexto.getBean("miSecretarioEmpleado",SecretarioEmpleado.class);
//		System.out.println(Maria.getInforme());
//		System.out.println(Maria.getTareas());
//		System.out.println(Maria.getEmail());
//		System.out.println(Maria.getNombreEmpresa());
		DirectorEmpleado Yael=contexto.getBean("miEmpleado",DirectorEmpleado.class);
		System.out.println(Yael.getInforme());
		System.out.println(Yael.getEmail());
		System.out.println(Yael.getNombreEmpresa());
		contexto.close();
	}

}
