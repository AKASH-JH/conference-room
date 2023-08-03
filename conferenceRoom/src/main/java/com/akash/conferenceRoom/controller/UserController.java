package com.akash.conferenceRoom.controller;

import com.akash.conferenceRoom.model.FinRequestModel;
import com.akash.conferenceRoom.model.FinResponseModel;
import com.akash.conferenceRoom.model.Users;
import com.akash.conferenceRoom.repo.UserRepo;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Type;

@RestController
public class UserController {

    private final UserRepo userRepo;
    private ObjectMapper objectMapper;

    public UserController(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

//    @RequestMapping(value = "/registerUser", method = RequestMethod.POST)
//    public FinResponseModel registerUser(@RequestBody FinRequestModel finRequestModel){
//            Users user = this.objectMapper.convertValue(finRequestModel.finData, new TypeReference<Users>() {});
//            this.userRepo.addUser(user);
//
//    }
}
