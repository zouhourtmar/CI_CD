package com.sip.ams;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JenkinsJunitMavenApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsJunitMavenApplication.class, args);
		
		System.out.println("Le calcul donne : " +Calculatrice.somme(10, 5));
		System.out.println("Le calcul donne : " +Calculatrice.produit(10, 5));
		
		System.out.println("Fin du programme : V2.2.1");
	}

}
