package bg.tu_varna.sit.si.requestModels;

import bg.tu_varna.sit.si.enumerables.ChatType;
import bg.tu_varna.sit.si.models.User;

import java.io.Serializable;

public class SearchChatData implements Serializable {

    public User currentUser;

    public User otherUser;

    public ChatType chatType;

    public SearchChatData() {
    }

    public SearchChatData(User currentUser, User otherUser, ChatType chatType) {
        this.currentUser = currentUser;
        this.otherUser = otherUser;
        this.chatType = chatType;
    }

    public User getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(User currentUser) {
        this.currentUser = currentUser;
    }

    public User getOtherUser() {
        return otherUser;
    }

    public void setOtherUser(User otherUser) {
        this.otherUser = otherUser;
    }

    public ChatType getChatType() {
        return chatType;
    }

    public void setChatType(ChatType chatType) {
        this.chatType = chatType;
    }
}
