package com.nttdata.bootcamp.bootcam2parents;

public class Person {
	
	private String nombre;
	private String apellido1;
	private String apellido2;
	private boolean minusvalido;
	private int edad;
	
	
	public Person(String nombre, String apellido1, String apellido2, boolean minusvalido, int edad) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.minusvalido = minusvalido;
		this.edad = edad;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public int getEdad() {
		return edad;
	}


	public void setEdad(int edad) {
		this.edad = edad;
	}


	public String getApellido1() {
		return apellido1;
	}


	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}


	public String getApellido2() {
		return apellido2;
	}


	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}


	public boolean isMinusvalido() {
		return minusvalido;
	}


	public void setMinusvalido(boolean minusvalido) {
		this.minusvalido = minusvalido;
	}


	@Override
	public String toString() {
		return "Person [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", minusvalido="
				+ minusvalido + ", edad=" + edad + "]";
	}
	
	
	
	
}
