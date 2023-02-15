package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.Reservation;

public interface ReservationServices {

	Reservation saveReservation(Reservation R);
	void deleteBienReservation(Reservation R);
	Reservation getReservation(Long id);
	List<Reservation> getAllReservation();
}
