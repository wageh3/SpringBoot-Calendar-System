//package com.example.se2project.Entities;
//
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "event_reminder")
//public class EventReminder {
//    @EmbeddedId
//    private EventReminderId id;
//
//    @MapsId("eventId")
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "event_id", nullable = false)
//    @JsonIgnore
//    private Event event;
//
//    @MapsId("reminderId")
//    @ManyToOne(fetch = FetchType.LAZY, optional = false)
//    @JoinColumn(name = "reminder_id", nullable = false)
//    @JsonIgnore
//    private Reminder reminder;
//
//    public EventReminderId getId() {
//        return id;
//    }
//
//    public void setId(EventReminderId id) {
//        this.id = id;
//    }
//
//    public Event getEvent() {
//        return event;
//    }
//
//    public void setEvent(Event event) {
//        this.event = event;
//    }
//
//    public Reminder getReminder() {
//        return reminder;
//    }
//
//    public void setReminder(Reminder reminder) {
//        this.reminder = reminder;
//    }
//
//}