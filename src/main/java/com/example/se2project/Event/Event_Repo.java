package com.example.se2project.Event;
import com.example.se2project.Entities.Event;
import com.example.se2project.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;
import java.util.Optional;

public interface Event_Repo extends JpaRepository<Event,Integer> {
    List<Event> findEventByUserId(int userId);
}