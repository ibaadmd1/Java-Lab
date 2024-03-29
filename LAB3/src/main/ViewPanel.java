/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package main;


import main.User;
import java.awt.Color;
import java.awt.Component;
import java.awt.Image;
import static java.awt.SystemColor.text;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.JOptionPane;
import java.awt.image.BufferedImage;
import java.text.SimpleDateFormat;
import javax.imageio.ImageIO;
import static javax.management.Query.value;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import java.util.Calendar;
import javax.swing.ButtonModel;

/**
 *
 * @author Ibaad Mohammed
 */
public class ViewPanel extends javax.swing.JPanel {

    

    /**
     * Creates new form FormPanel
     */
    private User newUser;
    
    
    public ViewPanel(User newUser) {
        initComponents();
        this.newUser = newUser;
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
        titleLabel = new javax.swing.JLabel();
        firstnameLabel = new javax.swing.JLabel();
        lastnameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        genderLabel = new javax.swing.JLabel();
        firstnameField = new javax.swing.JTextField();
        lastnameField = new javax.swing.JTextField();
        ageField = new javax.swing.JTextField();
        maleButton = new javax.swing.JRadioButton();
        femaleButton = new javax.swing.JRadioButton();
        prefernotButton = new javax.swing.JRadioButton();
        emailLabel = new javax.swing.JLabel();
        emailField = new javax.swing.JTextField();
        messageLabel = new javax.swing.JLabel();
        MessagePanel = new javax.swing.JScrollPane();
        messageArea = new javax.swing.JTextArea();
        patientTypeLabel = new javax.swing.JLabel();
        typeCombo = new javax.swing.JComboBox<>();

        mainPanel.setBackground(new java.awt.Color(0, 204, 204));

        titleLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        titleLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titleLabel.setText("PATIENT VIEW FORM");

        firstnameLabel.setText("First Name:");

        lastnameLabel.setText("Last Name:");

        ageLabel.setText("Age :");

        genderLabel.setText("Gender:");

        ageField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ageFieldKeyPressed(evt);
            }
        });

        genderButton.add(maleButton);
        maleButton.setText("Male");
        maleButton.setActionCommand("Male User");
        maleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleButtonActionPerformed(evt);
            }
        });

        genderButton.add(femaleButton);
        femaleButton.setText("Female");
        femaleButton.setActionCommand("Female User");
        femaleButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                femaleButtonActionPerformed(evt);
            }
        });

        genderButton.add(prefernotButton);
        prefernotButton.setText("Prefer Not to Say");
        prefernotButton.setActionCommand("Prefer Not to Mention");

        emailLabel.setText("E-Mail :");

        messageLabel.setText("Message :");

        messageArea.setColumns(20);
        messageArea.setRows(5);
        MessagePanel.setViewportView(messageArea);

        patientTypeLabel.setText("Patient Type :");

        typeCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "In-Patient", "Out-Patient" }));
        typeCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                typeComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(firstnameLabel)
                            .addComponent(lastnameLabel)
                            .addComponent(ageLabel)
                            .addComponent(genderLabel)
                            .addComponent(emailLabel)
                            .addComponent(messageLabel)
                            .addComponent(patientTypeLabel))
                        .addGap(160, 160, 160)
                        .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maleButton)
                            .addComponent(firstnameField)
                            .addComponent(lastnameField)
                            .addComponent(prefernotButton)
                            .addComponent(femaleButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailField, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE)
                            .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(MessagePanel)
                            .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstnameLabel)
                    .addComponent(firstnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastnameLabel)
                    .addComponent(lastnameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLabel)
                    .addComponent(maleButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(femaleButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(prefernotButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(messageLabel)
                    .addComponent(MessagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(patientTypeLabel)
                    .addComponent(typeCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(305, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ageFieldKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ageFieldKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageFieldKeyPressed

    private void maleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleButtonActionPerformed

    }//GEN-LAST:event_maleButtonActionPerformed

    private void femaleButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_femaleButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_femaleButtonActionPerformed

    private void typeComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_typeComboActionPerformed
       
    }//GEN-LAST:event_typeComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane MessagePanel;
    private javax.swing.JTextField ageField;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField emailField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JRadioButton femaleButton;
    private javax.swing.JTextField firstnameField;
    private javax.swing.JLabel firstnameLabel;
    private javax.swing.ButtonGroup genderButton;
    private javax.swing.JLabel genderLabel;
    private javax.swing.JTextField lastnameField;
    private javax.swing.JLabel lastnameLabel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JRadioButton maleButton;
    private javax.swing.JTextArea messageArea;
    private javax.swing.JLabel messageLabel;
    private javax.swing.JLabel patientTypeLabel;
    private javax.swing.JRadioButton prefernotButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JComboBox<String> typeCombo;
    // End of variables declaration//GEN-END:variables

    private void getData() {
        firstnameField.setText(this.newUser.getName());
        lastnameField.setText(this.newUser.getLname());
        ageField.setText(this.newUser.getAge());
        emailField.setText(this.newUser.getEmail());
        messageArea.setText(this.newUser.getMessage());
        typeCombo.setSelectedItem(this.newUser.getType());
        //appointmentDate.setDate(dFormat.appointmentDate.getDate());
        
        try {
                ImageIcon originalImageIcon = new ImageIcon(this.newUser.getFilePath());
                Image originalImage = originalImageIcon.getImage();
//                Image resizedImage = originalImage.getScaledInstance(250, 250, Image.SCALE_IMAGE);
                Image resizedImage = originalImage.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
                ImageIcon resizedImageIcon = new ImageIcon(resizedImage);
//                uploadedImageIcon = resizedImageIcon;
                Imagedisplay.setIcon(resizedImageIcon);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        
        ButtonModel selectedRadioButton = genderButton.getSelection();
        if (selectedRadioButton != null){
            String selectedGender = selectedRadioButton.getActionCommand().toUpperCase();


            switch(selectedGender){
                case "MALE":
                    maleButton.setSelected(true);
                    break;
                case "FEMALE":
                    femaleButton.setSelected(true);
                    break;
                
            }

        }
           else {
              System.err.println("please select gender");
         }

    }
}
