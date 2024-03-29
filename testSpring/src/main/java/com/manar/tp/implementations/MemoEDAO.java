package com.manar.tp.implementations;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

import com.manar.tp.*;
import com.manar.tp.Services.Etudiant;

import jakarta.annotation.PostConstruct;
@Repository
public class MemoEDAO implements EtudiantDAO {
	private ArrayList<Etudiant> etudiants;

	@PostConstruct
	public void init() {
	        etudiants = new ArrayList<>();
	}
	@Override
	public void Persister(Etudiant e) {
		if(etudiants != null) {
			etudiants.add(e);
			System.out.println("ajouter dans la liste !");
		}
		
	}


	

}
