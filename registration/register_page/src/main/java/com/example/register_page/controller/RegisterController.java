package com.example.register_page.controller;

import com.example.register_page.model.Register;
import com.example.register_page.service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/register")
public class RegisterController {

    @Autowired
    //created
    RegisterService registerService;
    public RegisterController(RegisterService registerService)
    {
        this.registerService = registerService;
    }

    private static final List<Register> users = new ArrayList<>();
    static {
        // Adding some dummy data to the list
        users.add(new Register("user1", "a", "a@a", "a1", "a1"));
        users.add(new Register("user2", "b", "b@b", "b@b", "b1"));
        users.add(new Register("user3", "c", "c@c", "c@c","c1"));
        users.add(new Register("user4", "d", "d@d", "d@d","d1"));
        users.add(new Register("user5", "e", "e@e", "e@e","e1"));

    }


    @GetMapping("{id}")
    public Register getRegisterDetails(String id)
    {
        return new Register("1","abc","ss","ee","ee");
    }

    @PostMapping
    public String createRegister(@RequestBody Register register){
        registerService.createRegister(register);
        return "Registration successful";
    }

}
