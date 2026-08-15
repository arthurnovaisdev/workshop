package com.arthurnovaisdev.web_services.config;

import com.arthurnovaisdev.web_services.entities.Category;
import com.arthurnovaisdev.web_services.entities.Order;
import com.arthurnovaisdev.web_services.entities.User;
import com.arthurnovaisdev.web_services.entities.enums.OrderStatus;
import com.arthurnovaisdev.web_services.repositories.CategoryRepository;
import com.arthurnovaisdev.web_services.repositories.OrderRepository;
import com.arthurnovaisdev.web_services.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private OrderRepository orderRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void run(String... args) throws Exception {

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));

        User u1 = new User(null, "Arthur Novais", "arthurnovaispeixoto@gmail.com", "99999999", "123456");
        User u2 = new User(null, "Luiza Fernandes", "luizafernandes@gmail.com", "99999998", "123456");

        Order o1 = new Order(null, Instant.parse("2026-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2026-07-21T03:42:10Z"), OrderStatus.WAITING_PAYMENT, u2);
        Order o3 = new Order(null, Instant.parse("2026-07-22T15:21:22Z"), OrderStatus.WAITING_PAYMENT, u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}
