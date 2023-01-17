package bg.tu_varna.sit.si.models;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity( name = "CHAT_USERS" )
public class ChatUser implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @ManyToOne
    private User user;

    @ManyToOne
    private Chat chat;

    public ChatUser() {
    }

    public ChatUser(User user, Chat chat) {
        this.id = 0;
        this.user = user;
        this.chat = chat;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }
}
