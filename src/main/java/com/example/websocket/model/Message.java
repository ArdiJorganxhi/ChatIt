package com.example.websocket.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "messages")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Message {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String sender;

    private String receiver;
    private String message;


    public String getReceiver() {
        User user = new User();
        return user.getUsername();
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSender() {

        User user = new User();

        return user.getUsername();
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

}
