package ru.klim.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.klim.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import ru.klim.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    public @ResponseBody List<User> getAllUsers(){
        return userService.getAllUsers();
    }

   @GetMapping()
    public String allUsers(Model model) {
        model.addAttribute("message", userService.getAllUsers());
        return "users";
    }

//    @RequestMapping(method = RequestMethod.GET)
//    public String printWelcome(ModelMap model) {
//
//        model.addAttribute("message", "Spring 3 MVC - Hello World");
//        return "hello";
//
//    }
}
