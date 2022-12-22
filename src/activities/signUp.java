package activities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.LineBorder;

public class signUp extends JFrame implements ActionListener,MouseListener {
    private String Username,Name,Phone,Email,Address,GSTIN,pswrd,cnfmpswrd;
    private JLabel userName,signUp,name,cnfmPassword,phone,email,address,password,gstin,exit,l;
    private JTextField userNameTF,nameTF,phoneTF,emailTF,addressTF,gstinTF;
    private JPasswordField passwordF,cnfmPasswordF;
    private JPanel panel;
    private JButton signupbtn;
    private Connection con;

    public signUp()
    {
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
             con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merchant","root","1234");  
        }catch(Exception ex){
            System.out.println(ex);
        }
        setLayout(null);

        signUp = new JLabel("SIGNUP");
        signUp.setFont(new Font("Britannic Bold",Font.BOLD,40));
        signUp.setForeground(Color.yellow);
        signUp.setBounds(325,50,300,50);
        add(signUp);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setSize(700,400);
        panel.setBackground(new Color(0,0,0,30));
        panel.setBounds(50,100,700,400);
        add(panel);

        userName = new JLabel("Username");
        userName.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        userName.setForeground(Color.white);
        userName.setBounds(90,120,300,35);
        add(userName);


        name = new JLabel("Name");
        name.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        name.setForeground(Color.WHITE);
        name.setBounds(90,160,300,35);
        add(name);

        phone = new JLabel("Phone No.");
        phone.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        phone.setForeground(Color.WHITE);
        phone.setBounds(90,200,300,35);
        add(phone);

        email = new JLabel("Email Id");
        email.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        email.setForeground(Color.WHITE);
        email.setBounds(90,240,300,35);
        add(email);

        address = new JLabel("Address");
        address.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        address.setForeground(Color.WHITE);
        address.setBounds(90,280,300,35);
        add(address);

        gstin = new JLabel("GST");
        gstin.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        gstin.setForeground(Color.WHITE);
        gstin.setBounds(90,320,300,35);
        add(gstin);

        password = new JLabel("Password");
        password.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        password.setForeground(Color.WHITE);
        password.setBounds(90,360,300,35);
        add(password);

        cnfmPassword = new JLabel("Confirm Password");
        cnfmPassword.setFont(new Font("Copperplate Gothic Bold",Font.BOLD,25));
        cnfmPassword.setForeground(Color.WHITE);
        cnfmPassword.setBounds(90,400,300,35);
        add(cnfmPassword);
        

        userNameTF = new JTextField("");
        userNameTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        userNameTF.setBounds(380,60,300,30);


        nameTF = new JTextField("");
        nameTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        nameTF.setBounds(380,20,300,30);
        


        phoneTF = new JTextField("");
        phoneTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        phoneTF.setBounds(380,100,300,30);
        
        
        emailTF = new JTextField("");
        emailTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        emailTF.setBounds(380,140,300,30);
        
        
        addressTF = new JTextField("");
        addressTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        addressTF.setBounds(380,180,300,30);
        
        
        gstinTF = new JTextField("");
        gstinTF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        gstinTF.setBounds(380,220,300,30);
        
            
        passwordF = new JPasswordField("");
        passwordF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        passwordF.setBounds(380,260,300,30);
        
        
        cnfmPasswordF = new JPasswordField("");
        cnfmPasswordF.setFont(new Font("Times New Roman",Font.ITALIC,15));
        cnfmPasswordF.setBounds(380,300,300,30);
        
        
        signupbtn = new JButton("SignUp");
        signupbtn.setBounds(325,350,90,30);
        

        panel.add(userNameTF);
        panel.add(nameTF);
        panel.add(phoneTF);
        panel.add(emailTF);
        panel.add(addressTF);
        panel.add(gstinTF);
        panel.add(passwordF);
        panel.add(cnfmPasswordF);
        panel.add(signupbtn);

        // exit button
        exit = new JLabel("X");
        exit.setFont(new Font("Noto Sans",Font.BOLD,24));
        exit.setForeground(Color.WHITE);
        exit.setBounds(750,4,25,25);
        add(exit);
        exit.addMouseListener( this);

        //when mouse is on close button
        l= new JLabel();
        l.addMouseListener(this);
        add(l);
        
        //background
        ImageIcon background_image= new ImageIcon("C:\\Users\\LENOVO\\IdeaProjects\\merchant management system\\src\\5690588.jpg");
        Image img= background_image.getImage();
        Image temp_img= img.getScaledInstance(775,550,Image.SCALE_SMOOTH);
        background_image= new ImageIcon(temp_img);
        JLabel background= new JLabel("",background_image,JLabel.CENTER);
        background.setBounds(0,0,775,550);

        
        background.add(panel);
        add(background);

        this.setBounds(400,200,775,550);
        this.setUndecorated(true);
        setVisible(true);
        
        signupbtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Name = nameTF.getText();
                Username = userNameTF.getText();
                Phone = phoneTF.getText();
                Email = emailTF.getText();
                GSTIN = gstinTF.getText();
                Address = addressTF.getText();
                pswrd = passwordF.getText();
                cnfmpswrd = cnfmPasswordF.getText();
                PreparedStatement quer;
                String sql = "INSERT INTO userprofile(name,usernm,email,pass,address,phone,gst)VALUES(?,?,?,?,?,?,?)";
                try {
                    quer=con.prepareStatement(sql);
                    quer.setString(1, Name);
                    quer.setString(2,Username);
                    quer.setString(3,Email);
                    quer.setString(4, pswrd);
                    quer.setString(5, Address);
                    quer.setString(6, Phone);
                    quer.setString(7, GSTIN);
                    if(quer.executeUpdate()>0){
                        JOptionPane.showMessageDialog(signupbtn, "record added","Successfull", JOptionPane.INFORMATION_MESSAGE);
                        profile1 prof;
                        prof = new profile1();
                        prof.setVisible(true);
                        dispose();
                    }
                else {
                    JOptionPane.showMessageDialog(signupbtn, "wrong id or password","Error", JOptionPane.ERROR_MESSAGE);
                }
                }
                catch (SQLException ex) {
                    Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                userNameTF.setText("");
                phoneTF.setText("");
                emailTF.setText("");
                gstinTF.setText("");
                addressTF.setText("");
                passwordF.setText("");
                cnfmPasswordF.setText("");
                userNameTF.requestFocus();
            }
        });
    }


    @Override
    public void mouseClicked(MouseEvent e) {
        System.exit(0);
    }

    @Override
    public void mousePressed(MouseEvent e) {
       }

    @Override
    public void mouseReleased(MouseEvent e) {
        }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Close");
        l.setFont(new Font("Times New Roman",Font.PLAIN,10));
        l.setForeground(Color.WHITE);
        l.setBounds(745,28,50,12);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("");
        l.setBounds(745,28,50,12);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
