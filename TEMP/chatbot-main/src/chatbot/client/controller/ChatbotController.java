package chatbot.client.controller;

import chatbot.client.action.MessageListener;
import chatbot.client.service.ConnectionService;
import chatbot.client.action.UserAction;
import chatbot.client.action.UserListener;
import chatbot.client.model.Message;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mutaqin
 */
public class ChatbotController implements UserAction {

    private ConnectionService service;
    private List<UserListener> userListeners;
    private List<MessageListener> messageListeners;
    private List<Message> messages;

    public ChatbotController(ConnectionService connection) {
        this.service = connection;
        messages = new ArrayList<>();
    }

    public void addUserListener(UserListener listener) {
        if (userListeners == null) {
            userListeners = new ArrayList<>();
        }
        userListeners.add(listener);
    }

    public void removeUserListener(UserListener listener) {
        userListeners.remove(listener);
    }

    public void addMessageListener(MessageListener listener) {
        if (messageListeners == null) {
            messageListeners = new ArrayList<>();
        }
        messageListeners.add(listener);
    }

    public void removeUserListener(MessageListener listener) {
        messageListeners.remove(listener);
    }

    private void triggerUserChange() {
        for (UserListener userListener : userListeners) {
            userListener.onUserChanged(service.getUser());
        }
    }

    private void triggerMessageChange(Message message) {
        for (MessageListener messageListener : messageListeners) {
            messageListener.onMessageChanged(message);
        }
    }

    @Override
    public boolean login(String email, String password) {
        boolean result = service.login(email, password);
        if(result){
            triggerUserChange();
            Message resMsg = service.sendMessage(new Message("welcome", System.currentTimeMillis(), false));
            if(resMsg!=null){
                messages.add(resMsg);
                triggerMessageChange(resMsg);
            }
        }
        return result;
    }

    @Override
    public boolean logout() {
        System.out.println("Logout...");
        boolean result = service.logout();
        triggerUserChange();
        return result;
    }

    @Override
    public boolean register(String name, String email, String password) {
        return service.register(name, email, password);
    }

    @Override
    public void sendMessage(String message) {
        Message msg = new Message(message, System.currentTimeMillis(), false);
        messages.add(msg);
        triggerMessageChange(msg);
        Message resMsg = service.sendMessage(msg);
        if(resMsg!=null){
            messages.add(resMsg);
            triggerMessageChange(resMsg);
        }
    }
    
    public void exit(){
        service.disconnect();
    }
}
