package projet_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    Compte compte;
    TextField textField;

    JButton b1, b2;
    Withdrawl(Compte compte){
    	this.compte=compte;
  
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("xdxd.png"));
        Image i2 = i1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,850,480);
        add(l3);

      

        JLabel label2 = new JLabel("VEUILLEZ ENTRER VOTRE MONTANT");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 18));
        label2.setBounds(230,70,400,35);
        l3.add(label2);


        textField = new TextField();
        textField.setForeground(Color.black);
        textField.setBounds(230,150,320,25);
        textField.setFont(new Font("Raleway", Font.BOLD,22));
        l3.add(textField);
        

        b1 = new JButton("RETIRER DE L'ARGENT") {
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
        b1.setBounds(400, 200, 250, 35);
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
        b2.setBounds(400, 250, 150, 35);
        b2.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b2.addActionListener(this);
        l3.add(b2);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1) {
            try {
                String amount = textField.getText();
                Date date = new Date();
                if (textField.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Please enter the Amount you want to withdraw");
                }
                else if(!amount.matches("\\d+")  || Integer.parseInt(amount) <0) {
                	JOptionPane.showMessageDialog(null, "écrire uniquement des entiers positives");
                	
                }
                else {
                    Connn c = new Connn();
                    ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '" + compte.getPin() + "'");
                    int balance = 0;
                    while (resultSet.next()) {
                        if (resultSet.getString("type").equals("Deposit")) {
                            balance += Integer.parseInt(resultSet.getString("amount"));
                        } else {
                            balance -= Integer.parseInt(resultSet.getString("amount"));
                        }
                    }
                    if (balance < Integer.parseInt(amount)) {
                        JOptionPane.showMessageDialog(null, "Insuffient Balance");
                        return;
                    }

                    c.statement.executeUpdate("insert into bank values('" + compte.getPin() + "', '" + date + "', 'Withdrawl', '" + amount + "' )");
                    JOptionPane.showMessageDialog(null, "Rs. " + amount + " Debited Successfully");
                    setVisible(false);
                    new main_Class(compte);

                }
            } catch (Exception E) {

            }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_Class(compte);
        }
    }

    public static void main(String[] args) {
        new Withdrawl(null);
    }
}