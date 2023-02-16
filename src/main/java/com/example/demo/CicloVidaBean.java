package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CicloVidaBean {
	public static void main(String [] args) {
	//cargar el xml de configuracion
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext3.xml");
	//obtencion del bean
		Empleados Yael=contexto.getBean("miEmpleado",Empleados.class);
		System.out.println(Yael.getTareas());
	//cerrar el contexto
		contexto.close();
	}

}
