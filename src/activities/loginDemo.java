package activities;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.SQLException;




public class loginDemo extends JFrame implements MouseListener{
    private final JTextField t1;
    private final JTextField t2;
    private final JButton b1;
    private final JLabel l2;
    private final JLabel l4;
    private JPanel loginPanel;
    public String User,Pass;
    public String userNAME;
    Connection con;
    public loginDemo(){
        
        try{  
            Class.forName("com.mysql.cj.jdbc.Driver");  
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/merchant","root","1234");  
        }catch(Exception ex){
            System.out.println(ex);
        }
        
        setLayout(null);

        //login
        JLabel l1 = new JLabel("LOGIN");
        l1.setFont(new Font("Bahnschrift",Font.BOLD,40));
        l1.setForeground(Color.white);
        l1.setBounds(333,120,300,50);
        add(l1);

        // welcome
   
        l2= new JLabel("");
        l2.setBounds(400,240,300,30);
        add(l2);

        // exit button
        JLabel l3 = new JLabel("X");
        l3.setFont(new Font("Noto Sans",Font.BOLD,24));
        l3.setForeground(Color.WHITE);
        l3.setBounds(750,4,25,25);
        add(l3);
        l3.addMouseListener(this);

        //when mouse is on close button
        l4= new JLabel();
        l4.addMouseListener(this);
        add(l4);

        //login panel
        JPanel loginPanel= new JPanel();
        loginPanel.setLayout(null);
        loginPanel.setSize(500,350);
        loginPanel.setBackground(new Color(0,0,0,60));
        loginPanel.setBounds(215,175,360,300);


        //username
        t1= new JTextField("Username");
        t1.setFont(new Font("Times New Roman",Font.ITALIC,15));
        t1.setBounds(30,30,300,40);
        User = t1.getText();
        t1.addFocusListener(new FocusListener() {
            @Override
            public void focusGained(FocusEvent e) {
                if(t1.getText().equals("Username")){
                    t1.setText("");
                }

            }

            @Override
            public void focusLost(FocusEvent e) {
                if(t1.getText().equals("")){
                    t1.setText("Username");
                }

            }
        });

        //password
        t2= new JPasswordField("");
        t2.setFont(new Font("Times New Roman",Font.ITALIC,15));
        t2.setBounds(30,110,300,40);
        Pass = t2.getText();


        //login button
        b1= new JButton("Login");
        b1.setBounds(80,200,90,30);

        JButton b2 = new JButton("SignUp");
        b2.setBounds(200,200,90,30);

        loginPanel.add(t1);
        loginPanel.add(t2);
        loginPanel.add(b1);
        loginPanel.add(b2);

        //background
        ImageIcon background_image= new ImageIcon("5690588.jpg");
        Image img= background_image.getImage();
        Image temp_img= img.getScaledInstance(775,550,Image.SCALE_SMOOTH);
        background_image= new ImageIcon(temp_img);
        JLabel background= new JLabel("",background_image,JLabel.CENTER);
        background.setBounds(0,0,775,550);

        background.add(loginPanel);
        add(background);

        
        //login authentication
        b1.addActionListener((var ae) -> {
            PreparedStatement quer;
            ResultSet rs;
                    try {
                        userNAME = t1.getText();
                        String Pass = t2.getText();
                        quer=con.prepareStatement("SELECT EXISTS(SELECT * from userprofile where usernm=? && pass=?);");
                        quer.setString(1, userNAME);
                        quer.setString(2,Pass);
                        rs= quer.executeQuery();
                        boolean temp=false;
                        while(rs.next())
                        {
                            temp=rs.getBoolean(1);
                        }
                        if(temp) {
                            profile1 p= new profile1();
                            p.setVisible(true);
                            setVisible(false);
                        }
                        else {
                            JOptionPane.showMessageDialog(b1, "wrong id or password","Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } 
                    catch (SQLException ex) {
                        Logger.getLogger(loginDemo.class.getName()).log(Level.SEVERE, null, ex);
                    }
            
            
        });

        b2.addActionListener(e -> {
            new signUp();
            dispose();
        }
        );


        this.setBounds(400,200,775,550);
        this.setUndecorated(true);
        this.setVisible(true);

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
        l4.setText("Close");
        l4.setFont(new Font("Times New Roman",Font.PLAIN,10));
        l4.setForeground(Color.WHITE);
        l4.setBounds(745,28,50,12);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l4.setText("");
        l4.setBounds(745,28,50,12);
    }

}
