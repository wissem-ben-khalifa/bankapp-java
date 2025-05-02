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
import java.sql.SQLException;

import javax.swing.*;

public class main_Class_ADMIN extends JFrame implements ActionListener {
	
	adminn admin;
	JLabel label1;
    JTextField textField2;
    JPasswordField passwordField3;
    JButton button1,button2,button3,b8,b4;
	
    
	main_Class_ADMIN(adminn admin){
		this.admin=admin;
		

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300,10,100,100);
        add(image);
        
        label1 = new JLabel("Bank_wiss");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        label1.setBounds(410,65,550,40);
        add(label1);
        
        ImageIcon a1 = new ImageIcon(ClassLoader.getSystemResource("voir client.png"));
        Image a2 = a1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image1 = new JLabel(a3);
        image1.setBounds(135,120,100,100);
        add(image1);
        
        ImageIcon b1 = new ImageIcon(ClassLoader.getSystemResource("update.png"));
        Image b2 = b1.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon b3 = new ImageIcon(b2);
        JLabel image2 = new JLabel(b3);
        image2.setBounds(550,120,100,100);
        add(image2);
        
        ImageIcon bbb4 = new ImageIcon(ClassLoader.getSystemResource("5133897.png"));
        Image bbb5 = bbb4.getImage().getScaledInstance(90,90,Image.SCALE_DEFAULT);
        ImageIcon bbb6 = new ImageIcon(bbb5);
        JLabel image4 = new JLabel(bbb6);
        image4.setBounds(320,270,100,100);
        add(image4);
        
        
        
        
        button1 = new JButton("voir tous les clients") {
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
    button1.setContentAreaFilled(false);
    button1.setFocusPainted(false);
    button1.setFont(new Font("Arial", Font.BOLD, 14));
    button1.setForeground(Color.WHITE);
    button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button1.setBounds(50,245,250, 30);
    button1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    button1.addActionListener(this);
    add(button1);

        
        button2 = new JButton("mettre a jour les information du client") {
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
    button2.setContentAreaFilled(false);
    button2.setFocusPainted(false);
    button2.setFont(new Font("Arial", Font.BOLD, 14));
    button2.setForeground(Color.WHITE);
    button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button2.setBounds(420,245,370, 30);
    button2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    button2.addActionListener(this);
    add(button2);
    
    b4 = new JButton("bloqué/debloqué un compte") {
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
    b4.setContentAreaFilled(false);
    b4.setFocusPainted(false);
    b4.setFont(new Font("Arial", Font.BOLD, 14));
    b4.setForeground(Color.WHITE);
    b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b4.setBounds(250,380,250, 30);
    b4.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    b4.addActionListener(this);
    add(b4);

        
        button3 = new JButton("QUITTER") {
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
    button3.setContentAreaFilled(false);
    button3.setFocusPainted(false);
    button3.setFont(new Font("Arial", Font.BOLD, 14));
    button3.setForeground(Color.WHITE);
    button3.setCursor(new Cursor(Cursor.HAND_CURSOR));
    button3.setBounds(600,385,200, 30);
    button3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    button3.addActionListener(this);
    add(button3);
        
        b8=new JButton("déconnexion") {
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
    b8.setContentAreaFilled(false);
    b8.setFocusPainted(false);
    b8.setFont(new Font("Arial", Font.BOLD, 14));
    b8.setForeground(Color.WHITE);
    b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
    b8.setBounds(600,340,200,35);
    b8.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
    b8.addActionListener(this);
    add(b8);
		
		
		
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
	        if (e.getSource()==button1){
	           try {
				new voir_info(admin);
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	            setVisible(false);
	        }else if (e.getSource()==button3){
	            System.exit(0);
	        }else if(e.getSource()==b8) {
	        	new ADMIN();
	        	setVisible(false);
	        }
	        else if(e.getSource()==b4) {
	        	new bloque(admin);
	        	setVisible(false);
	        }
	        else if (e.getSource()==button2) {
	            new change_info(admin);
	            setVisible(false);
	        }}
	 
	public static void main(String[] args) {
		new main_Class_ADMIN(null);
	}

}
