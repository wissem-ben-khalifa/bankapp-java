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

public class info_specifique extends JFrame implements ActionListener {
	JButton b1,b2;
	JLabel label1,label2,label3,label4;
	JTextField textfield;
	JPasswordField passwordField;
	adminn admin;
	String nom, prenom, date_de_naissance, gender, e_mail, civil, address, nacionalite, tlf, entite;
	String source,category,Revenu,code,message1,message2;
	info_specifique(adminn admin){
		this.admin=admin;
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300,10,100,100);
        add(image);
        
        label1 = new JLabel("entre le numero du card de client :");
        label1.setFont(new Font("Ralway", Font.BOLD, 28));
        label1.setForeground(Color.WHITE);
        label1.setBounds(10,130,575,30);
        add(label1);
        
        
        b1 = new JButton("Voir") {
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
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setBounds(430, 300, 200, 30);
        b1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b1.addActionListener(this);
        add(b1);

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
        b2.setBounds(430, 350, 200, 30);
        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b2.addActionListener(this);
        add(b2);
        
        label2 = new JLabel("RIB de client: ");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(130,250,375,30);
        add(label2);

        passwordField = new JPasswordField(15);
        passwordField.setBounds(325,250,230,30);
        passwordField.setFont(new Font("Arial", Font.BOLD, 14));
        add(passwordField);
        
        passwordField.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));
        

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
	        	
	            if (e.getSource()==b1){
	                Connn c = new Connn();
	                String pin = passwordField.getText();
	                String q = "select * from login where pin = '"+pin+"'";
	                ResultSet resultSet = c.statement.executeQuery(q);
	                String nom_f = null;
	                if (resultSet.next()) {
	                    nom_f = resultSet.getString("form_no");
	                }
	                else if(!passwordField.getText().matches("\\d+") || Integer.parseInt(passwordField.getText())<0 ) {
		        		JOptionPane.showMessageDialog(null,"Entrez seulement des numéros positive!");
		        		return;
		        		
		        	}
	                else {
	                    JOptionPane.showMessageDialog(null, "Aucun utilisateur trouvé pour ce PIN.");
	                    return; 
	                }
	                String q2="select * from signup where form_no = '"+nom_f+"'" ;
	                ResultSet resultSet2 = c.statement.executeQuery(q2);
	                
	                while (resultSet2.next()) {
	                	
	                	 nom = resultSet2.getString("nom");
	                     prenom  = resultSet2.getString("prenom");
	                     date_de_naissance = resultSet2.getString("date_anni");
	                     gender  = resultSet2.getString("gender");
	                     e_mail = resultSet2.getString("email");
	                     civil  = resultSet2.getString("marital_status");
	                     address = resultSet2.getString("address");
	                     nacionalite  = resultSet2.getString("nacio");
	                     tlf = resultSet2.getString("numero_telf");
	                     entite  = resultSet2.getString("entite");
	                }
	                    
	                	
	                String q3="select * from signuptwo where form_no = '"+nom_f+"'" ;
	                ResultSet resultSet3 = c.statement.executeQuery(q3);
	                
	                while (resultSet3.next()) {
	                	
	                	 source = resultSet3.getString("source");
	                	 category = resultSet3.getString("category");
	                	 Revenu = resultSet3.getString("Revenu");
	                	 code  = resultSet3.getString("cin");
	                	 message1 = resultSet3.getString("message1");
	                	 message2  = resultSet3.getString("message2");
	                     
	                }
	                new info(nom,prenom,date_de_naissance,gender,e_mail,civil,address,nacionalite,tlf,entite,source,category,Revenu,code,message1,message2);
	                setVisible(false);
	                
	                


	            }

	            else if (e.getSource() == b2){
	                new voir_info(admin);
	                setVisible(false);
	            }
	        }catch (Exception E){
	            E.printStackTrace();
	        }

	    }
	
	
	
	
	public static void main(String[] args) {
		new info_specifique(null);
	}
	
}
