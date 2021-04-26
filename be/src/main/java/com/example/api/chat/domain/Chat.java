package com.example.api.chat.domain;

import javax.persistence.*;

@Table(name = "chats")
@Entity
public class Chat {

    @Id
    @GeneratedValue
    @Column(name = "chat_id")
    private long chatId;

    @Column(name ="message")
    private String message;

    @Column(name = "keyboard")
    private String keyboard;

    @Column(name = "reg_date")
    private String regDate;
}
