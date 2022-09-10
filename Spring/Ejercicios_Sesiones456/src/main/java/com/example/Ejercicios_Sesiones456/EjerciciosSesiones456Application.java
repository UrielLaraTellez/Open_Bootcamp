package com.example.Ejercicios_Sesiones456;

import com.example.Ejercicios_Sesiones456.Entities.Laptop;
import com.example.Ejercicios_Sesiones456.Repositories.LaptopRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class EjerciciosSesiones456Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(EjerciciosSesiones456Application.class, args);

		LaptopRepository repository = context.getBean(LaptopRepository.class);

		Laptop lenovo = new Laptop(null,"Lenovo","Legion",8,4);
		Laptop hp = new Laptop(null,"HP","Gaming",8,8);

		repository.save(lenovo);
		repository.save(hp);
	}

}
