package com.nttdata.bootcamp.bootcam2parents;

public class PersonaSingleton {
	
	private static PersonaSingleton personaInstance;
	private String nombre;
	private int edad;
	
	
	private PersonaSingleton() {
		
	}
	
	public static PersonaSingleton getInstance() {
		if(personaInstance==null) {
			personaInstance=new PersonaSingleton();
		}
		return personaInstance;
	}
	
	
	public void singletonOperation() {
		System.out.println("Me llamo " + this.nombre + " y tengo " + this.edad + " años.");
	}

}
