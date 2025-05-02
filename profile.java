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
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class profile extends JFrame implements ActionListener {
	
	Compte compte;
	String r,nom,prenom,date,numero_telf,address,gender,email;
	JButton b2;
	public profile(Compte compte) {
		
		this.compte=compte;
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);
        
        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("11633989.png"));
        Image ii2 = ii1.getImage().getScaledInstance(200,200,Image.SCALE_REPLICATE);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image1 = new JLabel(ii3);
        image1.setBounds(530,10,300,300);
        add(image1);
        
        JLabel label = new JLabel("Ton profile :");
        label.setForeground(Color.red);
        label.setFont(new Font("System", Font.BOLD, 25));
        label.setBounds(350,30, 200, 35);
        add(label);

        try {
            Connn c = new Connn();
            String q = "select * from login where pin = '" + compte.getPin() + "'";
            ResultSet Result = c.statement.executeQuery(q);

            String form = null;
            if (Result.next()) {
                form = Result.getString("form_no");
            } else {
                throw new Exception("No matching record found in the login table for the provided pin.");
            }


            String q2 = "select * from signup where form_no = '" + form + "'";
            ResultSet Result2 = c.statement.executeQuery(q2);

            if (Result2.next()) {
                nom = Result2.getString("nom");
                prenom = Result2.getString("prenom");
                date = Result2.getString("date_anni");
                gender = Result2.getString("gender");
                email = Result2.getString("email");
                address = Result2.getString("address");
                numero_telf = Result2.getString("numero_telf");
            } else {
                throw new Exception("No matching record found in the signup table for the provided form number.");
            }

            JLabel label1 = new JLabel("mon:  "+nom);
            label1.setForeground(Color.WHITE);
            label1.setFont(new Font("System", Font.BOLD, 20));
            label1.setBounds(200, 85, 200, 35);
            add(label1);

            JLabel label2 = new JLabel("prenom:  "+prenom);
            label2.setForeground(Color.WHITE);
            label2.setFont(new Font("System", Font.BOLD, 20));
            label2.setBounds(200, 120, 200, 35);
            add(label2);
            
            JLabel label3 = new JLabel("date_anni  :  "+date);
            label3.setForeground(Color.WHITE);
            label3.setFont(new Font("System", Font.BOLD, 20));
            label3.setBounds(200, 160, 300, 35);
            add(label3);
            
            JLabel label4 = new JLabel("genre  :  "+gender);
            label4.setForeground(Color.WHITE);
            label4.setFont(new Font("System", Font.BOLD, 20));
            label4.setBounds(200, 200, 200, 35);
            add(label4);
            
            JLabel label5 = new JLabel("E_mail  :  "+email);
            label5.setForeground(Color.WHITE);
            label5.setFont(new Font("System", Font.BOLD, 20));
            label5.setBounds(200, 240, 400, 35);
            add(label5);
            
            JLabel label6 = new JLabel("address  :  "+address);
            label6.setForeground(Color.WHITE);
            label6.setFont(new Font("System", Font.BOLD, 20));
            label6.setBounds(200, 280, 200, 35);
            add(label6);
            
            JLabel label7 = new JLabel("numero de telf :  "+numero_telf);
            label7.setForeground(Color.WHITE);
            label7.setFont(new Font("System", Font.BOLD, 20));
            label7.setBounds(200, 320, 200, 35);
            add(label7);
            
            
            
            

        } catch (Exception E) {
            E.printStackTrace();
        }

        
        
		
        
        b2 = new JButton("RETOUR") {
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
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setFont(new Font("Arial", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setBounds(500, 350, 150, 35);
        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b2.addActionListener(this);
        add(b2);
        
        
        ImageIcon iii1 = new ImageIcon(getClass().getResource("/xdxd.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);
        
        setLayout(null);
        setSize(850,480);
        setLocation(360,40);
        setVisible(true);
		
	}
	
	 public void actionPerformed(ActionEvent e) {
	        if(e.getSource()==b2) {
	        	new main_Class(compte);
	        	setVisible(false);
	        }
	            
	        
	    }
	
	public static void main(String[] args) {
		new profile(null);
	}
	

}
