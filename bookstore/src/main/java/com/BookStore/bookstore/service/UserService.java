package com.BookStore.bookstore.service;

import com.BookStore.bookstore.entity.User;
import com.BookStore.bookstore.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository repository1;

    public User saveUser(User user){
        return repository1.save(user);
    }
    public List<User> saveUsers(List<User> users){
        return repository1.saveAll(users);
    }

    public List<User> getUsers(){
        return repository1.findAll();
    }

    public User getUserById(int userId){
        return repository1.findById(userId).orElse(null);
    }

    public User getUserByName(String userName){
        return repository1.findByUserName(userName);
    }

    public String deleteUser(int userId){
        repository1.deleteById(userId);
        return "User Removed" +userId;
    }

    public User updateUser(User user){
        User existingUser = repository1.findById(user.getUserId()).orElse(null);
        existingUser.setUserId(user.getUserId());
        existingUser.setUserName(user.getUserName());
        existingUser.setUserEmail(user.getUserEmail());
        existingUser.setUserContact(user.getUserContact());
        existingUser.setCountOfBooks(user.getCountOfBooks());
        existingUser.setSuspendState(user.getSuspendState());
        return repository1.save(existingUser);
    }

}

