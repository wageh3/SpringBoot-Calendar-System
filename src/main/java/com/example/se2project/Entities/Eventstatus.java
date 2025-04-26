package com.example.se2project.Entities;

import jakarta.persistence.*;

import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "eventstatus")
public class Eventstatus {
    @Id
    @Column(name = "eventstatus_id", nullable = false)
    private Integer id;

    @Column(name = "status", nullable = false, length = Integer.MAX_VALUE)
    private String status;

    @OneToMany(mappedBy = "eventstatus")
    private Set<Event> events = new LinkedHashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Set<Event> getEvents() {
        return events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

}