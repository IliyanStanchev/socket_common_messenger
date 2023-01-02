package bg.tu_varna.sit.si.models;

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
