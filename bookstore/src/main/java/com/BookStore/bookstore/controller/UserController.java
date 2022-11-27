package com.BookStore.bookstore.controller;

import com.BookStore.bookstore.entity.User;
import com.BookStore.bookstore.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService service1;
    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return service1.saveUser(user);
    }
    @PostMapping("/addUsers")
    public List<User> addUsers(@RequestBody List<User> users){
        return service1.saveUsers(users);
    }
    @GetMapping("/users")
    public List<User> findAllUsers(){
        return service1.getUsers();
    }
    @GetMapping("/userId/{userId}")
    public User findUserById(@PathVariable int userId){
        return service1.getUserById(userId);
    }
    @GetMapping("/userName/{userName}")
    public User findUserByName(@PathVariable String userName){
        return service1.getUserByName(userName);
    }
    @PutMapping("/updateUser")
    public User updateUser(@RequestBody User user )
    {
        return service1.updateUser(user);
    }
    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable int userId){
        return service1.deleteUser(userId);
    }
}
