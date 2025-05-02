package projet_java;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

import javax.swing.*;

public class trensfer extends JFrame implements ActionListener {
	 JButton b1,b2;
	 Compte compte;
	 TextField textField;
	 JPasswordField p1,p2;
	    trensfer(Compte compte){
	    	this.compte=compte;
	    	
	        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("xdxd.png"));
	        Image i2 = i1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
	        ImageIcon i3 = new ImageIcon(i2);
	        JLabel l3 = new JLabel(i3);
	        l3.setBounds(0,0,850,480);
	        add(l3);
	        JLabel label1 = new JLabel("ecrire le pin/code _distination");
	        label1.setBounds(5,150,700,35);
	        label1.setForeground(Color.WHITE);
	        label1.setFont(new Font("System",Font.BOLD,23));
	        l3.add(label1);
	        
	        JLabel label2 = new JLabel("ecrire le montant ");
	        label2.setBounds(70,220,280,35);
	        label2.setForeground(Color.WHITE);
	        label2.setFont(new Font("System",Font.BOLD,23));
	        l3.add(label2);
	        
	        p2 = new JPasswordField();
	        p2.setForeground(Color.WHITE);
	        p2.setBounds(340,160,180,25);
	        p2.setFont(new Font("Raleway", Font.BOLD,22));
	        l3.add(p2);
	        
	        
	        
	        textField = new TextField();
	        textField.setForeground(Color.black);
	        textField.setBounds(350,220,180,30);
	        textField.setFont(new Font("Raleway", Font.BOLD,22));
	        l3.add(textField);
	        
	        
	        b1 = new JButton("ENVOYER") {
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
	        b1.setBounds(500, 290, 150, 35);
	        b1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
	        b1.addActionListener(this);
	        l3.add(b1);

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
	        b2.setBounds(500, 330, 150, 35);
	        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
	        b2.addActionListener(this);
	        l3.add(b2);

	        
	
			
		    setSize(850,480);
		    setLocation(450,200);
		    setLayout(null);
		    setVisible(true);
	    }
	    public void actionPerformed(ActionEvent e) {
	        if (e.getSource() == b1) {
	            try {
	                String destinationpin = p2.getText();
	                String amounttext = textField.getText();
	                int amount;

	                if (amounttext.isEmpty()) {
	                    JOptionPane.showMessageDialog(null, "Veuillez entrer le montant que vous voulez transférer.");
	                    return;
	                }
	                else if(!amounttext.matches("\\d+")  || !destinationpin.matches("\\d+")) {
	                	JOptionPane.showMessageDialog(null, "écrire uniquement des entiers");
	                	return;
	                	
	                }
	                

	                amount = Integer.parseInt(amounttext);
	                if (amount <= 0) {
	                    JOptionPane.showMessageDialog(null, "Le montant doit être supérieur à zéro.");
	                    return;
	                }

	                Connn c = new Connn();

	                
	                ResultSet destinationResult = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + destinationpin + "'");
	                if (!destinationResult.next()) {
	                    JOptionPane.showMessageDialog(null, "Le PIN/card_number destination n'existe pas.");
	                    return;
	                }

	             
	                ResultSet sourceResult = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + compte.getPin() + "'");
	                int sourceBalance = 0;
	                while (sourceResult.next()) {
	                    if (sourceResult.getString("type").equals("Deposit")) {
	                        sourceBalance += Integer.parseInt(sourceResult.getString("amount"));
	                    } else {
	                        sourceBalance -= Integer.parseInt(sourceResult.getString("amount"));
	                    }
	                }

	             
	                if (sourceBalance < amount) {
	                    JOptionPane.showMessageDialog(null, "Solde insuffisant.");
	                    return;
	                }

	                int destinationBalance = 0;
	                ResultSet destinationBalanceResult = c.statement.executeQuery("SELECT * FROM bank WHERE pin = '" + destinationpin + "'");
	                while (destinationBalanceResult.next()) {
	                    if (destinationBalanceResult.getString("type").equals("Deposit")) {
	                        destinationBalance += Integer.parseInt(destinationBalanceResult.getString("amount"));
	                    } else {
	                        destinationBalance -= Integer.parseInt(destinationBalanceResult.getString("amount"));
	                    }
	                }

	               
	                Date date = new Date();
	                c.statement.executeUpdate("INSERT INTO bank VALUES('" + compte.getPin() + "', '" + date + "', 'Withdrawal', '" + amount + "')");
	                c.statement.executeUpdate("INSERT INTO bank VALUES('" + destinationpin + "', '" + date + "', 'Deposit', '" + amount + "')");

	                JOptionPane.showMessageDialog(null, "Rs. " + amount + " transférés avec succès.");
	                setVisible(false);
	                new main_Class(compte);

	            } catch (Exception ex) {
	                ex.printStackTrace();
	                JOptionPane.showMessageDialog(null, "Erreur : " + ex.getMessage());
	            }
	        } else if (e.getSource() == b2) {
	            setVisible(false);
	            new main_Class(compte);
	        }
	    }

	    public static void main(String[] args) {
	        new trensfer(null);
	    }
	}



