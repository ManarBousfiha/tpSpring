package com.manar.tp.implementations;

import org.springframework.stereotype.Repository;

import com.manar.tp.EtudiantDAO;
import com.manar.tp.Services.Etudiant;

@Repository
public class MysqlEtudiantDAO implements EtudiantDAO{

	@Override
	public void Persister(Etudiant e) {
		System.out.println("Enregistrer");
	}

}
