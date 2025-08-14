package com.webservice.webservice.config;

import com.webservice.webservice.entities.User;
import com.webservice.webservice.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {

        User u1 = new User(null, "Jonas Johnson Jensen", "jonas@email.com", "911223344", "123456");
        User u2 = new User(null, "Douglas Diogenes Dantos", "douglas@email.com", "944332211", "123456");

        userRepository.saveAll(Arrays.asList(u1,u2));

    }
}
