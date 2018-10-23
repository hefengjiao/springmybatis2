package com.springmybatis2.springmybatis2.controller;


import com.springmybatis2.springmybatis2.entity.User;
import com.springmybatis2.springmybatis2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@EnableAutoConfiguration
@RequestMapping("/")
public class UserController {

    @Autowired
   private UserService  userService;

    @GetMapping("/")
    public String index(Model model){
      model.addAttribute("country","china");
        model.addAttribute("name","greatwall");
        return "home";
    }

    @GetMapping("/{id}")
    public String findById(Model model, @PathVariable(value = "id") int id){
        User u = userService.getbyid(id);
        model.addAttribute("name",u.getUsername());
        return "home";
    }

}
