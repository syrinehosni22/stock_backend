package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.BienImmobilier;

public interface BienImmobilierServices {
	BienImmobilier saveBienImmobilier(BienImmobilier B);
	void deleteBienImmobilier(BienImmobilier B);
	BienImmobilier getBienImmobilier(Long id);
	List<BienImmobilier> getAllBienImmobilier();
	

}
