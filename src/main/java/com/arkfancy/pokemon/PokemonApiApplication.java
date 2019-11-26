package com.arkfancy.pokemon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.arkfancy.sso.support.annotation.EnableSSO;

@SpringBootApplication
@EnableSSO
public class PokemonApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(PokemonApiApplication.class, args);
	}

}
