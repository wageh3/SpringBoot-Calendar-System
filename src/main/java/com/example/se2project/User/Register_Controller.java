package com.example.se2project.User;
import com.example.se2project.Entities.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Register_Controller {

    final private Register_Service register_service ;
    public Register_Controller(Register_Service register_service) {
        this.register_service = register_service;
    }

    @PostMapping("/register")
    public ResponseEntity<String> RegisterUser(@RequestBody User user) {
        ResponseEntity<String> result = register_service.Register(user);
        return result;
    }
}
