/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MainPackage;

import java.awt.Image;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Ibaad Mohammed
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        MainPanel = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        firstNameLabel = new javax.swing.JLabel();
        lastNameLabel = new javax.swing.JLabel();
        ageLabel = new javax.swing.JLabel();
        phoneNumberLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        phoneNumberTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        emailTextField = new javax.swing.JTextField();
        submitButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        photoLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 204, 0));

        MainPanel.setPreferredSize(new java.awt.Dimension(300, 300));

        titleLabel.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        titleLabel.setLabelFor(MainPanel);
        titleLabel.setText("User Details");
        titleLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        firstNameLabel.setText("First Name");

        lastNameLabel.setText("Last Name");

        ageLabel.setText("Age");

        phoneNumberLabel.setText("Phone Number");

        emailLabel.setText("Email");

        firstNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        phoneNumberTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        ageTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        lastNameTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        emailTextField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onSubmitButtonClick(evt);
            }
        });

        jButton1.setText("Upload Image");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onUploadButton(evt);
            }
        });

        photoLabel.setText("Choose File");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(titleLabel))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumberLabel)
                                    .addComponent(ageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phoneNumberTextField)
                                    .addComponent(ageTextField)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(firstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastNameLabel))
                                .addGap(18, 18, 18)
                                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(emailTextField)
                                    .addComponent(lastNameTextField)
                                    .addComponent(firstNameTextField)))
                            .addGroup(MainPanelLayout.createSequentialGroup()
                                .addComponent(photoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(MainPanelLayout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNameLabel)
                    .addComponent(firstNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lastNameLabel)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ageLabel)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumberLabel)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailLabel)
                    .addComponent(emailTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(photoLabel)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void onSubmitButtonClick(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onSubmitButtonClick
        User newObj = new User();
        newObj.setFirstName(firstNameTextField.getText());
        newObj.setLastName(lastNameTextField.getText());
        newObj.setAge(ageTextField.getText());
        newObj.setPhoneNumber(phoneNumberTextField.getText());
        newObj.setEmailId(emailTextField.getText());    
        
        String firstName = firstNameTextField.getText();
        String lastName = lastNameTextField.getText();
        String age = ageTextField.getText();
        String phoneNumber = phoneNumberTextField.getText();
        String email = emailTextField.getText();
        
        if (!firstName.trim().isEmpty() && !firstName.matches(".*\\d.*")) {
            newObj.setFirstName(firstName);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid first name. Please enter a non-empty name without digits.");
        return; 
        }

        if (!lastName.trim().isEmpty() && !lastName.matches(".*\\d.*")) {
            newObj.setLastName(lastName);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid last name. Please enter a non-empty name without digits.");
        return;
        }

        if (age.matches("\\d+")) {
            newObj.setAge(age);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid age input. Please enter a valid age.");
        return;
        }

        if (phoneNumber.matches("\\d{10}")) {
            newObj.setPhoneNumber(phoneNumber);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid phone number input. Please enter a 10-digit phone number.");
        return;
        }
        if (email.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$")) {
            newObj.setEmailId(email);
        } else {
            JOptionPane.showMessageDialog(this, "Invalid email input. Please enter a valid email address.");
        return;
        }
        
        String output = " Name: " + newObj.getFirstName() + " " + newObj.getLastName()
                + "\nAge: " + newObj.getAge() + "\nPhone Number: " + newObj.getPhoneNumber()+ "\nEmail ID: "
                + newObj.getEmailId();
                
        JOptionPane.showMessageDialog(null, output, "User Information", JOptionPane.PLAIN_MESSAGE, photoLabel.getIcon());       
    }//GEN-LAST:event_onSubmitButtonClick

    private void onUploadButton(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onUploadButton
JFileChooser file = new JFileChooser();
if (file.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
try {
BufferedImage img = ImageIO.read(file.getSelectedFile());
    Object edited_image = img.getScaledInstance(60, 80, Image.SCALE_SMOOTH);
    
if (edited_image != null) {
    
ImageIcon icon = new ImageIcon((Image) edited_image);
photoLabel.setIcon(icon);
} else {
throw new Exception();
}
} catch (Exception ex){
} 
}// TODO add your handling code here:
    }//GEN-LAST:event_onUploadButton

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel ageLabel;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JTextField emailTextField;
    private javax.swing.JLabel firstNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel lastNameLabel;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel phoneNumberLabel;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JLabel photoLabel;
    private javax.swing.JButton submitButton;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables

    private void getIcon() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
