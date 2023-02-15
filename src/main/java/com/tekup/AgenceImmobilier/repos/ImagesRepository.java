package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.Images;

@Repository
public interface ImagesRepository extends JpaRepository<Images, Long> {

}
