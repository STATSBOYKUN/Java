/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package databasemhs;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MADOTO
 */
public class EntryPanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryPanel
     */
    public EntryPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        provinsiComboBox = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        membacaCheckBox = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        menyanyiCheckBox = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        berenangCheckBox = new javax.swing.JCheckBox();
        nimTextField = new javax.swing.JTextField();
        saveButton = new javax.swing.JButton();
        namaTextField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        umurSpinner = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        mahasiswaTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        provinsiComboBox1 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        membacaCheckBox1 = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        menyanyiCheckBox1 = new javax.swing.JCheckBox();
        jLabel13 = new javax.swing.JLabel();
        berenangCheckBox1 = new javax.swing.JCheckBox();
        nimTextField1 = new javax.swing.JTextField();
        saveButton1 = new javax.swing.JButton();
        namaTextField1 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        maleRadioButton1 = new javax.swing.JRadioButton();
        femaleRadioButton1 = new javax.swing.JRadioButton();
        jLabel15 = new javax.swing.JLabel();
        umurSpinner1 = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatTextArea1 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        mahasiswaTable2 = new javax.swing.JTable();

        jLabel3.setText("Jenis Kelamin :");

        jLabel4.setText("Umur :");

        provinsiComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "Sumatra Utara", "Sumatra Barat", "Riau", "Jambi", "Sumatra Selatan", "Bengkulu", "Lampung", "Kepulauan Bangka Belitung", "Kepulauan Riau", "Daerah Khusus Ibukota Jakarta", "Jawa Barat", "Jawa Tengah", "Daerah Istimewa Yogyakarta", "Jawa Timur", "Banten", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat", "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Kalimantan Utara", "Sulawesi Utara", "Sulawesi Tengah", "Sulawesi Selatan", "Sulawesi Tenggara", "Gorontalo", "Sulawesi Barat", "Maluku", "Maluku Utara", "Papua", "Papua Barat", "Papua Selatan", "Papua Tengah", "Papua Pegunungan", "Papua Barat Daya" }));

        jLabel5.setText("Alamat :");

        membacaCheckBox.setText("Membaca");

        jLabel6.setText("Provinsi :");

        menyanyiCheckBox.setText("Menyanyi");

        jLabel7.setText("Hobi : ");

        berenangCheckBox.setText("Berenang");

        saveButton.setText("Simpan");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("tahun");

        maleRadioButton.setText("Laki-laki");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        femaleRadioButton.setText("Perempuan");
        femaleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("NIM : ");

        umurSpinner.setModel(new javax.swing.SpinnerNumberModel(17, 10, 90, 1));

        jLabel2.setText("Nama :");

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane1.setViewportView(alamatTextArea);

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(mahasiswaTable);

        mahasiswaTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(mahasiswaTable1);

        jLabel9.setText("Jenis Kelamin :");

        jLabel10.setText("Umur :");

        provinsiComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "Sumatra Utara", "Sumatra Barat", "Riau", "Jambi", "Sumatra Selatan", "Bengkulu", "Lampung", "Kepulauan Bangka Belitung", "Kepulauan Riau", "Daerah Khusus Ibukota Jakarta", "Jawa Barat", "Jawa Tengah", "Daerah Istimewa Yogyakarta", "Jawa Timur", "Banten", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat", "Kalimantan Tengah", "Kalimantan Selatan", "Kalimantan Timur", "Kalimantan Utara", "Sulawesi Utara", "Sulawesi Tengah", "Sulawesi Selatan", "Sulawesi Tenggara", "Gorontalo", "Sulawesi Barat", "Maluku", "Maluku Utara", "Papua", "Papua Barat", "Papua Selatan", "Papua Tengah", "Papua Pegunungan", "Papua Barat Daya" }));

        jLabel11.setText("Alamat :");

        membacaCheckBox1.setText("Membaca");

        jLabel12.setText("Provinsi :");

        menyanyiCheckBox1.setText("Menyanyi");

        jLabel13.setText("Hobi : ");

        berenangCheckBox1.setText("Berenang");

        saveButton1.setText("Simpan");
        saveButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButton1ActionPerformed(evt);
            }
        });

        jLabel14.setText("tahun");

        maleRadioButton1.setText("Laki-laki");
        maleRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButton1ActionPerformed(evt);
            }
        });

        femaleRadioButton1.setText("Perempuan");
        femaleRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleRadioButton1ActionPerformed(evt);
            }
        });

        jLabel15.setText("NIM : ");

        umurSpinner1.setModel(new javax.swing.SpinnerNumberModel(17, 10, 90, 1));

        jLabel16.setText("Nama :");

        alamatTextArea1.setColumns(20);
        alamatTextArea1.setRows(5);
        jScrollPane2.setViewportView(alamatTextArea1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(berenangCheckBox1)
                    .addComponent(menyanyiCheckBox1)
                    .addComponent(provinsiComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(membacaCheckBox1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(saveButton1)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(femaleRadioButton1)
                            .addComponent(nimTextField1)
                            .addComponent(namaTextField1)
                            .addComponent(maleRadioButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(umurSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel14))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nimTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(namaTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(maleRadioButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleRadioButton1)
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(umurSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(provinsiComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(membacaCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menyanyiCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(berenangCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(saveButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mahasiswaTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis Kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(mahasiswaTable2);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();

        mhs.setNim(nimTextField.getText());

        mhs.setNama(namaTextField.getText());

        if(maleRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }

        if(femaleRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }

        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);

        mhs.setAlamat(alamatTextArea.getText());

        mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());

        ArrayList<String> hobiList = new ArrayList<>();
        if(membacaCheckBox.isSelected()){
            hobiList.add("membaca");
        }

        if(menyanyiCheckBox.isSelected()){
            hobiList.add("menyanyi");
        }

        if(berenangCheckBox.isSelected()){
            hobiList.add("berenang");
        }

        mhs.setHobi(hobiList);
        Database.getInstance().insertMahasiswa(mhs);
        clearForm();

        JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
        loadTableData();
    }//GEN-LAST:event_saveButtonActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(maleRadioButton.isSelected()){
            femaleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void femaleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButtonActionPerformed
        // TODO add your handling code here:
        if(femaleRadioButton.isSelected()){
            maleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_femaleRadioButtonActionPerformed

    private void saveButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButton1ActionPerformed
        // TODO add your handling code here:
        Mahasiswa mhs = new Mahasiswa();

        mhs.setNim(nimTextField.getText());

        mhs.setNama(namaTextField.getText());

        if(maleRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }

        if(femaleRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }

        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);

        mhs.setAlamat(alamatTextArea.getText());

        mhs.setProvinsi(provinsiComboBox.getSelectedItem().toString());

        ArrayList<String> hobiList = new ArrayList<>();
        if(membacaCheckBox.isSelected()){
            hobiList.add("membaca");
        }

        if(menyanyiCheckBox.isSelected()){
            hobiList.add("menyanyi");
        }

        if(berenangCheckBox.isSelected()){
            hobiList.add("berenang");
        }

        mhs.setHobi(hobiList);
        Database.getInstance().insertMahasiswa(mhs);
        clearForm();

        JOptionPane.showMessageDialog(this, "Sukses Tersimpan");
        loadTableData();
    }//GEN-LAST:event_saveButton1ActionPerformed
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel)mahasiswaTable.getModel();
        //refresh tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0); 
        }
        
        //isi tabel
        for(Mahasiswa mhs: Database.getInstance().getListMahasiswa()){
            dtm.addRow(new Object[]{mhs.getNim(),mhs.getNama(),mhs.getJenisKelamin(),mhs.getUmur()});
        }
    }
    
    private void clearForm(){
        nimTextField.setText("");
        namaTextField.setText(""); 
        maleRadioButton.setSelected(false);
        femaleRadioButton.setSelected(false);
        umurSpinner.setValue(15); 
        alamatTextArea.setText("");
        provinsiComboBox.setSelectedIndex(-1); 
        membacaCheckBox.setSelected(false); 
        menyanyiCheckBox.setSelected(false); 
        berenangCheckBox.setSelected(false);
    }
    
    private void maleRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(maleRadioButton.isSelected()){
            femaleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_maleRadioButton1ActionPerformed

    private void femaleRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(femaleRadioButton.isSelected()){
            maleRadioButton.setSelected(false);
        }
    }//GEN-LAST:event_femaleRadioButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JTextArea alamatTextArea1;
    private javax.swing.JCheckBox berenangCheckBox;
    private javax.swing.JCheckBox berenangCheckBox1;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JRadioButton femaleRadioButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JTable mahasiswaTable1;
    private javax.swing.JTable mahasiswaTable2;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JRadioButton maleRadioButton1;
    private javax.swing.JCheckBox membacaCheckBox;
    private javax.swing.JCheckBox membacaCheckBox1;
    private javax.swing.JCheckBox menyanyiCheckBox;
    private javax.swing.JCheckBox menyanyiCheckBox1;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField namaTextField1;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JTextField nimTextField1;
    private javax.swing.JComboBox<String> provinsiComboBox;
    private javax.swing.JComboBox<String> provinsiComboBox1;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton saveButton1;
    private javax.swing.JSpinner umurSpinner;
    private javax.swing.JSpinner umurSpinner1;
    // End of variables declaration//GEN-END:variables
}
