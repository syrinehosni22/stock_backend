package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tekup.AgenceImmobilier.model.Reservation;
import com.tekup.AgenceImmobilier.repos.ReservationRep;

@Service
public class ReservationServicesImpl implements ReservationServices {

	@Autowired ReservationRep ReservationRepository;
	
	@Override
	public Reservation saveReservation(Reservation R) {
		
		return ReservationRepository.save(R);
	}

	@Override
	public void deleteBienReservation(Reservation R) {
		ReservationRepository.delete(R);
	}

	@Override
	public Reservation getReservation(Long id) {
		
		return ReservationRepository.findById(id).get();
	}

	@Override
	public List<Reservation> getAllReservation() {
		
		return ReservationRepository.findAll();
	}

}
