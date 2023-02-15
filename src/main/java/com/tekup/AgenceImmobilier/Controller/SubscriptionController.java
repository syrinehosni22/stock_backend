package com.tekup.AgenceImmobilier.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tekup.AgenceImmobilier.Service.UserServices;
import com.tekup.AgenceImmobilier.model.Role;
import com.tekup.AgenceImmobilier.model.User;
import com.tekup.AgenceImmobilier.objects.AuthenticationResponse;
import com.tekup.AgenceImmobilier.repos.RoleRepository;
import com.tekup.AgenceImmobilier.security.JwtUtil;
import com.tekup.AgenceImmobilier.security.MyUserDetailsService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/subscription")
public class SubscriptionController {

	@Autowired
	private UserServices userServices;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private AuthenticationManager authenticationManager;
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	@Autowired
	private JwtUtil jwtUtil;
	
	@PostMapping("/register")
	public ResponseEntity<?> register(@RequestBody User user) {
		Role role = roleRepository.findRoleByLibelle("Client");
		user.setRole(role);
		
		if(userServices.userExist(user.getEmail())) {
			return new ResponseEntity<>("Email already exists", HttpStatus.BAD_REQUEST);
		}
		
		userServices.addUser(user);
		
		return new ResponseEntity<>("User Added successfully", HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ResponseEntity<?> login(@RequestBody User user) throws Exception {
		try {
			authenticationManager.authenticate(
					new UsernamePasswordAuthenticationToken(user.getUsername(), user.getPassword()));
		} catch (BadCredentialsException e) {
			// TODO: handle exception
			throw new Exception("Incorrect Username or password", e);
		}
		
		final UserDetails userDetails = myUserDetailsService.loadUserByUsername(user.getUsername());
		Optional<User> saveduser = userServices.findUserByEmail(user.getUsername());
		final String jwt = jwtUtil.generateToken(userDetails);
		
		return ResponseEntity.ok(new AuthenticationResponse(jwt, saveduser.get()));
	}
}
