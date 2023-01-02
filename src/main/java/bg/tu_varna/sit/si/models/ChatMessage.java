package bg.tu_varna.sit.si.models;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity(name = "CHAT_MESSAGES")
public class ChatMessage implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    private User sender;

    @ManyToOne
    private Chat chat;

    @Column(name = "CONTENT", length = 2048)
    private String content;

    @Column(name = "CREATION_DATE")
    private LocalDateTime creationDate;

    public ChatMessage() {
    }

    public ChatMessage(User sender, Chat chat, String content) {
        this.id = 0;
        this.sender = sender;
        this.chat = chat;
        this.content = content;
        this.creationDate = LocalDateTime.now();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate) {
        this.creationDate = creationDate;
    }
}
