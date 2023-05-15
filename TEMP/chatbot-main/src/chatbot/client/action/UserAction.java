package chatbot.client.action;

/**
 *
 * @author Mutaqin
 */
public interface UserAction {
    public boolean login(String email, String password);
    public boolean logout();
    public boolean register(String name, String email, String password);
    public void sendMessage(String message);
}
