package com.project1.myrestservice.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



import com.project1.myrestservice.Login.User;




@Controller
public class LoginController{


    @Autowired
    UserService userService;

    @RequestMapping("/login")
    public String showLoginPage(ModelMap model) {
        return "login";
    }

    @PostMapping(value="/login")
    public String showWelcomPage(ModelMap map, @RequestParam String name, @RequestParam String email) {
        if(userService.checkCredentialUser(name, email) == false){
            map.put("message","Invalid Name and Email, please login again or register if you haven't had an Account");
            return "login";
        }
        else{
            map.put("name",name);
            return "welcome";
        }
    }

    @GetMapping(value="/signup")
    public String showSignupPage(){
        return "signup";
    }

    @PostMapping(value="/signup")
    public String adduser(ModelMap map, @RequestParam String name, @RequestParam String email) {
        userService.addUser(new User("1", name, email));
        map.put("name", name);
        return "welcome";
    }

    @GetMapping(value="/users")
    public String showUsers (ModelMap map) {
         map.put("pengguna",userService.retrieveAllUsers());
         return "users";
    }
    

   
    


    


    
    


}
