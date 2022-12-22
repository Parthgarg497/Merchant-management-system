
package activities;

import java.sql.*;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class stocklist extends javax.swing.JFrame {

    private Connection con;

    public stocklist() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merchant","root","1234");  
        }catch(Exception ex){
            System.out.println(ex);
        }
        PreparedStatement quer;
        String item;
        Double qnty;
        Double price;
                String sql = "select * from stocklist;";
                try {
                    quer=con.prepareStatement(sql);
                    int i=1;
                    ResultSet rs = quer.executeQuery();
                    while(rs.next()){
                        item = rs.getString("itemnm");
                        qnty = rs.getDouble("qnty");
                        price = rs.getDouble("price");
                        i++;
                        DefaultTableModel model = (DefaultTableModel) stocklisttable.getModel();
                        model.addRow(new Object[]{item,qnty,price});
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
        rightpanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        stocklisttable = new javax.swing.JTable();
        stocklabel = new javax.swing.JLabel();
        itemnamelabel = new javax.swing.JLabel();
        quantitylabel = new javax.swing.JLabel();
        pricelabel = new javax.swing.JLabel();
        itemnameTF = new javax.swing.JTextField();
        quantityTF = new javax.swing.JTextField();
        priceTF = new javax.swing.JTextField();
        addbutton = new javax.swing.JButton();
        deletebutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        mainpanel.setLayout(new java.awt.BorderLayout());

        toppanel.setBackground(new java.awt.Color(255, 204, 0));
        toppanel.setPreferredSize(new java.awt.Dimension(771, 60));

        javax.swing.GroupLayout toppanelLayout = new javax.swing.GroupLayout(toppanel);
        toppanel.setLayout(toppanelLayout);
        toppanelLayout.setHorizontalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        mainpanel.add(toppanel, java.awt.BorderLayout.PAGE_START);

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

        rightpanel.setBackground(new java.awt.Color(204, 255, 204));
        rightpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 50, 50));

        stocklisttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "price"
            }
        ));
        jScrollPane1.setViewportView(stocklisttable);

        stocklabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        stocklabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stocklabel.setText("Stock List");

        itemnamelabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        itemnamelabel.setText("Item name");

        quantitylabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        quantitylabel.setText("Quantity");

        pricelabel.setFont(new java.awt.Font("Segoe Print", 0, 18)); // NOI18N
        pricelabel.setText("Price");

        itemnameTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itemnameTFActionPerformed(evt);
            }
        });

        quantityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTFActionPerformed(evt);
            }
        });

        priceTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priceTFActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout rightpanelLayout = new javax.swing.GroupLayout(rightpanel);
        rightpanel.setLayout(rightpanelLayout);
        rightpanelLayout.setHorizontalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(rightpanelLayout.createSequentialGroup()
                            .addComponent(pricelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightpanelLayout.createSequentialGroup()
                            .addComponent(itemnamelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(itemnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(rightpanelLayout.createSequentialGroup()
                            .addComponent(addbutton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(deletebutton)))
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addComponent(quantitylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(stocklabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        rightpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {itemnameTF, itemnamelabel, priceTF, pricelabel, quantityTF, quantitylabel});

        rightpanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbutton, deletebutton});

        rightpanelLayout.setVerticalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rightpanelLayout.createSequentialGroup()
                .addComponent(stocklabel, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(itemnamelabel))
                        .addGap(61, 61, 61)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitylabel)
                            .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(pricelabel)
                            .addComponent(priceTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addbutton)
                            .addComponent(deletebutton))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        mainpanel.add(rightpanel, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
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

    private void quantityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTFActionPerformed

    }//GEN-LAST:event_quantityTFActionPerformed

    private void priceTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTFActionPerformed

    }//GEN-LAST:event_priceTFActionPerformed

    private void deletebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebuttonActionPerformed
        int row= stocklisttable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"No item is selected! please Select one item","Select Row",JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) stocklisttable.getModel();
            String item = (String) model.getValueAt(row, 0);
            PreparedStatement quer;
                String sql = "DELETE from stocklist where itemnm = ?";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, item);
                    quer.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            model.removeRow(row);
        }
    }//GEN-LAST:event_deletebuttonActionPerformed

    private void addbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbuttonActionPerformed
        String name= itemnameTF.getText();
        String quantity = quantityTF.getText();
        String price = priceTF.getText();
        if(name.isEmpty() || quantity.isEmpty() || price.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter all fields","Try again", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            PreparedStatement quer;
                String sql = "INSERT INTO stocklist(itemnm,qnty,price)VALUES(?,?,?)";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, name);
                    quer.setString(2,quantity);
                    quer.setString(3,price);
                    quer.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            DefaultTableModel model = (DefaultTableModel) stocklisttable.getModel();
            model.addRow(new Object[]{name,quantity,price});
            itemnameTF.setText("");
            quantityTF.setText("");
            priceTF.setText("");
        }
    }//GEN-LAST:event_addbuttonActionPerformed

    private void itemnameTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itemnameTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_itemnameTFActionPerformed

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
    private javax.swing.JButton deletebutton;
    private javax.swing.JTextField itemnameTF;
    private javax.swing.JLabel itemnamelabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JTextField priceTF;
    private javax.swing.JLabel pricelabel;
    private javax.swing.JLabel profilelabel;
    private javax.swing.JPanel profilepanel;
    private javax.swing.JLabel purchaseinvoicelabel;
    private javax.swing.JPanel purchaseinvoicepanel;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JLabel quantitylabel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel saleinvoicelabel;
    private javax.swing.JPanel saleinvoicepanel;
    private javax.swing.JLabel stocklabel;
    private javax.swing.JLabel stocklistlabel;
    private javax.swing.JPanel stocklistpanel;
    private javax.swing.JTable stocklisttable;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
