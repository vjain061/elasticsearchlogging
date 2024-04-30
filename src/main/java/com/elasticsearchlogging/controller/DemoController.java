package com.elasticsearchlogging.controller;

import com.elasticsearchlogging.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {
    Logger logger = LoggerFactory.getLogger(DemoController.class);
    @GetMapping("/getUser/{id}")
    public String getUser(@PathVariable int id) {
        List<User> users = getUsers();
        User user = users.stream().filter(it -> it.getId() == id).findAny().orElse(null);
        String result = (user == null) ? "User Not found" : "User found";
        logger.info(result);
        logger.error(result);
        logger.debug(result);
        return result;
    }

    private List<User> getUsers() {
        User user = new User(1, "Vaibhav");
        User user2 = new User(2, "Riya");
        User user3 = new User(3, "Prathvi");
        return Arrays.asList(user, user2, user3);
    }
}
