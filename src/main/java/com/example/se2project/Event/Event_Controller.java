package com.example.se2project.Event;

import com.example.se2project.Entities.Event;
import com.example.se2project.Entities.Eventstatus;
import com.example.se2project.Entities.User;
import com.example.se2project.EventStatus.EventStatus_Repo;
import com.example.se2project.User.User_Repo;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class Event_Controller {
    final private  Event_Service event_service ;
    final private User_Repo user_repo ;
    final private EventStatus_Repo eventstatus_repo ;
    private final Event_Repo event_Repo;

    public Event_Controller(Event_Service event_service , User_Repo user_repo , EventStatus_Repo eventstatus_repo, Event_Repo event_Repo) {
        this.event_service = event_service;
        this.user_repo = user_repo;
        this.eventstatus_repo = eventstatus_repo;
        this.event_Repo = event_Repo;
    }

    @PostMapping("/Add_Event")
    public ResponseEntity<String> Add_Event(@RequestBody Event eventsended, @CookieValue(value = "userId", required = false) String userId) {
        Event event = new Event();
        event.setTitle(eventsended.getTitle());
        event.setDescription(eventsended.getDescription());
        event.setDate(eventsended.getDate());
        event.setTime(eventsended.getTime());
        Optional<User> user = user_repo.findById(Integer.parseInt(userId));
        event.setUser(user.get());

        LocalDate eventDate = event.getDate();
        LocalTime eventTime = event.getTime();
        LocalDateTime eventDateTime = LocalDateTime.of(eventDate, eventTime);
        LocalDateTime now = LocalDateTime.now();

        if (eventDateTime.isBefore(now)) {
            Eventstatus eventstatus = eventstatus_repo.findById(1);
            event.setEventstatus(eventstatus);
        }
        else {
            Eventstatus eventstatus = eventstatus_repo.findById(2);
            event.setEventstatus(eventstatus);
        }
        event_Repo.save(event);
        return ResponseEntity.ok("SUCCESS");
    }


    public List<Event> getAllEvents(@CookieValue(value = "userId", required = false) String userId) {
        List<Event> events = event_Repo.findEventByUserId(Integer.parseInt(userId));
        return events;
    }




}