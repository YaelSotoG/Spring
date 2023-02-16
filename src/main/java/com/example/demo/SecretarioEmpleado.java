package com.example.demo;

//import com.example.demo;

public class SecretarioEmpleado implements Empleados {
	
	
	//inyeccion de dependencias
	
	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
	
	public String getTareas() {
		return "gestionar agenda de los jefes";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario" + informeNuevo.getInforme();
	}
	
	
	private CreacionInformes informeNuevo;
	
	//inyeccion de campos
	
	private String email;
	private String nombreEmpresa;
	
	
	//getterd and setters
	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNombreEmpresa() {
		return nombreEmpresa;
	}


	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}


	
	
	
}
