package com.tekup.AgenceImmobilier.Service;

import java.util.List;


import com.tekup.AgenceImmobilier.model.TypeImmobilier;

public interface TypeImmobilierServices {


	TypeImmobilier savev(TypeImmobilier T);
	void deleteSTypeImmobilier(TypeImmobilier T);
	TypeImmobilier getTypeImmobilier(Long id);
	List<TypeImmobilier> getAllV();
}