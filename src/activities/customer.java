
package activities;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

public class customer extends javax.swing.JFrame {

   public String Name;
   public String CustomerID;
   public String Email;
   public double Transaction;
   private Connection con;
   
    public customer() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merchant","root","1234");  
        }catch(Exception ex){
            System.out.println(ex);
        }
        PreparedStatement quer;
        String name;
        String custid;
        String email = "";
        Double amount;
                String sql = "select * from customer;";
                try {
                    quer=con.prepareStatement(sql);
                    int i=1;
                    ResultSet rs = quer.executeQuery();
                    while(rs.next()){
                        name = rs.getString("name");
                        custid = rs.getString("custid");
                        amount = rs.getDouble("amount");
                        i++;
                        DefaultTableModel model = (DefaultTableModel) customertable.getModel();
                        model.addRow(new Object[]{name,email,custid,amount});
                    }
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        rightpanel = new javax.swing.JPanel();
        listofcustomertitle = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        customertable = new javax.swing.JTable();
        addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();
        inputnameTF = new javax.swing.JTextField();
        inputemailTF = new javax.swing.JTextField();
        inputcustomeridTF = new javax.swing.JTextField();
        inputnamelabel = new javax.swing.JLabel();
        inputemaillabel = new javax.swing.JLabel();
        inputcstmridlabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        inputamountlabel = new javax.swing.JLabel();
        inputamountTF = new javax.swing.JTextField();
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
            .addGap(0, 904, Short.MAX_VALUE)
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        mainpanel.add(toppanel, java.awt.BorderLayout.PAGE_START);

        rightpanel.setBackground(new java.awt.Color(204, 255, 204));
        rightpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 50, 50));

        listofcustomertitle.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        listofcustomertitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        listofcustomertitle.setText("List of Customer");

        customertable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email ID", "CustomerID", "amount"
            }
        ));
        jScrollPane1.setViewportView(customertable);

        addbutton.setText("Add");
        addbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbuttonActionPerformed(evt);
            }
        });

        deletebutton.setText("Delete");
        deletebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebuttonActionPerformed(evt);
            }
        });

        inputnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputnameTFActionPerformed(evt);
            }
        });

        inputemailTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputemailTFActionPerformed(evt);
            }
        });

        inputnamelabel.setText("Enter Name");

        inputemaillabel.setText("Enter Email");

        inputcstmridlabel.setText("Enter CustomerID");

        jLabel1.setFont(new java.awt.Font("MV Boli", 0, 14)); // NOI18N
        jLabel1.setText("Add New Customer");

        inputamountlabel.setText("Enter amount");

        javax.swing.GroupLayout rightpanelLayout = new javax.swing.GroupLayout(rightpanel);
        rightpanel.setLayout(rightpanelLayout);
        rightpanelLayout.setHorizontalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(listofcustomertitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addComponent(addbutton)
                        .addGap(18, 18, 18)
                        .addComponent(deletebutton))
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(inputnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(rightpanelLayout.createSequentialGroup()
                                .addComponent(inputemailTF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputcustomeridTF, javax.swing.GroupLayout.PREFERRED_SIZE, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(rightpanelLayout.createSequentialGroup()
                                .addComponent(inputemaillabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputcstmridlabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(inputamountlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        rightpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbutton, deletebutton});

        rightpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {inputamountTF, inputamountlabel, inputcstmridlabel, inputcustomeridTF, inputemailTF, inputemaillabel, inputnameTF, inputnamelabel});

        rightpanelLayout.setVerticalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addComponent(listofcustomertitle)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputcstmridlabel)
                    .addComponent(inputemaillabel)
                    .addComponent(inputnamelabel)
                    .addComponent(inputamountlabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputemailTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputcustomeridTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deletebutton)
                    .addComponent(addbutton))
                .addContainerGap())
        );

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
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        String name= inputnameTF.getText();
        String email= inputemailTF.getText();
        String custid= inputcustomeridTF.getText();
        String amount= inputamountTF.getText();
        if(name.isEmpty() || email.isEmpty() || custid.isEmpty() || amount.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter all fields","Try again", JOptionPane.ERROR_MESSAGE);
        }
        else{
            PreparedStatement quer;
                String sql = "insert into customer(name,custid,amount)values(?,?,?);";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, name);
                    quer.setString(2, custid);
                    quer.setString(3, amount);
                    quer.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            DefaultTableModel model = (DefaultTableModel) customertable.getModel();
            model.addRow(new Object[]{name,email,custid,amount});
            inputnameTF.setText("");
            inputemailTF.setText("");
            inputcustomeridTF.setText("");
            inputamountTF.setText("");
        }
        
    }//GEN-LAST:event_addbuttonActionPerformed

    private void inputemailTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputemailTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputemailTFActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        int row= customertable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"No Customer is selected! please Select one Customer","Select Row",JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) customertable.getModel();
            String customer = (String) model.getValueAt(row, 0);
            PreparedStatement quer;
                String sql = "DELETE from customer where name = ?";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, customer);
                    quer.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            model.removeRow(row);
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void inputnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputnameTFActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbutton;
    private javax.swing.JLabel agencylabel;
    private javax.swing.JPanel agencypanel;
    private javax.swing.JLabel customerlabel;
    private javax.swing.JPanel customerpanel;
    private javax.swing.JTable customertable;
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField inputamountTF;
    private javax.swing.JLabel inputamountlabel;
    private javax.swing.JLabel inputcstmridlabel;
    private javax.swing.JTextField inputcustomeridTF;
    private javax.swing.JTextField inputemailTF;
    private javax.swing.JLabel inputemaillabel;
    private javax.swing.JTextField inputnameTF;
    private javax.swing.JLabel inputnamelabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel listofcustomertitle;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JPanel mainpanel;
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
    // End of variables declaration//GEN-END:variables
}
