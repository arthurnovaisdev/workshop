package com.arthurnovaisdev.web_services.config;

import com.arthurnovaisdev.web_services.entities.User;
import com.arthurnovaisdev.web_services.repositories.UserRepository;
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

        User u1 = new User(null, "Arthur Novais", "arthurnovaispeixoto@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Luiza Fernandes", "luizafernandes@gmail.com", "99999998", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}
