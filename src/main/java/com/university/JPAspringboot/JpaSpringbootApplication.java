package com.university.JPAspringboot;

import com.university.JPAspringboot.model.entity.Alumno;
import com.university.JPAspringboot.model.entity.Direccion;
import com.university.JPAspringboot.model.entity.Persona;
import com.university.JPAspringboot.services.contract.AlumnoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class JpaSpringbootApplication {

	//@Autowired(required = true)
	//private AlumnoDAO servicio;

/*	public JpaSpringbootApplication(AlumnoDAO servicio) {
		this.servicio = servicio;
	}*/

	public static void main(String[] args) {
		String[] beanDefinitionNames =  SpringApplication.run(JpaSpringbootApplication.class, args).getBeanDefinitionNames();
/*		for (String str : beanDefinitionNames){
			System.out.println(str);
		}*/

		System.out.println("hello word"+ SpringVersion.getVersion());

	}

	/*@Bean
	public CommandLineRunner runner(){
		try {

			return args-> {
				Direccion direccion = new Direccion("calle nueva","1234", "1234", "202", "2","olimpico");
				Persona alumno = new Alumno(null, "kenny", "robert", "123456", direccion);

				Persona save = servicio.save(alumno);
				System.out.println(save.toString());
			};
		} catch (NullPointerException e){
			System.out.println(" NullPointerException thrown in the main void");
			return null;
		}
	}*/

}
