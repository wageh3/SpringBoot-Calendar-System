package com.example.se2project.User;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/api")
public class Logout_Controller {

    @PostMapping("/logout")
    public ResponseEntity<String> Logout_User(HttpServletResponse response) {
            Cookie cookie = new Cookie("userId", null);
            cookie.setPath("/");
            cookie.setHttpOnly(true);
            cookie.setMaxAge(0);
            response.addCookie(cookie);
            return ResponseEntity.ok("Logged out successfully");
    }
}
