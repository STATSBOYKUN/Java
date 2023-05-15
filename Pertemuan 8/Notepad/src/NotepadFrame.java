
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.net.URI;
import javax.swing.JFileChooser;

/**
 *
 * @author MADOTO
 */
public class NotepadFrame extends javax.swing.JFrame {

    /**
     * Creates new form NotepadFrame
     */
    public NotepadFrame() {
        initComponents();
        MainTextArea.setText("Isi disini");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        scrollPane1 = new java.awt.ScrollPane();
        jFileChooser1 = new javax.swing.JFileChooser();
        MainTextArea = new java.awt.TextArea();
        KeteranganPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ProcessButton = new javax.swing.JButton();
        ClearButton = new javax.swing.JButton();
        SaveProcessButton = new javax.swing.JButton();
        JumlahKarakter = new javax.swing.JTextField();
        JumlahBaris = new javax.swing.JTextField();
        JumlahHurufVokal = new javax.swing.JTextField();
        JumlahHurufKonsonan = new javax.swing.JTextField();
        MenuBar = new javax.swing.JMenuBar();
        FileMenu = new javax.swing.JMenu();
        OpenMenuItem = new javax.swing.JMenuItem();
        SaveMenuItem = new javax.swing.JMenuItem();
        EditMenu = new javax.swing.JMenu();
        HelpMenu = new javax.swing.JMenu();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jFileChooser1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Notepad STIS");

        MainTextArea.setText("Isi text disini");

        jLabel1.setText("Jumlah Karakter");
        jLabel1.setAlignmentX(0.5F);

        jLabel2.setText("Jumlah Baris");
        jLabel2.setAlignmentX(0.5F);

        jLabel3.setText("Jumlah Huruf Vokal");
        jLabel3.setAlignmentX(0.5F);

        jLabel4.setText("Jumlah Huruf Konsonan");
        jLabel4.setAlignmentX(0.5F);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Keterangan");

        ProcessButton.setText("Prosess Text");
        ProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ProcessButtonActionPerformed(evt);
            }
        });

        ClearButton.setText("Clear Text Area");
        ClearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearButtonActionPerformed(evt);
            }
        });

        SaveProcessButton.setText("Save Process Text");
        SaveProcessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveProcessButtonActionPerformed(evt);
            }
        });

        JumlahKarakter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahKarakterActionPerformed(evt);
            }
        });

        JumlahBaris.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahBarisActionPerformed(evt);
            }
        });

        JumlahHurufVokal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahHurufVokalActionPerformed(evt);
            }
        });

        JumlahHurufKonsonan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JumlahHurufKonsonanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout KeteranganPanelLayout = new javax.swing.GroupLayout(KeteranganPanel);
        KeteranganPanel.setLayout(KeteranganPanelLayout);
        KeteranganPanelLayout.setHorizontalGroup(
            KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeteranganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(KeteranganPanelLayout.createSequentialGroup()
                        .addComponent(ProcessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SaveProcessButton, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(KeteranganPanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(KeteranganPanelLayout.createSequentialGroup()
                                .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(KeteranganPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JumlahBaris, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(KeteranganPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JumlahKarakter, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(30, 30, 30)
                                .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(KeteranganPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(JumlahHurufVokal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(KeteranganPanelLayout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JumlahHurufKonsonan, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        KeteranganPanelLayout.setVerticalGroup(
            KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(KeteranganPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(ClearButton)
                    .addComponent(SaveProcessButton)
                    .addComponent(ProcessButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addGap(7, 7, 7)
                .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JumlahKarakter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(JumlahHurufVokal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(KeteranganPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(JumlahBaris, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(JumlahHurufKonsonan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FileMenu.setText("File");

        OpenMenuItem.setText("Open");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(OpenMenuItem);

        SaveMenuItem.setText("Save");
        SaveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveMenuItemActionPerformed(evt);
            }
        });
        FileMenu.add(SaveMenuItem);

        MenuBar.add(FileMenu);

        EditMenu.setText("Edit");
        EditMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EditMenuMouseClicked(evt);
            }
        });
        EditMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditMenuActionPerformed(evt);
            }
        });
        MenuBar.add(EditMenu);

        HelpMenu.setText("Help");
        HelpMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HelpMenuMouseClicked(evt);
            }
        });
        HelpMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HelpMenuActionPerformed(evt);
            }
        });
        MenuBar.add(HelpMenu);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(KeteranganPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(MainTextArea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(MainTextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(KeteranganPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("Opening text...");
        
        // TODO add your handling code here: 
        if(jFileChooser1.showOpenDialog(this) ==  jFileChooser1.APPROVE_OPTION){
            FileInputStream fis = null;

            try {
                fis = new FileInputStream(jFileChooser1.getSelectedFile());
                String str = "";

                while(fis.available()>0){
                    str += (char) fis.read(); 
                }

                MainTextArea.setText(str); 
                fis.close();
                
                System.out.println("Mantapp file berhasil diload...");
            } catch (FileNotFoundException ex) {
                System.err.println("File tidak ditemukan"); 
            } catch (IOException ex) {
                System.err.println("File gagal dibaca");
            }
        }
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    private void SaveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveMenuItemActionPerformed
        // TODO add your handling code here:
        System.out.println("Saving text...");
        String text = MainTextArea.getText();
        
        System.out.println(text);
        
        File file = new File("notepad.txt");
        Writer notepad;
        
        try {
            notepad = new FileWriter(file);
            notepad.write(text);
            notepad.close();
            
            System.out.println("Notepad berhasil di save.");
        } catch (IOException ex){
            System.out.println("Error ngab");
        }   
    }//GEN-LAST:event_SaveMenuItemActionPerformed

    private void SaveProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveProcessButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("Saving text...");
        String text = MainTextArea.getText();
        
        System.out.println(text);
        
        File file = new File("notepad.txt");
        Writer notepad;
        
        try {
            notepad = new FileWriter(file);
            notepad.write(text);
            notepad.close();
            
            System.out.println("Notepad berhasil di save.");
        } catch (IOException ex){
            System.out.println("Error ngab");
        }  
    }//GEN-LAST:event_SaveProcessButtonActionPerformed

    private void JumlahKarakterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahKarakterActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahKarakterActionPerformed

    private void JumlahBarisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahBarisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahBarisActionPerformed

    private void JumlahHurufVokalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahHurufVokalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahHurufVokalActionPerformed

    private void JumlahHurufKonsonanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JumlahHurufKonsonanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JumlahHurufKonsonanActionPerformed

    private void jFileChooser1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFileChooser1ActionPerformed

    private void ProcessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ProcessButtonActionPerformed
        String text = MainTextArea.getText();
        JumlahKarakter.setText("" + text.length());

        String[] lines = text.split("\n");
        JumlahBaris.setText("" + lines.length);

        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : text.toLowerCase().toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            } else if (c >= 'a' && c <= 'z') {
                consonantCount++;
            }
        }
        
        JumlahHurufVokal.setText("" + vowelCount);
        JumlahHurufKonsonan.setText("" + consonantCount);
    }//GEN-LAST:event_ProcessButtonActionPerformed

    private void ClearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearButtonActionPerformed
        // TODO add your handling code here:
        MainTextArea.setText("");
    }//GEN-LAST:event_ClearButtonActionPerformed

    private void EditMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditMenuActionPerformed

    private void HelpMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HelpMenuActionPerformed
        
    }//GEN-LAST:event_HelpMenuActionPerformed

    private void HelpMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HelpMenuMouseClicked
        // TODO add your handling code here:
        try {
            Desktop.getDesktop().browse(new URI("https://www.wikihow.com/Use-Notepad"));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_HelpMenuMouseClicked

    private void EditMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EditMenuMouseClicked
        // TODO add your handling code here:
        MainTextArea.setCaretPosition(MainTextArea.getText().length());
    }//GEN-LAST:event_EditMenuMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(NotepadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NotepadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NotepadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NotepadFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NotepadFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ClearButton;
    private javax.swing.JMenu EditMenu;
    private javax.swing.JMenu FileMenu;
    private javax.swing.JMenu HelpMenu;
    private javax.swing.JTextField JumlahBaris;
    private javax.swing.JTextField JumlahHurufKonsonan;
    private javax.swing.JTextField JumlahHurufVokal;
    private javax.swing.JTextField JumlahKarakter;
    private javax.swing.JPanel KeteranganPanel;
    private java.awt.TextArea MainTextArea;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JButton ProcessButton;
    private javax.swing.JMenuItem SaveMenuItem;
    private javax.swing.JButton SaveProcessButton;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private java.awt.ScrollPane scrollPane1;
    // End of variables declaration//GEN-END:variables
}
