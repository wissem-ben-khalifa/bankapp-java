package projet_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {
  
   TextField textField;
    Compte compte;


   JButton b1, b2;
    Deposit( Compte compte){
    	this.compte=compte;
    	
       
     

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("xdxd.png"));
        Image i2 = i1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,850,480);
        add(l3);

        JLabel label1 = new JLabel("ENTREZ LE MONTANT QUE VOUS SOUHAITEZ DÉPOSER.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(190,125,450,40);
        l3.add(label1);

        textField = new TextField();
        textField.setForeground(Color.black);
        textField.setBounds(245,190,300,30);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);
        
        

        b1 = new JButton("Déposer") {
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
        b2.setBounds(430, 350, 200, 30);
        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b2.addActionListener(this);
        l3.add(b2);





        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    


    public void actionPerformed(ActionEvent e) {
    	if (compte == null) {
    	    JOptionPane.showMessageDialog(null, "Compte object is not initialized.");
    	    return;
    	}

        try {
            String amount = textField.getText();
            Date date = new Date();
            if (e.getSource()==b1){
                if (textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Veuillez entrer le montant que vous souhaitez déposer.");
                }
                else if(!amount.matches("\\d+") || Integer.parseInt(amount) <0) {
                	JOptionPane.showMessageDialog(null, " ecrire uniquement un nombre positive");
                }
                else {
                    Connn c = new Connn();
                    c.statement.executeUpdate("insert into bank values('"+compte.getPin()+"', '"+date+"','Deposit', '"+amount+"')");
                    JOptionPane.showMessageDialog(null,""+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_Class(compte);
                }
            }else if (e.getSource()==b2){
                setVisible(false);
                new main_Class(compte);
            }
        }catch (Exception E){
            E.printStackTrace();
        }

    }
    

    public static void main(String[] args) {
    	
        new Deposit(null);
    }
}