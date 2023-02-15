package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.AgenceImmobilier.model.Images;
import com.tekup.AgenceImmobilier.repos.ImagesRepository;

@Service
public class ImagesServicesImpl implements ImagesServices{

	  @Autowired ImagesRepository imagesRepository;
	  
	@Override
	public Images saveImages(Images I) {
		
		return imagesRepository.save(null);
	}

	@Override
	public void deleteImages(Images I) {
		imagesRepository.delete(I);
		
	}

	@Override
	public Images getImages(Long id) {
		
		return imagesRepository.findById(id).get();
	}

	@Override
	public List<Images> getAllImages() {
		
		return imagesRepository.findAll();
	}

}
