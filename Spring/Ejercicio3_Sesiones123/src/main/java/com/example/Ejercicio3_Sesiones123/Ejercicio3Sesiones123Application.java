package com.example.Ejercicio3_Sesiones123;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejercicio3Sesiones123Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(Ejercicio3Sesiones123Application.class, args);

		EmpleadosRepository repository = context.getBean(EmpleadosRepository.class);

		System.out.println(repository.count());

		Empleados uriel = new Empleados(null,"Uriel","Lara","urielglt@gmail.com",461107844);
		Empleados ivan = new Empleados(null,"jdhaf","iejrs","kdlafje",461107844);
		Empleados juan = new Empleados(null,"Ujsla","jfdls","urielg",461107844);

		repository.save(uriel);

		System.out.println(repository.findAll());
	}

}
