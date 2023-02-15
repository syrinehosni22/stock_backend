package com.tekup.AgenceImmobilier.Service;

import java.util.List;

import com.tekup.AgenceImmobilier.model.Session;
import com.tekup.AgenceImmobilier.model.User;

public interface SessionServices {

	Session findByToken(String token);

	Session findByUser(User user);

	void save(User user, String token);
	
}
