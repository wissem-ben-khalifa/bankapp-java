package projet_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main_Class extends JFrame implements ActionListener {
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b11;
   
    Compte compte;
    main_Class(Compte compte){
    	this.compte=compte;
    	
        ImageIcon ii1 = new ImageIcon(getClass().getResource("/bankbruh.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel image = new JLabel(ii3);
        image.setBounds(100,10,100,100);
        add(image);
        
        ImageIcon a1 = new ImageIcon(getClass().getResource("/cash-withdrawal.png"));
        Image a2 = a1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon a3 = new ImageIcon(a2);
        JLabel image1 = new JLabel(a3);
        image1.setBounds(20,250,100,100);
        add(image1);
        
        
        
        ImageIcon c1 = new ImageIcon(getClass().getResource("/deposit.png"));
        Image c2 = c1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon c3 = new ImageIcon(c2);
        JLabel image2 = new JLabel(c3);
        image2.setBounds(20,130,100,100);
        add(image2);
        
        ImageIcon d1 = new ImageIcon(getClass().getResource("/sold.png"));
        Image d2 = d1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon d3 = new ImageIcon(d2);
        JLabel image3 = new JLabel(d3);
        image3.setBounds(700,135,100,100);
        add(image3);
        
        ImageIcon e1 = new ImageIcon(getClass().getResource("/search.png"));
        Image e2 = e1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon e3 = new ImageIcon(e2);
        JLabel image4 = new JLabel(e3);
        image4.setBounds(700,235,100,100);
        add(image4);
        
        ImageIcon f1 = new ImageIcon(getClass().getResource("/money-transfer.png"));
        Image f2 = f1.getImage().getScaledInstance(70,70,Image.SCALE_DEFAULT);
        ImageIcon f3 = new ImageIcon(f2);
        JLabel image5 = new JLabel(f3);
        image5.setBounds(345,335,100,100);
        add(image5);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("xdxd.png"));
        Image i2 = i1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,850,480);
        add(l3);
        
        

        JLabel label = new JLabel("Veuillez sélectionner votre transaction");
        label.setBounds(230,50,550,40);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("System",Font.BOLD,28));
        l3.add(label);

        b1 = new JButton("DEPOSER") {
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
        b1.setContentAreaFilled(false);
        b1.setFocusPainted(false);
        b1.setFont(new Font("Raleway", Font.BOLD, 14));
        b1.setForeground(Color.WHITE);
        b1.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b1.setBounds(135, 170, 200, 35);
        b1.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b1.addActionListener(this);
        l3.add(b1);


        b2 = new JButton("RETIRER DE L'ARGENT") {
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
        b2.setContentAreaFilled(false);
        b2.setFocusPainted(false);
        b2.setFont(new Font("Raleway", Font.BOLD, 14));
        b2.setForeground(Color.WHITE);
        b2.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b2.setBounds(135, 260, 200, 35);
        b2.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b2.addActionListener(this);
        l3.add(b2);


        b3 = new JButton("TRANSFER") {
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
        b3.setContentAreaFilled(false);
        b3.setFocusPainted(false);
        b3.setFont(new Font("Raleway", Font.BOLD, 14));
        b3.setForeground(Color.WHITE);
        b3.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b3.setBounds(335, 310, 150, 35);
        b3.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b3.addActionListener(this);
        l3.add(b3);

        b4 = new JButton("HISTORIQUE") {
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
        b4.setContentAreaFilled(false);
        b4.setFocusPainted(false);
        b4.setFont(new Font("Raleway", Font.BOLD, 14));
        b4.setForeground(Color.WHITE);
        b4.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b4.setBounds(500, 260, 200, 35);
        b4.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b4.addActionListener(this);
        l3.add(b4);

        b6 = new JButton("VOIR LE SOLDE") {
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
        b6.setContentAreaFilled(false);
        b6.setFocusPainted(false);
        b6.setFont(new Font("Raleway", Font.BOLD, 14));
        b6.setForeground(Color.WHITE);
        b6.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b6.setBounds(500, 170, 200, 35);
        b6.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b6.addActionListener(this);
        l3.add(b6);


        b7 = new JButton("QUITTER") {
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
        b7.setContentAreaFilled(false);
        b7.setFocusPainted(false);
        b7.setFont(new Font("Raleway", Font.BOLD, 14));
        b7.setForeground(Color.WHITE);
        b7.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b7.setBounds(660, 340, 150, 35);
        b7.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b7.addActionListener(this);
        l3.add(b7);
        
        b11 = new JButton("PROFILE") {
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
        b11.setContentAreaFilled(false);
        b11.setFocusPainted(false);
        b11.setFont(new Font("Raleway", Font.BOLD, 14));
        b11.setForeground(Color.WHITE);
        b11.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b11.setBounds(330, 100, 150, 35);
        b11.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b11.addActionListener(this);
        l3.add(b11);

        
        b8 = new JButton("DÉCONNEXION") {
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
        b8.setContentAreaFilled(false);
        b8.setFocusPainted(false);
        b8.setFont(new Font("Raleway", Font.BOLD, 14));
        b8.setForeground(Color.WHITE);
        b8.setCursor(new Cursor(Cursor.HAND_CURSOR));
        b8.setBounds(660, 390, 150, 35);
        b8.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        b8.addActionListener(this);
        l3.add(b8);


        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
           new Deposit(compte);
            setVisible(false);
        }else if (e.getSource()==b7){
            System.exit(0);
        } else if (e.getSource()==b2) {
            new Withdrawl(compte);
            setVisible(false);
        } else if (e.getSource()==b6) {
            new BalanceEnquriy(compte);
            setVisible(false);
        }else if (e.getSource()==b3) {
            new trensfer(compte);
            setVisible(false); 
        } else if (e.getSource()==b4) {
            new mini(compte);
        }
        else if(e.getSource()==b8) {
        	new Login();
        	setVisible(false);
        }
        else if (e.getSource()==b11) {
        	new profile(compte);
        	setVisible(false);
        }
    }

    public static void main(String[] args) {
        
		new main_Class(null);
    }
}