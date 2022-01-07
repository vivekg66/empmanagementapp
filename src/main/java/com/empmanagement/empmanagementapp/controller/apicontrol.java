package com.empmanagement.empmanagementapp.controller;


import com.empmanagement.empmanagementapp.model.user;
import com.empmanagement.empmanagementapp.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class apicontrol {


    @Autowired
    private UserRepo userRepo;

    @GetMapping(value = "/users")
    public List<user>getUser(){
        return userRepo.findAll();

    }

    @PostMapping(value = "/save")
    public String saveUser(@RequestBody user user){
        userRepo.save(user);
        return "saved...";
    }

    @PutMapping(value="/update/{id}")
    public String updateUser(@PathVariable Long id,@RequestBody user user) {
        user updatedUser = userRepo.findById(id).get();
        updatedUser.setFname((user.getFname()));
        updatedUser.setLname((user.getLname()));
        updatedUser.setDesignation((user.getDesignation()));
        userRepo.save(updatedUser);
        return "updated";
    }

    @DeleteMapping(value="/delete/{id}")
    public String deleteUser(@PathVariable Long id) {
        user deleteUser = userRepo.findById(id).get();
        userRepo.delete(deleteUser);
        return "Employee deleted with id:" + id;
    }
}
