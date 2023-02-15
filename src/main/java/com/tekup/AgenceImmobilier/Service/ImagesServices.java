package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.Images;

public interface ImagesServices {
	Images saveImages(Images I);
	void deleteImages(Images I);
	Images getImages(Long id);
	List<Images> getAllImages();
}
