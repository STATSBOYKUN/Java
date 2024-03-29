package chatbot.client.view;

import chatbot.client.action.MessageListener;
import chatbot.client.action.UserAction;
import chatbot.client.model.User;
import java.awt.CardLayout;
import java.awt.Container;
import chatbot.client.action.UserListener;
import chatbot.client.model.Message;
import java.util.List;

/**
 *
 * @author Mutaqin
 */
public class ChatList extends javax.swing.JPanel implements UserListener, MessageListener{

    private User user;
    private UserAction userAction;

    /**
     * Creates new form ChatPanel
     */
    public ChatList() {
        initComponents();
    }

    public void setUserAction(UserAction userAction) {
        this.userAction = userAction;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messageText = new javax.swing.JTextField();
        sendButton = new javax.swing.JButton();
        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        registerButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        messageList = new chatbot.client.view.MessageList();

        sendButton.setText("Send");
        sendButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendButtonActionPerformed(evt);
            }
        });

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("Chatbot");

        nameLabel.setText("Name");

        registerButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        registerButton.setForeground(new java.awt.Color(51, 153, 255));
        registerButton.setText("Logout");
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        registerButton.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        registerButton.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        registerButton.setMargin(new java.awt.Insets(2, 2, 2, 2));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(messageList);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(messageText, javax.swing.GroupLayout.DEFAULT_SIZE, 402, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sendButton))
                    .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nameLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(registerButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameLabel)
                    .addComponent(registerButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(messageText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sendButton))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        if (userAction.logout()) {
            Container parent = getParent();
            CardLayout card = (CardLayout) parent.getLayout();
            card.show(parent, "loginForm");
            messageList.clear();//delete all chat
        }
    }//GEN-LAST:event_registerButtonActionPerformed

    private void sendButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendButtonActionPerformed
        userAction.sendMessage(messageText.getText());
        messageText.setText("");
    }//GEN-LAST:event_sendButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private chatbot.client.view.MessageList messageList;
    private javax.swing.JTextField messageText;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JButton registerButton;
    private javax.swing.JButton sendButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    @Override
    public void onUserChanged(User user) {
        if(user!=null){
            nameLabel.setText(user.getName());
        }
        
    }

    @Override
    public void onMessageChanged(Message message) {
        messageList.addItem(message);
        updateUI();
    }
}
