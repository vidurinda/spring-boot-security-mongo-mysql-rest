package com.icloud.micro;

import com.icloud.micro.mongo.model.Customer;
import com.icloud.micro.mongo.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.icloud.micro.mongo.model.User;
import com.icloud.micro.mongo.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootApplication
public class MicroServerApplication implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private CustomerRepository customerRepository;

	@Autowired
	private BCryptPasswordEncoder encoder;
	
	@Override
	public void run(String... args) throws Exception {
//		User u = new User();
//		u.setId(1);
//		u.setUsername("amal");
//		u.setPassword(encoder.encode("corolla"));
//		userRepository.save(u);

//		Customer c = new Customer();
//		c.setNameFirst("Janith");
//		c.setNameLast("Silva");
//		customerRepository.save(c);
	}

	public static void main(String[] args) {
		SpringApplication.run(MicroServerApplication.class, args);
	}
}
