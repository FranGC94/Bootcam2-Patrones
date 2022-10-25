package com.nttdata.bootcamp.bootcam2parents;

public class PersonBuilder implements Builder{

	private String nombre;
	private String apellido1;
	private String apellido2;
	private boolean minusvalido;
	private int edad;
	
	
	@Override
	public void setNombre(String nombre) {
		this.nombre=nombre;
		
	}

	@Override
	public void setApellido1(String apellido1) {
		this.apellido1=apellido1;
		
	}

	@Override
	public void setApellido2(String apellido2) {
		this.apellido2=apellido2;
		
	}

	@Override
	public void setMinusvalido(boolean bol) {
		this.minusvalido=bol;
		
	}

	@Override
	public void setEdad(int edad) {
		this.edad=edad;
		
	}
	
	public Person getResult() {
		return new Person(nombre, apellido1, apellido2, minusvalido, edad);
	}

}
