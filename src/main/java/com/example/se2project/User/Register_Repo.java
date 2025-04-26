package com.example.se2project.User;
import com.example.se2project.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Register_Repo extends JpaRepository<User,Integer> {
    Optional<User> findByEmail(String email);
}
