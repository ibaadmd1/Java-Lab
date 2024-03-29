/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI;


import Model.User;
import Util.DatabaseConnector;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import static java.awt.SystemColor.text;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ibaad Mohammed
 */
public class ViewPanel extends javax.swing.JPanel {

    

    /**
     * Creates new form FormPanel
     */
    private ArrayList<User> users;
    private User selectedUser;
    
    
    public ViewPanel(User newUser) {
        initComponents();
        
        getData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        genderButton = new javax.swing.ButtonGroup();
        mainPanel = new javax.swing.JPanel();
        firstnameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        userTable = new javax.swing.JTable();
        saveUserbutton = new javax.swing.JButton();

        mainPanel.setBackground(new java.awt.Color(255, 255, 204));

        firstnameLabel.setText("Name");

        ageLabel.setText("Age :");

        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageFieldKeyPressed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        userTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Age"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(userTable);

        saveUserbutton.setText("Save");
        saveUserbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveUserbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                    .addComponent(deleteButton)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(editButton)
                                    .addGap(154, 154, 154))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                                    .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(firstnameLabel)
                                        .addComponent(ageLabel))
                                    .addGap(63, 63, 63)
                                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(195, 195, 195)))))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(saveUserbutton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deleteButton)
                            .addComponent(editButton))
                        .addGap(60, 60, 60)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(firstnameLabel))
                        .addGap(18, 18, 18)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLabel))
                        .addGap(63, 63, 63)
                        .addComponent(saveUserbutton))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(412, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(311, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldKeyPressed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please Select a new User", "Cannot delete", JOptionPane.ERROR_MESSAGE);
        return;
         }
        try {
        selectedUser = users.get( selectedIndex);
        DatabaseConnector.deleteUser(selectedUser);
        JOptionPane.showMessageDialog(null, "User Deleted", "Success", HEIGHT);
        clearFields();
        getData(); 
        } catch (Exception e) {
       JOptionPane.showMessageDialog( this,e.getMessage());
}
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        // TODO add your handling code here:
        int selectedIndex = userTable.getSelectedRow();
        if (selectedIndex == -1) {
        JOptionPane.showMessageDialog(this, "Please Select a new User", "Cannot edit", JOptionPane.ERROR_MESSAGE);
        return;
         }
        selectedUser = users.get( selectedIndex);
        firstnameField.setText(selectedUser.getName());
        ageField.setText(selectedUser.getAge());
    }//GEN-LAST:event_editButtonActionPerformed

    private void saveUserbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveUserbuttonActionPerformed
        // TODO add your handling code here:
        User newUser = new User();
        try {
       newUser.setAge (ageField.getText());
       newUser.setName (firstnameField.getText());
       DatabaseConnector.editUser(selectedUser, newUser);
       JOptionPane.showMessageDialog(null, "User Edit Successfull","Success",HEIGHT);
       clearFields();
       getData();
      } catch (Exception e) {
         JOptionPane.showMessageDialog(this,e.getMessage());
        }
    }//GEN-LAST:event_saveUserbuttonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.ButtonGroup genderButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JButton saveUserbutton;
    private javax.swing.JTable userTable;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        try {
          this.users = DatabaseConnector.getAllusers();
          DefaultTableModel model = (DefaultTableModel) userTable.getModel(); 
          model.setRowCount (0);
          for (User u : users) {
          Object[] row = new Object[3];
         
          row[0] = u.getId();
          row[1] = u.getName();
          row[2] = u.getAge();
         model.addRow(row);
         }
       clearFields();
} catch (Exception e) {
    JOptionPane.showMessageDialog(this,e.getMessage());
  }
 }
private void clearFields() {
firstnameField.setText("");
ageField.setText("");
selectedUser = null;
}

}
