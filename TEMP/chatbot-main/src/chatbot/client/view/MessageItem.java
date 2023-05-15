package chatbot.client.view;

import chatbot.client.model.Message;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mutaqin
 */
public class MessageItem extends javax.swing.JPanel {

    private Message message;
    private Color green = new Color(204, 255, 204);
    private Color white = new Color(255, 255, 255);
    /**
     * Creates new form MessageItem
     */
    public MessageItem() {
        initComponents();
        itemContainer.setMinimumSize(new java.awt.Dimension(100, 20));
    }

    public void setMessage(Message message) {
        this.message = message;
        this.userLabel.setText(message.getName());
        
        this.contentText.setText(message.getContent());
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");    
        Date resultdate = new Date(message.getTime());
        this.timeLabel.setText(sdf.format(resultdate));
        if(message.isBot()){
            metaPanel.setBackground(white);
            contentText.setBackground(white);
        }else{
            metaPanel.setBackground(green);
            contentText.setBackground(green);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        itemContainer = new javax.swing.JPanel();
        metaPanel = new javax.swing.JPanel();
        userLabel = new javax.swing.JLabel();
        timeLabel = new javax.swing.JLabel();
        contentText = new javax.swing.JTextPane();

        itemContainer.setMinimumSize(new java.awt.Dimension(256, 64));
        itemContainer.setLayout(new javax.swing.BoxLayout(itemContainer, javax.swing.BoxLayout.PAGE_AXIS));

        metaPanel.setBackground(new java.awt.Color(255, 255, 255));
        metaPanel.setLayout(new java.awt.GridBagLayout());

        userLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        userLabel.setText("Chatbot");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        metaPanel.add(userLabel, gridBagConstraints);

        timeLabel.setText("10.10");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.weightx = 0.2;
        metaPanel.add(timeLabel, gridBagConstraints);

        itemContainer.add(metaPanel);

        contentText.setEditable(false);
        contentText.setBackground(new java.awt.Color(255, 255, 255));
        contentText.setContentType("text/html"); // NOI18N
        contentText.setMinimumSize(new java.awt.Dimension(100, 20));
        itemContainer.add(contentText);

        add(itemContainer);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextPane contentText;
    private javax.swing.JPanel itemContainer;
    private javax.swing.JPanel metaPanel;
    private javax.swing.JLabel timeLabel;
    private javax.swing.JLabel userLabel;
    // End of variables declaration//GEN-END:variables
}