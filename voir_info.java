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
import java.sql.SQLException;

import javax.swing.*;
public class voir_info extends JFrame implements ActionListener {
	JLabel label1,label2;
	JButton button1,button2;
	adminn admin;
	JComboBox comboBox;
	int j;
	
	voir_info(adminn admin) throws SQLException{
		this.admin=admin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300,10,100,100);
        add(image);
		
		
		
		label1 = new JLabel("les information des client :");
        label1.setFont(new Font("Ralway", Font.BOLD, 28));
        label1.setForeground(Color.WHITE);
        label1.setBounds(70,130,375,30);
        add(label1);
        
        Connn c= new Connn();
        String q0 = "SELECT COUNT(*) AS row_count FROM login";
        ResultSet countResult = c.statement.executeQuery(q0);
        int j = 0;
        if (countResult.next()) {
            j = countResult.getInt("row_count");
        }

        String q = "SELECT * FROM login";
        ResultSet resultSet = c.statement.executeQuery(q);

        String[] info = new String[j];
        int i = 0;

        while (resultSet.next()) {
            String pin = resultSet.getString("pin");
            String cardNumber = resultSet.getString("card_number");
            info[i] = "Client " + i + " --> PIN: " + pin + " / Card Number: " + cardNumber;
            i++;
        }
        JComboBox<String> comboBox = new JComboBox<>(info);
        comboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        comboBox.setBounds(20, 200, 720, 30);
        add(comboBox);

        
        button1 = new JButton("RETOUR") {
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
        button1.setContentAreaFilled(false);
        button1.setFocusPainted(false);
        button1.setFont(new Font("Arial", Font.BOLD, 14));
        button1.setForeground(Color.WHITE);
        button1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        button1.setBounds(620, 385, 130, 30);
        button1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("cherche les information specifique d'un client") {
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
        button2.setBounds(50, 385, 530, 30);
        button2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button2.addActionListener(this);
        add(button2);

		
		
		
		
		
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
	        	new main_Class_ADMIN(admin);
	        	setVisible(false);
	        	
	        }
	        else if (e.getSource()==button2) {
	        		new info_specifique(admin);
	        		setVisible(false);
	        		
	        	}
	        }
	
	public static void main(String[] args) throws SQLException {
	
			new voir_info(null);
	
	}
	

}
