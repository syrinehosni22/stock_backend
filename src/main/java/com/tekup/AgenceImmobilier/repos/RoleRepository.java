package com.tekup.AgenceImmobilier.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tekup.AgenceImmobilier.model.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {

	Role findRoleByLibelle(String libelle);
}
