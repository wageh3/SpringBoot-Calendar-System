package com.example.se2project.EventStatus;
import com.example.se2project.Entities.Event;
import com.example.se2project.Entities.Eventstatus;
import com.example.se2project.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface EventStatus_Repo extends JpaRepository<Eventstatus,Integer> {
    Eventstatus findById(int id);
}
