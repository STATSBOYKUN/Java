package chatbot.client.model;

/**
 *
 * @author Mutaqin
 */
public class Message {

    private String name;
    private String content;
    private long time;
    private boolean bot;

    public Message() {
    }

    public Message(String content, long time, boolean bot) {
        this.content = content;
        this.time = time;
        this.bot = bot;
        this.name = bot?"Bot":"Me";
    }

    public String getName() {
        return name;
    }

    public String getContent() {
        return content;
    }

    public long getTime() {
        return time;
    }

    public boolean isBot() {
        return bot;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void setTime(long time) {
        this.time = time;
    }

    public void setBot(boolean bot) {
        this.bot = bot;
        this.name = bot?"Bot":"Me";
    }
    
    
    

}
