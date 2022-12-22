
package activities;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class purchaseinvoice extends javax.swing.JFrame {

    private double TotalAmount;
    private Connection con;

    public purchaseinvoice() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merchant","root","1234");  
        }catch(Exception ex){
            System.out.println(ex);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainpanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        rightpanel = new javax.swing.JPanel();
        invoicelabel = new javax.swing.JLabel();
        invoicepanel = new javax.swing.JPanel();
        nameofagencylabel = new javax.swing.JLabel();
        invoicenumberlabel = new javax.swing.JLabel();
        paymentmethodlabel = new javax.swing.JLabel();
        gstinlabel = new javax.swing.JLabel();
        datelabel = new javax.swing.JLabel();
        totalamountlabel = new javax.swing.JLabel();
        nameofagencyTF = new javax.swing.JTextField();
        invoicenumberTF = new javax.swing.JTextField();
        gstinTF = new javax.swing.JTextField();
        totalamountTF = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        itemtable = new javax.swing.JTable();
        itemnamelabel = new javax.swing.JLabel();
        amountlabel = new javax.swing.JLabel();
        itemnameTF = new javax.swing.JTextField();
        amountTF = new javax.swing.JTextField();
        additembutton = new javax.swing.JButton();
        deleteitembutton = new javax.swing.JButton();
        quantitylabel = new javax.swing.JLabel();
        quantityTF = new javax.swing.JTextField();
        Date = new javax.swing.JComboBox<>();
        month = new javax.swing.JComboBox<>();
        Year = new javax.swing.JComboBox<>();
        PaymentMethod = new javax.swing.JComboBox<>();
        savebutton = new javax.swing.JButton();
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
            .addGap(0, 973, Short.MAX_VALUE)
        );
        toppanelLayout.setVerticalGroup(
            toppanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        mainpanel.add(toppanel, java.awt.BorderLayout.PAGE_START);

        rightpanel.setBackground(new java.awt.Color(204, 255, 204));
        rightpanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 50, 50, 50));

        invoicelabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        invoicelabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        invoicelabel.setText("Purchase Invoice");

        nameofagencylabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        nameofagencylabel.setText("Name of Agency");

        invoicenumberlabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        invoicenumberlabel.setText("Invoice Number");

        paymentmethodlabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        paymentmethodlabel.setText("Payment Method");

        gstinlabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        gstinlabel.setText("GSTIN");

        datelabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        datelabel.setText("Date");

        totalamountlabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        totalamountlabel.setText("Total Amount");

        nameofagencyTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameofagencyTFActionPerformed(evt);
            }
        });

        totalamountTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalamountTFActionPerformed(evt);
            }
        });

        itemtable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Quantity", "Amount"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(itemtable);

        itemnamelabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        itemnamelabel.setText("Item Name");

        amountlabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        amountlabel.setText("Amount");

        additembutton.setText("Add Item");
        additembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                additembuttonActionPerformed(evt);
            }
        });

        deleteitembutton.setText("Delete item");
        deleteitembutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteitembuttonActionPerformed(evt);
            }
        });

        quantitylabel.setFont(new java.awt.Font("Times New Roman", 2, 18)); // NOI18N
        quantitylabel.setText("Quantity");

        quantityTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityTFActionPerformed(evt);
            }
        });

        Date.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        month.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Jan", "Feb", "Mar", "Apr", "May", "June", "July", "Aug", "Sep", "Oct", "Nov", "Dec" }));

        Year.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030" }));
        Year.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                YearActionPerformed(evt);
            }
        });

        PaymentMethod.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cash", "NetBanking", "Credit" }));

        javax.swing.GroupLayout invoicepanelLayout = new javax.swing.GroupLayout(invoicepanel);
        invoicepanel.setLayout(invoicepanelLayout);
        invoicepanelLayout.setHorizontalGroup(
            invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(totalamountlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(totalamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(nameofagencylabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameofagencyTF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(invoicenumberlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invoicenumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(gstinlabel, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gstinTF, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(paymentmethodlabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addComponent(additembutton)
                        .addGap(150, 150, 150)
                        .addComponent(deleteitembutton))
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountlabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(itemnamelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(datelabel, javax.swing.GroupLayout.DEFAULT_SIZE, 105, Short.MAX_VALUE)
                            .addComponent(quantitylabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(invoicepanelLayout.createSequentialGroup()
                                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(Year, 0, 1, Short.MAX_VALUE))
                                .addComponent(quantityTF)
                                .addComponent(amountTF))
                            .addComponent(itemnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        invoicepanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {gstinTF, invoicenumberTF, nameofagencyTF});

        invoicepanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {amountlabel, datelabel, gstinlabel, itemnamelabel});

        invoicepanelLayout.setVerticalGroup(
            invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(invoicepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(invoicepanelLayout.createSequentialGroup()
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameofagencylabel)
                            .addComponent(nameofagencyTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoicenumberlabel)
                            .addComponent(invoicenumberTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(paymentmethodlabel)
                            .addComponent(PaymentMethod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gstinlabel)
                            .addComponent(gstinTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(datelabel)
                            .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(month, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(itemnamelabel)
                            .addComponent(itemnameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(quantitylabel)
                            .addComponent(quantityTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(amountlabel)
                            .addComponent(amountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(additembutton)
                            .addComponent(deleteitembutton))
                        .addGap(28, 28, 28)
                        .addGroup(invoicepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(totalamountlabel)
                            .addComponent(totalamountTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 365, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout rightpanelLayout = new javax.swing.GroupLayout(rightpanel);
        rightpanel.setLayout(rightpanelLayout);
        rightpanelLayout.setHorizontalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(invoicelabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(rightpanelLayout.createSequentialGroup()
                        .addGap(0, 11, Short.MAX_VALUE)
                        .addGroup(rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(savebutton)
                            .addComponent(invoicepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 12, Short.MAX_VALUE)))
                .addContainerGap())
        );
        rightpanelLayout.setVerticalGroup(
            rightpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(rightpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(invoicelabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(invoicepanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(savebutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addComponent(mainpanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void totalamountTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalamountTFActionPerformed
        
    }//GEN-LAST:event_totalamountTFActionPerformed

    private void nameofagencyTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameofagencyTFActionPerformed
        
    }//GEN-LAST:event_nameofagencyTFActionPerformed

    private void deleteitembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteitembuttonActionPerformed
        int row= itemtable.getSelectedRow();
        if(row<0){
            JOptionPane.showMessageDialog(this,"No item is selected! please Select one item","Select Row",JOptionPane.ERROR_MESSAGE);
        }
        else{
            DefaultTableModel model = (DefaultTableModel) itemtable.getModel();
            String item = (String) model.getValueAt(row, 0);
            Double q = (Double) model.getValueAt(row, 1);
            Double o = (Double) model.getValueAt(row, 2);
            PreparedStatement quer;
                String sql = "UPDATE stocklist SET qnty = qnty-? where itemnm = ?;";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, q.toString());
                    quer.setString(2, item);
                    quer.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    
                }
            TotalAmount -= (o*q);
            totalamountTF.setText(Double.toString(TotalAmount));
            model.removeRow(row);
        }
    }//GEN-LAST:event_deleteitembuttonActionPerformed

    private void additembuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_additembuttonActionPerformed
        String name= itemnameTF.getText();
        String amount = amountTF.getText();
        String quantity = quantityTF.getText();
        double Quant = 0;
        double Amount = 0;
        
        
        if(name.isEmpty() || amount.isEmpty() || quantity.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please Enter all fields","Try again", JOptionPane.ERROR_MESSAGE);
        }
        else
        {
            Quant = Double.parseDouble(quantity);
            Amount = Double.parseDouble(amount);
            PreparedStatement quer,quer1,quer2;
            ResultSet rs;
            String sql1 = "SELECT EXISTS(SELECT * from stocklist where itemnm=?);";
            try {
                quer1 = con.prepareStatement(sql1);
                quer1.setString(1, name);
                rs = quer1.executeQuery();
                boolean temp=false;
                while(rs.next())
                {
                    temp=rs.getBoolean(1);
                }
                if(temp){
                    try {
                        String sql = "UPDATE stocklist SET qnty = qnty+? where itemnm = ?;";
                        quer=con.prepareStatement(sql);
                        quer.setString(1, quantity);
                        quer.setString(2,name);
                        quer.executeUpdate();
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);                   
                    }
                }
                else{
                    String sql2 = "INSERT into stocklist(itemnm,qnty,price)values(?,?,?);";
                    try{
                        quer2 = con.prepareStatement(sql2);
                        quer2.setString(1, name);
                        quer2.setString(2, quantity);
                        quer2.setString(3, amount);
                        quer2.executeUpdate();
                    }
                    catch (SQLException ex) {
                        Logger.getLogger(purchaseinvoice.class.getName()).log(Level.SEVERE, null, ex);    
                    }
                }
            }
            catch (SQLException ex) {
                Logger.getLogger(purchaseinvoice.class.getName()).log(Level.SEVERE, null, ex);                    
            }
            
            DefaultTableModel model = (DefaultTableModel) itemtable.getModel();
            model.addRow(new Object[]{name,Quant,Amount});
            itemnameTF.setText("");
            amountTF.setText("");
            quantityTF.setText("");
        }
        TotalAmount += (Amount*Quant);
        totalamountTF.setText(Double.toString(TotalAmount));
    }//GEN-LAST:event_additembuttonActionPerformed

    private void quantityTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTFActionPerformed
        
    }//GEN-LAST:event_quantityTFActionPerformed

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        String agency = nameofagencyTF.getText();
        String gst = gstinTF.getText();
        PreparedStatement quer,quer1,quer2;
        ResultSet rs;
        String sql1 = "SELECT EXISTS(SELECT * from agency where name=?);";
        try {
            quer1 = con.prepareStatement(sql1);
            quer1.setString(1, agency);
            rs = quer1.executeQuery();
            boolean temp=false;
            while(rs.next())
            {
                temp=rs.getBoolean(1);
            }
            if(temp){
               String sql = "UPDATE agency SET amount = amount+? where name = ?;";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, totalamountTF.getText());
                    quer.setString(2, agency);
                    quer.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(purchaseinvoice.class.getName()).log(Level.SEVERE, null, ex);    
                } 
            }
            else{
                String sql2 = "INSERT into agency(name,gst,amount)values(?,?,?);";
                    try{
                quer2 = con.prepareStatement(sql2);
                quer2.setString(1, agency);
                quer2.setString(2, gst);
                quer2.setString(3, totalamountTF.getText());
                quer2.executeUpdate();
                }
                catch (SQLException ex) {
                    Logger.getLogger(purchaseinvoice.class.getName()).log(Level.SEVERE, null, ex);    
                }
            }
        }
        catch (SQLException ex) {
                    Logger.getLogger(purchaseinvoice.class.getName()).log(Level.SEVERE, null, ex);
                    
        }
        
        nameofagencyTF.setText("");
        invoicenumberTF.setText("");
        gstinTF.setText("");
        itemnameTF.setText("");
        quantityTF.setText("");
        amountTF.setText("");
        totalamountTF.setText("");
        DefaultTableModel model = (DefaultTableModel) itemtable.getModel();
        model.setRowCount(0);
        JOptionPane.showMessageDialog(this,"Saved succesfully","Invoice Saved", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_savebuttonActionPerformed

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

    private void YearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_YearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_YearActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Date;
    private javax.swing.JComboBox<String> PaymentMethod;
    private javax.swing.JComboBox<String> Year;
    private javax.swing.JButton additembutton;
    private javax.swing.JLabel agencylabel;
    private javax.swing.JPanel agencypanel;
    private javax.swing.JTextField amountTF;
    private javax.swing.JLabel amountlabel;
    private javax.swing.JLabel customerlabel;
    private javax.swing.JPanel customerpanel;
    private javax.swing.JLabel datelabel;
    private javax.swing.JButton deleteitembutton;
    private javax.swing.JTextField gstinTF;
    private javax.swing.JLabel gstinlabel;
    private javax.swing.JLabel invoicelabel;
    private javax.swing.JTextField invoicenumberTF;
    private javax.swing.JLabel invoicenumberlabel;
    private javax.swing.JPanel invoicepanel;
    private javax.swing.JTextField itemnameTF;
    private javax.swing.JLabel itemnamelabel;
    private javax.swing.JTable itemtable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JLabel logoutlabel;
    private javax.swing.JPanel logoutpanel;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JComboBox<String> month;
    private javax.swing.JTextField nameofagencyTF;
    private javax.swing.JLabel nameofagencylabel;
    private javax.swing.JLabel paymentmethodlabel;
    private javax.swing.JLabel profilelabel;
    private javax.swing.JPanel profilepanel;
    private javax.swing.JLabel purchaseinvoicelabel;
    private javax.swing.JPanel purchaseinvoicepanel;
    private javax.swing.JTextField quantityTF;
    private javax.swing.JLabel quantitylabel;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JLabel saleinvoicelabel;
    private javax.swing.JPanel saleinvoicepanel;
    private javax.swing.JButton savebutton;
    private javax.swing.JLabel stocklistlabel;
    private javax.swing.JPanel stocklistpanel;
    private javax.swing.JPanel toppanel;
    private javax.swing.JTextField totalamountTF;
    private javax.swing.JLabel totalamountlabel;
    // End of variables declaration//GEN-END:variables
}
