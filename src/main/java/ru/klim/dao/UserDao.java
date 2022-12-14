package ru.klim.dao;

import org.springframework.stereotype.Component;
import ru.klim.model.User;
import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
@Component
public class UserDao {

    private List<User> users = Arrays.asList(new User("admin", "admin"),
            new User("user1", "user1"));

    public List<User> getAllUsers(){
        return users;
    }
}
