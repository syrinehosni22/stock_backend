package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.Status;

public interface StatusServices {
	Status saveStatus(Status S);
	void deleteStatus(Status S);
	Status getStatus(Long id);
	List<Status> getAllStatus();
}
