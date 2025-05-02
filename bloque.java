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
import javax.swing.JPasswordField;

public class bloque extends JFrame implements ActionListener {
	
	adminn admin;
	JButton b2,b1,b3;
	JPasswordField p1;
	
	bloque(adminn admin){
		this.admin=admin;	
		
		
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("xdxd.png"));
        Image i2 = i1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,850,480);
        add(l3);
        
        JLabel label1 = new JLabel("bloque un compte");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 22));
        label1.setBounds(260,70,400,35);
        l3.add(label1);
        
        JLabel label2 = new JLabel("RIB de client: ");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD,18));
        label2.setBounds(220,145,150,35);
        l3.add(label2);

        p1 = new JPasswordField();
        p1.setForeground(Color.black);
        p1.setBounds(350,150,180,35);
        p1.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(p1);
        
        p1.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));
        
        
        b1 = new JButton("Bloqué") {
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
        b1.setBounds(485, 270, 200, 35);
        b1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b1.addActionListener(this);
        l3.add(b1);
        
        b3 = new JButton("Debloqué") {
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
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setFont(new Font("Arial", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setBounds(485, 320, 200, 35);
        b3.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b3.addActionListener(this);
        l3.add(b3);

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
        b2.setBounds(485, 365, 200, 35);
        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b2.addActionListener(this);
        l3.add(b2);
        
        
        
        
        setSize(850,480);
        setLayout(null);
        setLocation(450,200);
        setVisible(true);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
	

        try{

            String pin1 = p1.getText();
             if (e.getSource()==b2) {
                new main_Class_ADMIN(admin);
                setVisible(false);
                return;
            }
             else if(!pin1.matches("\\d+")  || Integer.parseInt(pin1)<0)  {
            	 JOptionPane.showMessageDialog(null, "Entrez seulement des numéros positive!");
            	 return;
            	 
             }

            

            
           
            if (e.getSource()==b1){
                if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"entre l' encien PIN");
                    return;
                }
                
                
                Connn c1 = new Connn();
                String q="select * from login where pin ='"+pin1+"'";
                
         
                ResultSet resultSet = c1.statement.executeQuery(q);
                
                
                
                if(!resultSet.next()) {
                	 JOptionPane.showMessageDialog(null,"le PIN n'exist pas");
                	 return;
                }
                
                
                
                else {
                	
                	String block =resultSet.getString("block"); 
                	if(block.equals("0")) {
                		JOptionPane.showMessageDialog(null,"le compte est deja bloqué");
                	}
                	else {
                		
		                Connn c = new Connn();
		                
		                String q1 = "update login set block = '0' where pin = '"+pin1+"'";
		
		                c.statement.executeUpdate(q1);;
		
		                JOptionPane.showMessageDialog(null,"compte a ete bloqué");
		                setVisible(false);
		                new main_Class_ADMIN(admin);
                }}

            }
            else if(e.getSource()==b3) {
            	if (p1.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"entre l' encien PIN");
                    return;
                }
                
                
                Connn c1 = new Connn();
                String q="select * from login where pin ='"+pin1+"'";
                
         
                ResultSet resultSet = c1.statement.executeQuery(q);
                
                
                
                if(!resultSet.next()) {
                	 JOptionPane.showMessageDialog(null,"le PIN n'exist pas");
                	 return;
                }
                
                
                
                else {
                	
                	String block =resultSet.getString("block"); 
                	if(block.equals("1")) {
                		JOptionPane.showMessageDialog(null,"le compte est deja debloqué");
                	}
                	else {
                		
		                Connn c = new Connn();
		                
		                String q1 = "update login set block = '1' where pin = '"+pin1+"'";
		
		                c.statement.executeUpdate(q1);
		
		                JOptionPane.showMessageDialog(null,"compte a ete debloqué");
		                setVisible(false);
		                new main_Class_ADMIN(admin);
            	
            	
            	
            }
                }
            }
               


        }catch (Exception E){
            E.printStackTrace();
        }



    }
	
	
	
	public static void main(String[] args) {
		new bloque(null);
		
	}

}
