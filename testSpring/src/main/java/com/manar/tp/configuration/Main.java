package com.manar.tp.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.manar.tp.Services.Etudiant;
import com.manar.tp.Services.EtudiantService;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Etudiant etudiant = new Etudiant();
		EtudiantService etudiantService = context.getBean(EtudiantService.class);
		etudiantService.AjouterEtudiant(etudiant);

	}

}
