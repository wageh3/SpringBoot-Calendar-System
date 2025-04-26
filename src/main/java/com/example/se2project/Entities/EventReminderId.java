package com.example.se2project.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import org.hibernate.Hibernate;

import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class EventReminderId implements Serializable {
    private static final long serialVersionUID = -767898372816019176L;
    @Column(name = "event_id", nullable = false)
    private Integer eventId;

    @Column(name = "reminder_id", nullable = false)
    private Integer reminderId;

    public Integer getEventId() {
        return eventId;
    }

    public void setEventId(Integer eventId) {
        this.eventId = eventId;
    }

    public Integer getReminderId() {
        return reminderId;
    }

    public void setReminderId(Integer reminderId) {
        this.reminderId = reminderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        EventReminderId entity = (EventReminderId) o;
        return Objects.equals(this.eventId, entity.eventId) &&
                Objects.equals(this.reminderId, entity.reminderId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId, reminderId);
    }

}