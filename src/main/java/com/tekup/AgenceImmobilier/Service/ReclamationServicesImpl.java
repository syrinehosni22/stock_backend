package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.AgenceImmobilier.model.Reclamation;
import com.tekup.AgenceImmobilier.repos.ReclamationRep;

@Service
public class ReclamationServicesImpl implements ReclamationServices{

	@Autowired private ReclamationRep reclamationRepository;
	
	@Override
	public Reclamation saveReclamation(Reclamation R) {
		
		return reclamationRepository.save(R);
	}

	@Override
	public void deleteBienReclamation(Reclamation R) {
		reclamationRepository.delete(R);
		
	}

	@Override
	public Reclamation getReclamation(Long id) {
		
		return reclamationRepository.findById(id).get();
	}

	@Override
	public List<Reclamation> getAllReclamation() {
		
	 return reclamationRepository.findAll();
	}

}
