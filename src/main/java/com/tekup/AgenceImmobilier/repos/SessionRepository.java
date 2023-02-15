package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.Session;
import com.tekup.AgenceImmobilier.model.User;

@Repository
public interface SessionRepository extends JpaRepository<Session, Long>{

	Session findByToken(String token);
	Session findByUser(User user);
}
