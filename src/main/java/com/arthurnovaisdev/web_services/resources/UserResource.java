package com.arthurnovaisdev.web_services.resources;

import com.arthurnovaisdev.web_services.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User u = new User(1L, "Arthur", "arthur@gmail.com", "999999999", "123456");
        return ResponseEntity.ok().body(u);
    }

}
