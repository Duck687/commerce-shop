package com.shop.Ecommerceshop.controllers_Crud;

import com.shop.Ecommerceshop.models.user;
import com.shop.Ecommerceshop.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class responseControllerRest {
    @Autowired
    com.shop.Ecommerceshop.service.userService userService;
    @GetMapping("/user")
    public List<user> getAlluser()
    {
        return userService.getAll();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/user/{userid}")
    public Object getUser(@PathVariable("userid") int userid)
    {
        return userService.get(userid);
    }
    //creating adelete mapping that deletes a specified book
    @DeleteMapping("/user/{userid}")
    public void deleteUser(@PathVariable("userid") int userid)
    {
        userService.delete(userid);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/user")
    public int saveUser(@RequestBody user users)
    {
        userService.save(users);
        return users.getId_user();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/users")
    public user update(@RequestBody user users)
    {
        userService.save(users);
        return users;
    }
}
