package com.manar.tp.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.manar.tp.EtudiantDAO;
import com.manar.tp.IdGenerator;
@Service
public class EtudiantService {
	@Autowired
	@Qualifier("memoEDAO")
	private EtudiantDAO etudiantDao;
	@Autowired
	private IdGenerator idGenerator;
	
	public void AjouterEtudiant(Etudiant etudiant) {
		etudiant.setNom("Bousfiha");
		etudiant.setPrenom("Manar");
		etudiant.setId(idGenerator.GenerateID());
		etudiantDao.Persister(etudiant);
	}
}
