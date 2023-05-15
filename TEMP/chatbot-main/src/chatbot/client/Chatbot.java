package chatbot.client;

import chatbot.client.service.ConnectionService;
import chatbot.client.service.SocketConnectionService;
import chatbot.client.controller.ChatbotController;
import chatbot.client.view.ChatbotFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Mutaqin
 */
public class Chatbot {

    private ChatbotFrame chatbotFrame;
    private ChatbotController applicationController;
    private ConnectionService connection;
    
    public Chatbot() {
        connection = new SocketConnectionService();
        applicationController =  new ChatbotController(connection);
        chatbotFrame = new ChatbotFrame(applicationController);
    }
    
    public void launch(){
        System.out.println("Connect to server...");
        boolean connected = connection.connect();
        if(connected){
            chatbotFrame.setVisible(true);
        }else{
            JOptionPane.showMessageDialog(null, "Cannot connect to server.");
        }
    }
}
