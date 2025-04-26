package com.example.se2project.User;
import com.example.se2project.Entities.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Login_Controller {

    final private Login_Service login_service ;
    public Login_Controller(Login_Service login_service) {
        this.login_service = login_service;
    }

    @PostMapping("/login")
    public ResponseEntity<String> loginUser(@RequestBody User user) {
        ResponseEntity<String> result =login_service.login(user);
        return result;
    }

}
