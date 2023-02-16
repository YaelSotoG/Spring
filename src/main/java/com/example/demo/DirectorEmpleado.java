package com.example.demo;

public class DirectorEmpleado implements Empleados {
	
	//creacion de campo tipo creacionInforme (interfaz)
	private CreacionInformes informeNuevo;
	public DirectorEmpleado( CreacionInformes informe) {
		this.informeNuevo=informe;
	}
	
	public String getTareas() {
		return "gestionar plantilla de la empresa";
	}

	@Override
	public String getInforme() {
		// TODO Auto-generated method stub
		return "informe creado por el director: "+ informeNuevo.getInforme();
	}
	
	
	
	//metodo init. ejecutar tareas antes de que el bean este disponible
	public void metodoInicial() {
		System.out.println("Dentro del metodo init, aqui van las tareas a ejecutar antes de que el bean este listo");
	}
	//destroy ejecutar tareas despeues de que el bean haya sido ejecutado
	public void metodoFinal() {
		System.out.println("Dentro del metodo init, aqui van las tareas a ejecutar despues de utilizar el bean");
	}
	
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
