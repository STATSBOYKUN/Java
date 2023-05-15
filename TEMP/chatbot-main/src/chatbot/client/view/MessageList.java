package chatbot.client.view;

import chatbot.client.model.Message;
import java.awt.Component;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mutaqin
 */
public class MessageList extends javax.swing.JPanel {

    private List<Message> messages;

    /**
     * Creates new form MessageList
     */
    public MessageList() {
        initComponents();
        this.messages = new ArrayList<>();
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
        for (Message message : messages) {
            this.addItem(message);
        }
    }
    public void clear(){
        Component[] components = listContainer.getComponents();
        for (Component component : components) {
            listContainer.remove(component);
        }
    }
    public void addItem(Message message) {
        MessageItem item = new MessageItem();
        item.setMessage(message);
        listContainer.add(item);
        updateUI();
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

        listContainer = new javax.swing.JPanel();

        listContainer.setLayout(new javax.swing.BoxLayout(listContainer, javax.swing.BoxLayout.PAGE_AXIS));
        add(listContainer);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel listContainer;
    // End of variables declaration//GEN-END:variables
}