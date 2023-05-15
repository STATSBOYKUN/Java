package chatbot.server.model;

/**
 *
 * @author Mutaqin
 */
public class Message {
    private User bot;
    private User user;
    private String content;
    private int time;

    public Message(User bot, User user, String content, int time) {
        this.bot = bot;
        this.user = user;
        this.content = content;
        this.time = time;
    }

    public Message() {
    }

    public User getBot() {
        return bot;
    }

    public void setBot(User bot) {
        this.bot = bot;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
    
}
