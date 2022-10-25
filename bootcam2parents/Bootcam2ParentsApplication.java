package com.nttdata.bootcamp.bootcam2parents;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bootcam2ParentsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Bootcam2ParentsApplication.class, args);
		
		PersonBuilder pb=new PersonBuilder();
		pb.setNombre("Juan");
		pb.setApellido1("Ojeda");
		pb.setApellido2("Vargas");
		pb.setMinusvalido(false);
		pb.setEdad(43);
		pb.getResult().toString();
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		
	}

}
