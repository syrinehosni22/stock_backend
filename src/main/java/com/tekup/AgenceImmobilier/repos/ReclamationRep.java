package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.Reclamation;

@Repository
public interface ReclamationRep extends JpaRepository<Reclamation, Long> {

}
