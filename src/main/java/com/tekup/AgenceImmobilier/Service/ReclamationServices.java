package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.Reclamation;

public interface ReclamationServices {

	
	Reclamation saveReclamation(Reclamation R);
	void deleteBienReclamation(Reclamation R);
	Reclamation getReclamation(Long id);
	List<Reclamation> getAllReclamation();
}
