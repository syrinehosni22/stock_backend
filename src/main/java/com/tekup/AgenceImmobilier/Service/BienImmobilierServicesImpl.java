package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.AgenceImmobilier.model.BienImmobilier;
import com.tekup.AgenceImmobilier.repos.BienImmobilierRepo;



@Service
public class BienImmobilierServicesImpl implements BienImmobilierServices  {

	

	@Autowired
	private BienImmobilierRepo bienImmobilierRepository;
	
	@Override
	public BienImmobilier saveBienImmobilier(BienImmobilier B) {
		    
		return bienImmobilierRepository.save(B) ;
	}

	@Override
	public void deleteBienImmobilier(BienImmobilier B) {
		
		bienImmobilierRepository.delete(B);
	}

	@Override
	public BienImmobilier getBienImmobilier(Long id) {
		
		return bienImmobilierRepository.findById(id).get();
	}

	@Override
	public List<BienImmobilier> getAllBienImmobilier() {
		
			return bienImmobilierRepository.findAll();
	}

}