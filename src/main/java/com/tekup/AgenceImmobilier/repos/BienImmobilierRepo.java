package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;


import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.BienImmobilier;

@Repository
public interface BienImmobilierRepo extends JpaRepository<BienImmobilier, Long>{

}
