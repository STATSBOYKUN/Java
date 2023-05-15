package chatbot.client.action;

import chatbot.client.model.Message;

/**
 *
 * @author Mutaqin
 */
public interface MessageListener {
    public void onMessageChanged(Message messages);
}
