package chatbot.client.view;

import chatbot.client.controller.ChatbotController;
import java.awt.CardLayout;
import java.awt.event.WindowEvent;
import javax.swing.WindowConstants;

/**
 *
 * @author Mutaqin
 */
public class ChatbotFrame extends javax.swing.JFrame {

    private ChatbotController controller;
    private ChatList chatList;
    private LoginForm loginForm;
    private RegisterForm registerForm;

    /**
     * Creates new form ClientApp
     */
    public ChatbotFrame(ChatbotController controller) {
        this.controller = controller;
        initComponents();

        //observe
        this.controller.addUserListener(chatList);
        this.controller.addMessageListener(chatList);
    }

    private void initComponents() {
        loginForm = new LoginForm();
        registerForm = new RegisterForm();
        chatList = new ChatList();

        loginForm.setUserAction(controller);
        chatList.setUserAction(controller);
        registerForm.setUserAction(controller);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CHATBOT");
        setMinimumSize(new java.awt.Dimension(300, 400));
        setPreferredSize(new java.awt.Dimension(300, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                controller.exit();
                System.out.println("Exit...");
            }
        });
        getContentPane().setLayout(new CardLayout());

        loginForm.setName("loginForm");
        getContentPane().add(loginForm, "loginForm");
        getContentPane().add(registerForm, "registerForm");
        getContentPane().add(chatList, "chatList");
        pack();
    }

}
