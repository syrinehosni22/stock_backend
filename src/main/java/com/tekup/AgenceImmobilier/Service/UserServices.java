package com.tekup.AgenceImmobilier.Service;

import java.util.List;
import java.util.Optional;

import com.tekup.AgenceImmobilier.model.User;

public interface UserServices {
	
	User saveUser(User U);
	void deleteUser(User U);
	User getUser(Long id);
	List<User> getAllUsers();
	List<User> findActivatedUsers (boolean activated) ;
	User addUser(User user);
	boolean userExist(String email);
	Optional<User> findUserByEmail(String email);   
	

}
