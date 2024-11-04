package com.jwt.example.services;


import com.jwt.example.models.user;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class UserService {

    private List<user> store=new ArrayList<>();

    public UserService() {
        store.add(new user(UUID.randomUUID().toString(),"Dibyendu Bhandary","dbhandary1998@gmail.com"));
        store.add(new user(UUID.randomUUID().toString(),"Shreyosi Paul;","shreyosip1999@gmail.com"));
        store.add(new user(UUID.randomUUID().toString(),"Adrija Kollya","adrijak2018@gmail.com"));
        store.add(new user(UUID.randomUUID().toString(),"Dinesh Bhandary","dineshb1998@gmail.com"));
    }

    public List<user> getUser() {
        return this.store;
    }
}
