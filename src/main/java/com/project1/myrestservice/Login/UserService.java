package com.project1.myrestservice.Login;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class UserService{

    private static List<User> user = new ArrayList<User>();

    static{
        user.add(new User("1", "Putra", "zainudinsaputra94@gmail.com"));
        user.add(new User("2", "Wida", "widanoer@gmail.com"));
        user.add(new User("3", "Angga", "anggawijaya@gmail.com"));
    }

    int countUser = 3;

    public void addUser(User users){
        users.setId(Integer.toString(++countUser));
        user.add(users); 
    }

    public List<User> retrieveAllUsers(){
        return user;
    }

    public Boolean checkCredentialUser(String name, String email){
        boolean cred = false;
        for (User us : user) {
            if(us.getName().equals(name)&& us.getEmail().equals(email)){
                cred = true;
                break;
            }
        }
        return cred;
    }

}