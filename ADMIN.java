package projet_java;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*;
public class ADMIN extends JFrame implements ActionListener {
	JLabel  label1,label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button2,button3,b4;
	
	ADMIN(){
		
		super ("interface admin");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300,10,100,100);
        add(image);
        
        ImageIcon a1 = new ImageIcon(getClass().getResource("/9703596.png"));
        Image a2 = a1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image1 = new JLabel(a3);
        image1.setBounds(20,30,100,100);
        add(image1);
        
        label1 = new JLabel("Bank_wiss");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        label1.setBounds(410,65,550,40);
        add(label1);
        
        label2 = new JLabel("Card numer_ADMIN:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(45,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD,14));
        add(textField2);
        
        textField2.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));
        
        
        
        label3 = new JLabel("PIN_ADMIN: ");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField3);
        
        passwordField3.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));
        
        button3 = new JButton("SIGN IN") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                if (getModel().isPressed()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.LIGHT_GRAY, getWidth(), getHeight(), Color.GRAY));
                } else {
                    g2d.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                }
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        button3.setContentAreaFilled(false);
        button3.setFocusPainted(false);
        button3.setFont(new Font("Arial", Font.BOLD, 14));
        button3.setForeground(Color.WHITE);
        button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button3.setBounds(300, 350, 230, 30);
        button3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button3.addActionListener(this);
        add(button3);

        
        button2 = new JButton("SUPPRIMER") {
        	protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;

                if (getModel().isPressed()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.RED, getWidth(), getHeight(), Color.RED));
                } else {
                    g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                }
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 20, 20);

                super.paintComponent(g);
            }
        };
        button2.setContentAreaFilled(false);
        button2.setFocusPainted(false);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setBounds(430, 300, 170, 30);
        button2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button2.addActionListener(this);
        add(button2);

        
        b4 = new JButton("RETOUR") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;

                if (getModel().isPressed()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.BLUE));
                } else {
                    g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                }

                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);
        b4.setFont(new Font("Arial", Font.BOLD, 14));
        b4.setForeground(Color.WHITE);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setBounds(570, 350, 130, 30);
        b4.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b4.addActionListener(this);
        add(b4);

        
        
        
        ImageIcon iii1 = new ImageIcon(getClass().getResource("/xdxd.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);
        
        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
        
		
		
		
	}
	
	
	public void actionPerformed(ActionEvent e) {
        try{
        	
        	if (e.getSource() == button2){
                textField2.setText("");
                passwordField3.setText("");
        	}
        	else if(e.getSource()==b4) {       		
        		new main_choose();
        		setVisible(false);
        	}
    
        	
        	else if((!textField2.getText().matches("\\d+") || !passwordField3.getText().matches("\\d+") || Integer.parseInt(textField2.getText())<0) || Integer.parseInt(passwordField3.getText())<0 ){
        		JOptionPane.showMessageDialog(null, "Entrez seulement des numéros positive!");
        		return;
        		
        	}
        	else if(e.getSource()==button3) {
        		Connn c= new Connn();
        		String cardno_admin = textField2.getText();
                String pin_admin = passwordField3.getText();
                String q = "select * from admin where card_number_admin = '"+cardno_admin+"' and  pin_admin = '"+pin_admin+"'";
                
                ResultSet resultSet = c.statement.executeQuery(q);
                
                if (resultSet.next()){
                	adminn admin=new adminn(cardno_admin,pin_admin);
                    setVisible(false);
                    new main_Class_ADMIN(admin);
                
                }
                else {
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number_admin or PIN_admin");
                }
        		
        	}
        	
        
        	
        }catch (Exception E){
            E.printStackTrace();
        }}
	public static void main(String[] args) {
        new ADMIN();
    }
}
