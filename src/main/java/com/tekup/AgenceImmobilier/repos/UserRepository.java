package com.tekup.AgenceImmobilier.repos;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
      List<User> findUserByActivated (boolean activated);
      Optional<User> findUserByEmail(String email);
      User findByEmail(String email);
}
