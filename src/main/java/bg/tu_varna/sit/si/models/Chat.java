package bg.tu_varna.sit.si.models;

import bg.tu_varna.sit.si.enumerables.ChatType;
import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "CHATS")
public class Chat implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private int id;

    @Column(name = "NAME", length = 128)
    private String name;

    @Column(name = "CHAT_TYPE")
    private ChatType chatType;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChatType getChatType() {
        return chatType;
    }

    public void setChatType(ChatType chatType) {
        this.chatType = chatType;
    }

    public Chat() {
    }

    public Chat(String name) {
        this.id = 0;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Name: " + name;
    }
}
