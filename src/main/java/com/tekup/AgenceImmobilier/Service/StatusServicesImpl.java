package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.AgenceImmobilier.model.Status;

import com.tekup.AgenceImmobilier.repos.StatusRepository;

@Service
public class StatusServicesImpl implements StatusServices {

	@Autowired
	private StatusRepository statusRepository;
	
	@Override
	public Status saveStatus(Status S) {
		// TODO Auto-generated method stub
		return statusRepository.save(S);
	}

	@Override
	public void deleteStatus(Status S) {
		statusRepository.delete(S);
		
	}

	@Override
	public Status getStatus(Long id) {
		
	return statusRepository.findById(id).get();
	}

	@Override
	public List<Status> getAllStatus() {
		
		return statusRepository.findAll();
	}

}
