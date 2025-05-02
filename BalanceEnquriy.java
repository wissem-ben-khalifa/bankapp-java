package projet_java;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class BalanceEnquriy extends JFrame implements ActionListener {

    Compte compte;
    JLabel label2;
    JButton b1;
    BalanceEnquriy(Compte compte){
        this.compte=compte;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("xdxd.png"));
        Image i2 = i1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,850,480);
        add(l3);

        JLabel label1 = new JLabel("TON SOLDE EST : ");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(240,85,700,35);
        l3.add(label1);

        label2 = new JLabel();
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.CENTER_BASELINE, 16));
        label2.setBounds(260,135,400,35);
        l3.add(label2);

        b1 = new JButton("RETOUR") {
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
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setFont(new Font("Arial", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setBounds(350, 200, 150, 35);
        b1.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        b1.addActionListener(this);
        l3.add(b1);


        int balance =0;
        try{
            Connn c = new Connn();
            ResultSet resultSet = c.statement.executeQuery("Select * from bank where pin = '"+compte.getPin()+"'");
            while (resultSet.next()){
                if (resultSet.getString("type").equals("Deposit")){
                    balance += Integer.parseInt(resultSet.getString("amount"));
                }else {
                    balance -= Integer.parseInt(resultSet.getString("amount"));
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }


    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(compte);
    }

    public static void main(String[] args) {
        new BalanceEnquriy(null);
    }
}