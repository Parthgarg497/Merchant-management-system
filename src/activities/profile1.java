
package activities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public class profile1 extends javax.swing.JFrame {

    private String Address,Email,GSTIN,Name,UserName,Phone,pass,prevUsername;
    private Connection con;
    
    
    public profile1() {
        initComponents();
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merchant","root","1234");  
        }catch(Exception ex){
            System.out.println(ex);
        }
        usernameTF.setText("name");
        nameTF.setText("Username");
        emailTF.setText("Email ID");
        passwordTF.setText("1234");
        addressTF.setText("adderess");
        phoneTF.setText("phone no.");
        gstinTF.setText("GSTIN");
        prevUsername = usernameTF.getText();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        rightpanel = new javax.swing.JPanel();
        editprofilelabel = new javax.swing.JLabel();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 20));
        usernamelabel = new javax.swing.JLabel();
        usernameTF = new javax.swing.JTextField();
        usernameseparator = new javax.swing.JSeparator();
        namelabel = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        nameseparator = new javax.swing.JSeparator();
        phonelabel = new javax.swing.JLabel();
        phoneTF = new javax.swing.JTextField();
        phoneseparator = new javax.swing.JSeparator();
        emaillabel = new javax.swing.JLabel();
        emailTF = new javax.swing.JTextField();
        emailseparator = new javax.swing.JSeparator();
        addresslabel = new javax.swing.JLabel();
        addressTF = new javax.swing.JTextField();
        addressseparator = new javax.swing.JSeparator();
        gstinlabel = new javax.swing.JLabel();
        gstinTF = new javax.swing.JTextField();
        gstinseparator = new javax.swing.JSeparator();
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 20));
        passwordlabel = new javax.swing.JLabel();
        passwordTF = new javax.swing.JPasswordField();
        passwordseparator = new javax.swing.JSeparator();
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 0), new java.awt.Dimension(20, 20));
        updatebutton = new javax.swing.JButton();
        leftpanel = new javax.swing.JPanel();
        profilepanel = new javax.swing.JPanel();
        profilelabel = new javax.swing.JLabel();
        saleinvoicepanel = new javax.swing.JPanel();
        saleinvoicelabel = new javax.swing.JLabel();
        purchaseinvoicepanel = new javax.swing.JPanel();
        purchaseinvoicelabel = new javax.swing.JLabel();
        stocklistpanel = new javax.swing.JPanel();
        stocklistlabel = new javax.swing.JLabel();
        agencypanel = new javax.swing.JPanel();
        agencylabel = new javax.swing.JLabel();
        logoutpanel = new javax.swing.JPanel();
        logoutlabel = new javax.swing.JLabel();
        customerpanel = new javax.swing.JPanel();
        customerlabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setLayout(new java.awt.BorderLayout());

        toppanel.setBackground(new java.awt.Color(255, 204, 0));
        toppanel.setPreferredSize(new java.awt.Dimension(771, 60));

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 871, Short.MAX_VALUE)
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        mainpanel.add(toppanel, java.awt.BorderLayout.PAGE_START);

        rightpanel.setBackground(new java.awt.Color(204, 255, 204));
        rightpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(50, 50, 50, 50));
        rightpanel.setLayout(new javax.swing.BoxLayout(rightpanel, javax.swing.BoxLayout.Y_AXIS));

        editprofilelabel.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        editprofilelabel.setText("EDIT PROFILE");
        editprofilelabel.setPreferredSize(new java.awt.Dimension(142, 42));
        rightpanel.add(editprofilelabel);
        rightpanel.add(filler1);

        usernamelabel.setText("Username");
        rightpanel.add(usernamelabel);

        usernameTF.setBackground(new java.awt.Color(204, 255, 204));
        usernameTF.setAlignmentX(0.0F);
        usernameTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        usernameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameTFActionPerformed(evt);
            }
        });
        rightpanel.add(usernameTF);

        usernameseparator.setAlignmentX(0.0F);
        usernameseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        usernameseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(usernameseparator);

        namelabel.setText("Name");
        rightpanel.add(namelabel);

        nameTF.setBackground(new java.awt.Color(204, 255, 204));
        nameTF.setAlignmentX(0.0F);
        nameTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        nameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameTFActionPerformed(evt);
            }
        });
        rightpanel.add(nameTF);

        nameseparator.setAlignmentX(0.0F);
        nameseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        nameseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(nameseparator);

        phonelabel.setText("Phone");
        rightpanel.add(phonelabel);

        phoneTF.setBackground(new java.awt.Color(204, 255, 204));
        phoneTF.setAlignmentX(0.0F);
        phoneTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        phoneTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneTFActionPerformed(evt);
            }
        });
        rightpanel.add(phoneTF);

        phoneseparator.setAlignmentX(0.0F);
        phoneseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        phoneseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(phoneseparator);

        emaillabel.setText("Email ID");
        rightpanel.add(emaillabel);

        emailTF.setBackground(new java.awt.Color(204, 255, 204));
        emailTF.setAlignmentX(0.0F);
        emailTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        emailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailTFActionPerformed(evt);
            }
        });
        rightpanel.add(emailTF);

        emailseparator.setAlignmentX(0.0F);
        emailseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        emailseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(emailseparator);

        addresslabel.setText("Address");
        rightpanel.add(addresslabel);

        addressTF.setBackground(new java.awt.Color(204, 255, 204));
        addressTF.setAlignmentX(0.0F);
        addressTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        addressTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressTFActionPerformed(evt);
            }
        });
        rightpanel.add(addressTF);

        addressseparator.setAlignmentX(0.0F);
        addressseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        addressseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(addressseparator);

        gstinlabel.setText("GSTIN");
        rightpanel.add(gstinlabel);

        gstinTF.setBackground(new java.awt.Color(204, 255, 204));
        gstinTF.setAlignmentX(0.0F);
        gstinTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        gstinTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gstinTFActionPerformed(evt);
            }
        });
        rightpanel.add(gstinTF);

        gstinseparator.setAlignmentX(0.0F);
        gstinseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        gstinseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(gstinseparator);

        filler2.setAlignmentX(0.0F);
        rightpanel.add(filler2);

        passwordlabel.setText("Password");
        rightpanel.add(passwordlabel);

        passwordTF.setBackground(new java.awt.Color(204, 255, 204));
        passwordTF.setAlignmentX(0.0F);
        passwordTF.setMaximumSize(new java.awt.Dimension(10000, 30));
        passwordTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passwordTFActionPerformed(evt);
            }
        });
        rightpanel.add(passwordTF);

        passwordseparator.setAlignmentX(0.0F);
        passwordseparator.setMaximumSize(new java.awt.Dimension(10000, 10));
        passwordseparator.setMinimumSize(new java.awt.Dimension(100, 0));
        rightpanel.add(passwordseparator);

        filler3.setAlignmentX(0.0F);
        rightpanel.add(filler3);

        updatebutton.setBackground(new java.awt.Color(255, 204, 0));
        updatebutton.setText("Update");
        updatebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebuttonActionPerformed(evt);
            }
        });
        rightpanel.add(updatebutton);

        mainpanel.add(rightpanel, java.awt.BorderLayout.CENTER);

        leftpanel.setBackground(new java.awt.Color(255, 204, 0));
        leftpanel.setPreferredSize(new java.awt.Dimension(150, 516));
        leftpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilepanel.setBackground(new java.awt.Color(255, 204, 0));
        profilepanel.setLayout(new java.awt.BorderLayout());

        profilelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profilelabel.setText("Profile");
        profilelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilelabelMouseClicked(evt);
            }
        });
        profilepanel.add(profilelabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(profilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 150, 50));

        saleinvoicepanel.setBackground(new java.awt.Color(255, 204, 0));
        saleinvoicepanel.setPreferredSize(new java.awt.Dimension(150, 50));
        saleinvoicepanel.setLayout(new java.awt.BorderLayout());

        saleinvoicelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        saleinvoicelabel.setText("Sale Invoice");
        saleinvoicelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                saleinvoicelabelMouseClicked(evt);
            }
        });
        saleinvoicepanel.add(saleinvoicelabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(saleinvoicepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 150, -1));

        purchaseinvoicepanel.setBackground(new java.awt.Color(255, 204, 0));
        purchaseinvoicepanel.setPreferredSize(new java.awt.Dimension(150, 50));
        purchaseinvoicepanel.setLayout(new java.awt.BorderLayout());

        purchaseinvoicelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        purchaseinvoicelabel.setText("Purchase Invoice");
        purchaseinvoicelabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseinvoicelabelMouseClicked(evt);
            }
        });
        purchaseinvoicepanel.add(purchaseinvoicelabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(purchaseinvoicepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 150, -1));

        stocklistpanel.setBackground(new java.awt.Color(255, 204, 0));
        stocklistpanel.setPreferredSize(new java.awt.Dimension(150, 50));
        stocklistpanel.setLayout(new java.awt.BorderLayout());

        stocklistlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stocklistlabel.setText("Stock List");
        stocklistlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                stocklistlabelMouseClicked(evt);
            }
        });
        stocklistpanel.add(stocklistlabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(stocklistpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 150, -1));

        agencypanel.setBackground(new java.awt.Color(255, 204, 0));
        agencypanel.setPreferredSize(new java.awt.Dimension(150, 50));
        agencypanel.setLayout(new java.awt.BorderLayout());

        agencylabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        agencylabel.setText("Agency");
        agencylabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                agencylabelMouseClicked(evt);
            }
        });
        agencypanel.add(agencylabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(agencypanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 200, 150, -1));

        logoutpanel.setBackground(new java.awt.Color(255, 204, 0));
        logoutpanel.setPreferredSize(new java.awt.Dimension(150, 50));
        logoutpanel.setLayout(new java.awt.BorderLayout());

        logoutlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoutlabel.setText("Logout");
        logoutlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutlabelMouseClicked(evt);
            }
        });
        logoutpanel.add(logoutlabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(logoutpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 150, -1));

        customerpanel.setBackground(new java.awt.Color(255, 204, 0));
        customerpanel.setLayout(new java.awt.BorderLayout());

        customerlabel.setBackground(new java.awt.Color(255, 204, 0));
        customerlabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        customerlabel.setText("Customer");
        customerlabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerlabelMouseClicked(evt);
            }
        });
        customerpanel.add(customerlabel, java.awt.BorderLayout.CENTER);

        leftpanel.add(customerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 150, 50));

        mainpanel.add(leftpanel, java.awt.BorderLayout.LINE_START);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 871, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilelabelMouseClicked
        profile1 p= new profile1();
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_profilelabelMouseClicked

    private void saleinvoicelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_saleinvoicelabelMouseClicked
        saleinvoice s = new saleinvoice();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_saleinvoicelabelMouseClicked

    private void purchaseinvoicelabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseinvoicelabelMouseClicked
        purchaseinvoice pi= new purchaseinvoice();
        pi.setVisible(true);
        dispose();
    }//GEN-LAST:event_purchaseinvoicelabelMouseClicked

    private void stocklistlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_stocklistlabelMouseClicked
        stocklist sl= new stocklist();
        sl.setVisible(true);
        dispose();
    }//GEN-LAST:event_stocklistlabelMouseClicked

    private void agencylabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_agencylabelMouseClicked
        agency ag= new agency();
        ag.setVisible(true);
        dispose();
    }//GEN-LAST:event_agencylabelMouseClicked

    private void logoutlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutlabelMouseClicked
        loginDemo l= new loginDemo();
        l.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutlabelMouseClicked

    private void customerlabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerlabelMouseClicked
        customer c= new customer();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_customerlabelMouseClicked

    private void updatebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebuttonActionPerformed
        
        UserName = usernameTF.getText();
        Address = addressTF.getText();
        Email= emailTF.getText();
        Phone= phoneTF.getText();
        Name= nameTF.getText();
        GSTIN= gstinTF.getText();
        pass = passwordTF.getText();
        if(UserName.isEmpty() || Address.isEmpty() || Email.isEmpty() || Phone.isEmpty() || Name.isEmpty()|| GSTIN.isEmpty()|| pass.isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter all fields","Try again", JOptionPane.ERROR_MESSAGE);
        }
        else{
            PreparedStatement insert;
            try {

                insert = con.prepareStatement("UPDATE userprofile SET name = ?, usernm = ?,email = ?, pass = ?,address =?,phone = ?,gst =? where usernm = ?;");
                insert.setString(1, Name);
                insert.setString(2, UserName);
                insert.setString(3, Email);
                insert.setString(4, pass);
                insert.setString(5, Address);
                insert.setString(6, Phone);
                insert.setString(7, GSTIN);
                insert.setString(8, prevUsername);
                insert.executeUpdate();
                JOptionPane.showMessageDialog(this, "Updated successfully","Successful", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (SQLException ex) {
                Logger.getLogger(profile1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }//GEN-LAST:event_updatebuttonActionPerformed

    private void gstinTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gstinTFActionPerformed
        
    }//GEN-LAST:event_gstinTFActionPerformed

    private void addressTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressTFActionPerformed
        
    }//GEN-LAST:event_addressTFActionPerformed

    private void emailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailTFActionPerformed
       
    }//GEN-LAST:event_emailTFActionPerformed

    private void phoneTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneTFActionPerformed
       
    }//GEN-LAST:event_phoneTFActionPerformed

    private void nameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameTFActionPerformed
        
    }//GEN-LAST:event_nameTFActionPerformed

    private void usernameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usernameTFActionPerformed

    }//GEN-LAST:event_usernameTFActionPerformed

    private void passwordTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passwordTFActionPerformed
        
    }//GEN-LAST:event_passwordTFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addressTF;
    private javax.swing.JLabel addresslabel;
    private javax.swing.JSeparator addressseparator;
    private javax.swing.JLabel agencylabel;
    private javax.swing.JPanel agencypanel;
    private javax.swing.JLabel customerlabel;
    private javax.swing.JPanel customerpanel;
    private javax.swing.JLabel editprofilelabel;
    private javax.swing.JTextField emailTF;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JSeparator emailseparator;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.JTextField gstinTF;
    private javax.swing.JLabel gstinlabel;
    private javax.swing.JSeparator gstinseparator;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField nameTF;
    private javax.swing.JLabel namelabel;
    private javax.swing.JSeparator nameseparator;
    private javax.swing.JPasswordField passwordTF;
    private javax.swing.JLabel passwordlabel;
    private javax.swing.JSeparator passwordseparator;
    private javax.swing.JTextField phoneTF;
    private javax.swing.JLabel phonelabel;
    private javax.swing.JSeparator phoneseparator;
    private javax.swing.JLabel profilelabel;
    private javax.swing.JPanel profilepanel;
    private javax.swing.JLabel purchaseinvoicelabel;
    private javax.swing.JPanel purchaseinvoicepanel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel saleinvoicelabel;
    private javax.swing.JPanel saleinvoicepanel;
    private javax.swing.JLabel stocklistlabel;
    private javax.swing.JPanel stocklistpanel;
    private javax.swing.JPanel toppanel;
    private javax.swing.JButton updatebutton;
    private javax.swing.JTextField usernameTF;
    private javax.swing.JLabel usernamelabel;
    private javax.swing.JSeparator usernameseparator;
    // End of variables declaration//GEN-END:variables
}
