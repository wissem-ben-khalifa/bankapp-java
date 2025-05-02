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

import javax.swing.*;

public class main_choose extends JFrame implements ActionListener {
	
	JLabel label1;
	JButton button1,button2,b3;
	main_choose()
	{
		super("main_fact");
		
        ImageIcon i1 = new ImageIcon(getClass().getResource("/bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        
        label1 = new JLabel("Bank_wiss");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        label1.setBounds(460,65,550,40);
        add(label1);
        
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("admin.png"));
        Image ii2 = ii1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image1 = new JLabel(ii3);
        image1.setBounds(100,160,100,100);
        add(image1);
        
        ImageIcon iiii1 = new ImageIcon(ClassLoader.getSystemResource("client.png"));
        Image iiii2 = iiii1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon iiii3 = new ImageIcon(iiii2);
        JLabel image2 = new JLabel(iiii3);
        image2.setBounds(100,260,100,100);
        add(image2);
        
        JLabel label1 = new JLabel("CHOISIR ");
        label1.setForeground(Color.white);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 28));
        label1.setBounds(250,125,450,40);
        add(label1);
        
        button1 = new JButton("ADMIN") {
            protected void paintComponent(Graphics g) {
                Graphics2D g1 = (Graphics2D) g;
                if (getModel().isPressed()) {
                    g1.setPaint(new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g1.setPaint(new GradientPaint(0, 0, Color.LIGHT_GRAY, getWidth(), getHeight(), Color.GRAY));
                } else {
                    g1.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                }

                g1.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setBounds(250, 200, 300, 40);
        button1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button1.addActionListener(this);
        add(button1);

        
        button2 = new JButton("CLIENT") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2 = (Graphics2D) g;

                if (getModel().isPressed()) {
                    g2.setPaint(new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2.setPaint(new GradientPaint(0, 0, Color.LIGHT_GRAY, getWidth(), getHeight(), Color.GRAY));
                } else {
                    g2.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                }

                g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        button2.setContentAreaFilled(false);
        button2.setFocusPainted(false);
        button2.setFont(new Font("Arial", Font.BOLD, 14));
        button2.setForeground(Color.WHITE);
        button2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button2.setBounds(250, 300, 300, 40); 
        button2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button2.addActionListener(this);
        add(button2);


        
        b3 = new JButton("QUITTER") {
            protected void paintComponent(Graphics g) {
                Graphics2D g3 = (Graphics2D) g;

                if (getModel().isPressed()) {
                    g3.setPaint(new GradientPaint(0, 0, Color.RED, getWidth(), getHeight(), Color.RED));
                } else if (getModel().isRollover()) {
                    g3.setPaint(new GradientPaint(0, 0, Color.LIGHT_GRAY, getWidth(), getHeight(), Color.RED));
                } else {
                    g3.setPaint(new GradientPaint(0, 0, Color.RED, getWidth(), getHeight(), Color.RED));
                }

                g3.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setBounds(600, 350, 150, 35); 
        b3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b3.addActionListener(this);
        add(b3);

        
        
        
        
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
	            if (e.getSource()==button2){
	            	
	            	new Login();
	                setVisible(false);
	
	            }
	            else if (e.getSource()==button1) {
	            	new ADMIN();
	            	setVisible(false);
	            }
	            else if(e.getSource()==b3) {
	            	System.exit(0);
	            }
	        }catch (Exception E){
	            E.printStackTrace();
	        }}
	                            	 
	   public static void main(String[] args) {
	        new main_choose();
	    }
}

