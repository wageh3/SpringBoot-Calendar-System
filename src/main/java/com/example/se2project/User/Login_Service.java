package com.example.se2project.User;

import com.example.se2project.Entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.Optional;

@Service
public class Login_Service {

    final private Login_Repo login_repo ;
    public Login_Service(Login_Repo login_repo) {
        this.login_repo = login_repo;
    }

    public ResponseEntity<String> login(@RequestBody User user) {
        Optional<User> result = login_repo.findByEmail(user.getEmail());

        if (result.isPresent()) {
            User getted_user = result.get();
            if (getted_user.getPassword().equals(user.getPassword()))
                return ResponseEntity.ok("SUCCESS");
            else
                return ResponseEntity.ok("WRONG PASSWORD");
        }
        else
            return ResponseEntity.ok("THIS EMAIL NOT FOUND");
    }

}
