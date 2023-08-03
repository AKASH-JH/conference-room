package com.akash.conferenceRoom.repo;

import com.akash.conferenceRoom.model.Users;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserRepo {

    List<Users> usersList = new ArrayList<>();

    public Users getUserByUserId(UUID userId){
        Users user=null;
        for (int i=0;i<usersList.size();i++){
            if (usersList.get(i).getUserId() == userId){
                user =  usersList.get(i);
                break;
            }
        }
        return user;
    }

    public void addUser(Users users){
        usersList.add(users);
    }
}
