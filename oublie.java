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

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;

public class oublie extends JFrame implements ActionListener {
	JLabel label1,label2;
	JTextField textEmail;
	JButton button1,b4;
	String cardno;
	
	
	oublie(String cardno){
		this.cardno=cardno;
		
		
		ImageIcon i1 = new ImageIcon(getClass().getResource("/bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        
       
        
        label1 = new JLabel("Bank_wiss");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        label1.setBounds(450,60,550,40);
        add(label1);
        
        JLabel labelEmail = new JLabel("ton adresse e-mail  :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setForeground(Color.white);
        labelEmail.setBounds(100,200,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,200,400,35);
        add(textEmail);
        
        textEmail.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));
        
        button1 = new JButton("ENVOYER") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;

                if (getModel().isPressed()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.DARK_GRAY));
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
        button1.setBounds(300, 300, 150, 30);
        button1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button1.addActionListener(this);
        add(button1);
        
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
        b4.setBounds(470, 300, 150, 30);
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
		
		try {
            if (e.getSource() == button1) {

                String address = textEmail.getText();
                

                
                    
                    Connn c = new Connn();
                    String q = "select * from login where card_number = '" + cardno + "'";
                
                    ResultSet resultSet = c.statement.executeQuery(q);
      
                    if (resultSet.next()) {
                    	String form =resultSet.getString("form_no");
                    	String pin=resultSet.getString("pin");
                    	String q1="select * from signup where form_no= '"+form+"'";
                    	ResultSet resultSet1 = c.statement.executeQuery(q1);
                    	if(resultSet1.next()) {
                    		
                    		String email=resultSet1.getString("email");
                    		if(!address.equals(email)) {
                    			JOptionPane.showMessageDialog(null, "cette email ne correspondent pas a cette compte");
                    			
                    		}
                    		else {
                    			  final String username = "wissembenkalifa456@gmail.com";
                    		        final String password = "ighf xwkf cnrw prkl";

                    		        String to = "wissembenkalifa456@gmail.com";

                    		        Properties props = new Properties();
                    		        props.put("mail.smtp.auth", "true");
                    		        props.put("mail.smtp.starttls.enable", "true");
                    		        props.put("mail.smtp.host", "smtp.gmail.com");
                    		        props.put("mail.smtp.port", "587");

                    		        Session session = Session.getInstance(props, new Authenticator() {
                    		            protected PasswordAuthentication getPasswordAuthentication() {
                    		                return new PasswordAuthentication(username, password);
                    		            }
                    		        });

                    		        try {
                    		            Message message = new MimeMessage(session);
                    		            message.setFrom(new InternetAddress(username));
                    		            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
                    		            message.setSubject("pin oublie");
                    		            message.setText("ton pin est "+pin);

                    		            Transport.send(message);
                    		            JOptionPane.showMessageDialog(null, "pin envoyer par email");
                    		            new Login();
                    		            setVisible(false);

                    		        } catch (MessagingException e1) {
                    		            e1.printStackTrace();
                    		        }
                    			
                    		}
                    		
                    	}
                    	
                    
                    }
                    
                    	
        }
            else if(e.getSource()==b4) {
            	new Login();
            	setVisible(false);
            }
            } catch (Exception E) {
            E.printStackTrace();
        }
		
		
		
	}
	
	
	
	public static void main(String[] args) {
        new oublie("");
    }





	
	

}
