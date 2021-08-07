package com.firstHelloWorld.firstHelloAcademy.controller;

import com.firstHelloWorld.firstHelloAcademy.model.Login;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String getLogin(@ModelAttribute("login") Login login){

        return "login";
    }

    @PostMapping("/login")
    public String checkLogin(@RequestParam("userName")String userName,
                             @RequestParam("password")String password,
                             ModelMap map) {
        map.addAttribute("userName",userName);
        map.addAttribute("password",password);

        if(userName.equals("admin") && password.equals("nimda")){
            return "control-page";
        }else{
            map.addAttribute("error","Invalid login credentials");
            return "login";
        }
    }

}
