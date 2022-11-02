package service;

import models.user;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import repos.userRepository;

import java.util.ArrayList;
import java.util.List;
@Service
public class userService {
    @Autowired
    userRepository userRepository;
    //getting all user record by using the method findaAll() of CrudRepository
    public List<user> getAll()
    {
        List<user> user = new ArrayList<user>();
        user= userRepository.findAll();
        return user;
    }
    //getting a specific record by using the method findById() of CrudRepository
    public user get(int id)
    {
        return userRepository.findById(id).get();
    }
    //saving a specific record by using the method save() of CrudRepository
    public void save(user user)
    {
        userRepository.save(user);
    }
    //deleting a specific record by using the method deleteById() of CrudRepository
    public void delete(int id)
    {
       userRepository.deleteById(id);
    }
    //updating a record
    public void update(user user, int bookid)
    {
        userRepository.save(user);
    }

}
