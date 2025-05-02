package projet_java;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {
    JLabel label1, label2, label3;
    JTextField textField2;
    JPasswordField passwordField3;
    String nom, prenom, date,  telf,  cin, address, gender, email, marital,  nacio, entite, category, revenu , m1, m2;
    Compte compte;

    JButton button1,button2,button3,b4,b5;
    Login(){
        super("Bank Management System");
        ImageIcon i1 = new ImageIcon(getClass().getResource("/bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);
        
        ImageIcon a1 = new ImageIcon(getClass().getResource("/6009864.png"));
        Image a2 = a1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image1 = new JLabel(a3);
        image1.setBounds(20,30,100,100);
        add(image1);
        
        

        ImageIcon ii1 = new ImageIcon(getClass().getResource("/bruhhh.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,340,100,100);
        add(iimage);

        label1 = new JLabel("Bank_wiss");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 22));
        label1.setBounds(450,60,550,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setFont(new Font("Arial", Font.BOLD, 14)); 
        textField2.setForeground(Color.BLACK);
        textField2.setBackground(new Color(240, 240, 240));
        textField2.setBounds(325, 190, 230, 30); 


        textField2.setBorder(BorderFactory.createCompoundBorder(
            BorderFactory.createLineBorder(Color.GRAY, 5),  
            BorderFactory.createEmptyBorder(5, 10, 5, 10)  
        ));

        add(textField2);

        label3 = new JLabel("PIN: ");
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


        button1 = new JButton("SIGN IN") {
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
        button1.setBounds(300, 300, 100, 30);
        button1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button1.addActionListener(this);
        add(button1);


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
        button2.setBounds(430, 300, 150, 40); 
        button2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20)); 
        button2.addActionListener(this); 
        add(button2);


        button3 = new JButton("SIGN UP") {
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
        button3.setBounds(300, 350, 230, 40);
        button3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        button3.addActionListener(this);
        add(button3);

       
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
        b4.setBounds(660, 290, 130, 30);
        b4.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton("pin oublié") {
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;

                if (getModel().isPressed()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.GRAY, getWidth(), getHeight(), Color.green));
                } else {
                    g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), Color.DARK_GRAY));
                }

                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        b5.setContentAreaFilled(false);
        b5.setFocusPainted(false);
        b5.setFont(new Font("Arial", Font.BOLD, 14));
        b5.setForeground(Color.WHITE);
        b5.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b5.setBounds(660, 230, 130, 30);
        b5.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b5.addActionListener(this);
        add(b5);



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

                String cardno = textField2.getText();
                String pin = passwordField3.getText();

                if (!cardno.matches("\\d+") || !pin.matches("\\d+") || Integer.parseInt(pin)<0 || Integer.parseInt(cardno)<0) {
                    JOptionPane.showMessageDialog(null, "Entrez seulement des numéros posiitve!"); 
                } else {
                    
                    Connn c = new Connn();
                    String q = "select * from login where card_number = '" + cardno + "' and pin = '" + pin + "'";
                
                    ResultSet resultSet = c.statement.executeQuery(q);
                    
                    
                    

                    if (resultSet.next()) {
                    	String block =resultSet.getString("block");
                    	if(block.equals("0")) {
                    		JOptionPane.showMessageDialog(null, "ton comte est bloqué");
                    		
                    	}
                    	else {
                    	
                    	
	                    	String q0="select * from login  where pin='"+pin+"'";
	                        ResultSet resultSet0 = c.statement.executeQuery(q0);
	                         if(resultSet0.next()) {
		                        String form = resultSet0.getString("form_no");
		                        
	                      
	                    	   
	                    	   String q1="select *from signup where form_no= '"+form+"' ";
	                    	   ResultSet result1 = c.statement.executeQuery(q1);
	                    	   
	                    	                      
	                    	   if (result1.next()) {
	                    		   
	                    		   nom=result1.getString("nom");
		                    	   prenom=result1.getString("prenom");
		                           date=result1.getString("date_anni");
		                           gender=result1.getString("gender");
				                   email=result1.getString("email");
				                   marital=result1.getString("marital_status");
				                   address=result1.getString("address");
				                   nacio=result1.getString("nacio");
				                   telf=result1.getString("numero_telf");
				                   entite=result1.getString("entite");
				                   
	                    		    
	                               
	                    	   
	                    	   
		                    	   String q2="select * from signuptwo where form_no = '"+form+"'";
		                    	   ResultSet result2 = c.statement.executeQuery(q2);
		                    	   
	                    	   
		                    	   if (result2.next()) {
		                    		   
	                    		   
		                    		   cin =result2.getString("cin");
			                    	   category=result2.getString("category");
			                    	   revenu=result2.getString("Revenu");
			                    	   m1=result2.getString("message1");
			                    	   m2=result2.getString("message2");
			                    	   
	                    	   
	                    	   
	                    	   
	                    	   
	                    			   
	                    			   
	                    	   
	                    	   
	                    	   
	                       
		                        Client client= new Client(
		                    			   nom,
		                    			   prenom,
		                    			   date,
		                    			   telf,
		                    			   cin,
		                    			   address,
		                    			   gender,
		                    			   email,
		                    			   marital,
		                    			   nacio,
		                    			   entite,
		                    			   category,
		                    			   revenu,
		                    			   m1,
		                    			   m2
		                    			                       			 
		                    			   );
		                        
		                     
		                        
		                        Compte compte = new Compte(
		                    			   client.getnom(),
		                    			   client.getPrenom(),
		                    			   client.getDateNaissance(),
		                    			   client.getNumeroTelephone(),
		                    			   client.getCin(),
		                    			   client.getAdresse(),
		                    			   client.getGender(),
		                    			   client.getEmail(),
		                    			   client.getMarital_status(),
		                    			   client.getNacio(),
		                    			   client.getEntite(),
		                    			   client.getCategory(),
		                    			   client.getRevenu(),
		                    			   client.getMessage1(),
		                    			   client.getMessage2(),
		                    			   cardno,
		                    			   pin
		                    			   );
		                       
	                        
	                        
	                        
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
	                    	
		                    
	                        new main_Class(compte);
	                        setVisible(false);
                    }}}}} else {
                        JOptionPane.showMessageDialog(null, "Incorrect Card Number or PIN");
                    }
                }
            } else if (e.getSource() == button2) {
                textField2.setText("");
                passwordField3.setText("");
            } else if (e.getSource() == button3) {
                new Signup();
                setVisible(false);
            }
            else if(e.getSource()==b4) {
            	new main_choose();
            	setVisible(false);
            }
            else if(e.getSource()==b5) {
            	String cardno = textField2.getText();
            	new oublie(cardno);
            	setVisible(false);
            }
        } catch (Exception E) {
            E.printStackTrace();
        }
    }



  

    public static void main(String[] args) {
        new Login();
    }
}
