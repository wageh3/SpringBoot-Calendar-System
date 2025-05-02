package com.example.se2project.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "reminder")
public class Reminder {
    @Id
    @Column(name = "reminder_id", nullable = false)
    private Integer id;

    @Column(name = "\"time\"", nullable = false)
    private Integer time;

    @ManyToMany(mappedBy = "reminders")
    @JsonIgnore
    private Set<Event> events = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

}