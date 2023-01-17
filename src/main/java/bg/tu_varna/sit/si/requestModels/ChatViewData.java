package bg.tu_varna.sit.si.requestModels;

import bg.tu_varna.sit.si.models.Chat;

import java.io.Serializable;

public class ChatViewData implements Serializable {

    public Chat chat;

    public String lastMessageData;

    public ChatViewData() {
    }

    public ChatViewData(Chat chat, String lastMessageData) {
        this.chat = chat;
        this.lastMessageData = lastMessageData;
    }

    public Chat getChat() {
        return chat;
    }

    public void setChat(Chat chat) {
        this.chat = chat;
    }

    public String getLastMessageData() {
        return lastMessageData;
    }

    public void setLastMessageData(String lastMessageData) {
        this.lastMessageData = lastMessageData;
    }
}
