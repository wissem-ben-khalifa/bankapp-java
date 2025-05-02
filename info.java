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

public class info extends JFrame implements ActionListener {
	JLabel label1;
	JComboBox comboBox1,comboBox2;
	JButton b2;
	String nom, prenom, date_de_naissance, gender, e_mail, civil, address, nacionalite, tlf, entite;
	String source,category,Revenu,code,message1,message2;
	adminn admin;
	
	info(String nom,String prenom, String date_de_naissance,String gender,String e_mail,String civil, String address, String nacionalite,String tlf,String entite,String source,String category,String Revenu,String code,String message1,String message2){
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(300,10,100,100);
        add(image);
        
        label1 = new JLabel("les information de clinet :");
        label1.setFont(new Font("Ralway", Font.BOLD, 28));
        label1.setForeground(Color.WHITE);
        label1.setBounds(10,130,575,30);
        add(label1);
        
        
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
        
        
       
        
        String [] info1= new String[5];
        	info1[0]="nom : "+nom+"     / prenom : "+prenom;
        	info1[1]=" date de naissance : "+date_de_naissance+"    / genre : "+gender;
        	info1[2]=" genre : "+gender+" e_mail : "+e_mail+"   / etat civil : "+civil;
        	info1[3]=" adresse : "+address+"    / nacionalite : "+nacionalite;
        	info1[4]="numero telphone : "+tlf+"   / piece d'entite : "+entite;
        	
        	comboBox1 = new JComboBox(info1);
            comboBox1.setFont(new Font("Raleway",Font.BOLD,18));
            comboBox1.setBounds(50,250,720,30);
            add(comboBox1);
            
            
            String [] info2= new String[3];
        	info2[0]="source : "+source+"     / category du compte : "+category;
        	info2[1]=" Revenu : "+Revenu+"    / code  postal : "+code ;
        	info2[2]=" recevoir des notifications : "+message1+"    / recevoir vos relevés bancaires : "+message2;
        
        	comboBox2 = new JComboBox(info2);
            comboBox2.setFont(new Font("Raleway",Font.BOLD,18));
            comboBox2.setBounds(50,300,720,30);
            add(comboBox2);

        

        
        

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
		 
	        if (e.getSource()==b2){
	        	try {
					new voir_info(admin);
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
	        	setVisible(false);
	        	
	        }
	        
	        }
	
	public static void main(String[] args) {
		new info("","","","","","","","","","","","","","","","");
	}

}
