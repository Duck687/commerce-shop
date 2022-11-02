package controllers_Crud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import repos.userRepository;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import models.user;
import service.userService;


@RestController
public class userControllerRest {
    @Autowired
    userService userService;
    @GetMapping("/user")
    public List<user> getAlluser()
    {
        return userService.getAll();
    }
    //creating a get mapping that retrieves the detail of a specific book
    @GetMapping("/user/{userid}")
    private Object getUser(@PathVariable("userid") int userid)
    {
        return userService.get(userid);
    }
    //creating adelete mapping that deletes a specified book
    @DeleteMapping("/user/{userid}")
    private void deleteUser(@PathVariable("userid") int userid)
    {
        userService.delete(userid);
    }
    //creating post mapping that post the book detail in the database
    @PostMapping("/user")
    private int saveUser(@RequestBody user users)
    {
        userService.save(users);
        return users.getId_user();
    }
    //creating put mapping that updates the book detail
    @PutMapping("/users")
    private user update(@RequestBody user users)
    {
        userService.save(users);
        return users;
    }
}

