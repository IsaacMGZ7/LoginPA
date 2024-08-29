package com.example.demo;

import com.example.demo.domain.common.UsuarioRoute;
import com.example.demo.persistence.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class Pa5Application implements CommandLineRunner {

	@Autowired
	UsuarioRepository usuarioRepository;


	public static void main(String[] args) {
		SpringApplication.run(Pa5Application.class, args);


	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("GET", "POST", "PUT", "DELETE");

			}
		};
	}

	@Override
	public void run(String... args) throws Exception {
		usuarioRepository.findAll().forEach(System.out::println);



	}

	@GetMapping(value = "/" + UsuarioRoute.Usuario.LOGIN)
	public ResponseEntity<?> testLogin() {
		return ResponseEntity.ok("Login route is working");
}


}
