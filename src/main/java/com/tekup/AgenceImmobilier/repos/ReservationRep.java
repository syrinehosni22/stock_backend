package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tekup.AgenceImmobilier.model.Reservation;

public interface ReservationRep extends JpaRepository<Reservation, Long> {

}
