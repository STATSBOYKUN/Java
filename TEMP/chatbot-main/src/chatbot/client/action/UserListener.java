package chatbot.client.action;

import chatbot.client.model.User;

/**
 *
 * @author Mutaqin
 */
public interface UserListener {
    public void onUserChanged(User user);
}
