package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.TypeImmobilier;

@Repository
public interface TypeImmobilierRepository extends JpaRepository<TypeImmobilier, Long> {

}
