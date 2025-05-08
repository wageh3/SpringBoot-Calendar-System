package com.example.se2project.User;
import com.example.se2project.Models.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class Login_Controller {

    final private Login_Service login_service ;
    public Login_Controller(Login_Service login_service) {
        this.login_service = login_service;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user, HttpServletResponse response) {
        ResponseEntity<String> result = login_service.login(user,response);
        return result;
    }



}
