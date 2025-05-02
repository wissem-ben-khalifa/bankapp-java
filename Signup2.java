package projet_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Random;

public class Signup2 extends JFrame implements ActionListener {
    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textP,textAadhar;
    JRadioButton r1,r2, e1,e2;
    JButton next;
    String formno,name,fname,dob,gender,email,marital,address,nacio,telf,identite;
    Signup2(String formno,String name,String fname,String dob,String gender,String email,String marital,String address,String nacio,String telf,String identite){
        super("APPLICATION FORM");
        this.name=name;
        this.fname=fname;
        this.dob=dob;
        this.gender=gender;
        this.email=email;
        this.marital=marital;
        this.address=address;
        this.nacio=nacio;
        this.telf=telf;
        this.identite=identite;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,5,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Informations financières");
        l1.setFont(new Font("Raleway", Font.BOLD,25));
        l1.setForeground(Color.white);
        l1.setBounds(300,30,600,40);
        add(l1);

        JLabel l3 = new JLabel("source de vos revenus :");
        l3.setFont(new Font("Raleway", Font.BOLD,18));
        l3.setForeground(Color.red);
        l3.setBounds(100,120,500,30);
        add(l3);

        String source_principale[] = {"Salarié", "Travailleur indépendant", "Entrepreneur", "Étudiant", "Retraité", "Autre"};
        comboBox = new JComboBox(source_principale);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,120,320,30);
        add(comboBox);

        JLabel l4 = new JLabel("Category du compte : ");
        l4.setFont(new Font("Raleway", Font.BOLD,18));
        l4.setForeground(Color.red);
        l4.setBounds(130,190,200,30);
        add(l4);

        String Category [] = {"compte courant","compte d'épargne"};
        comboBox2 = new JComboBox(Category);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox2.setBounds(350,190,320,30);
        add(comboBox2);

        JLabel l5 = new JLabel("Revenu par mois : ");
        l5.setFont(new Font("Raleway", Font.BOLD,18));
        l5.setForeground(Color.red);
        l5.setBounds(150,250,200,30);
        add(l5);

        String income [] = {"mois de 1m DT","entre 1m DT et 2m DT ", "entre 2m DT et 3 m DT", "plus que 3m  DT"};
        comboBox3 = new JComboBox(income);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox3.setBounds(350,250,320,30);
        add(comboBox3);

        JLabel l8 = new JLabel("CIN : ");
        l8.setForeground(Color.red);
        l8.setFont(new Font("Raleway", Font.BOLD,18));
        l8.setBounds(170,320,150,30);
        add(l8);

        textP = new JTextField();
        textP.setFont(new Font("Raleway", Font.BOLD,18));
        textP.setBounds(350,320,320,30);
        add(textP);

        


        JLabel l10 = new JLabel("Souhaitez-vous recevoir des notifications par SMS ou e-mail ? : ");
        l10.setFont(new Font("Raleway", Font.BOLD,22));
        l10.setForeground(Color.red);
        l10.setBounds(20,390,880,30);
        add(l10);

        r1 = new JRadioButton("SMS");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBounds(200,460,100,30);
        add(r1);
        r2 = new JRadioButton("e-mail");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBounds(350,460,100,30);
        add(r2);

        JLabel l11 = new JLabel("Préférez-vous recevoir vos relevés bancaires en ligne ou par courrier ? : ");
        l11.setFont(new Font("Raleway", Font.BOLD,22));
        l11.setForeground(Color.red);
        l11.setBounds(20,520,880,30);
        add(l11);

        e1 = new JRadioButton("en ligne");
        e1.setFont(new Font("Raleway", Font.BOLD,14));
        e1.setBounds(200,580,100,30);
        add(e1);
        e2 = new JRadioButton("courrier");
        e2.setFont(new Font("Raleway", Font.BOLD,14));
        e2.setBounds(350,580,100,30);
        add(e2);
        


        next = new JButton("SUIVANT") {
            
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                if (getModel().isPressed()) {
                    g2d.setPaint(new GradientPaint(0, 0, new Color(50, 50, 50), getWidth(), getHeight(), Color.BLACK));
                } else if (getModel().isRollover()) {
                    g2d.setPaint(new GradientPaint(0, 0, Color.DARK_GRAY, getWidth(), getHeight(), new Color(50, 50, 50)));
                } else {
                    g2d.setPaint(new GradientPaint(0, 0, Color.BLACK, getWidth(), getHeight(), new Color(30, 30, 30)));
                }
                g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
                super.paintComponent(g);
            }
        };
        next.setContentAreaFilled(false);
        next.setFocusPainted(false);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setForeground(Color.WHITE);
        next.setCursor(new Cursor(Cursor.HAND_CURSOR));
        next.setBounds(650,640,100,30);
        next.setBorder(BorderFactory.createEmptyBorder(5, 15, 5, 15));
        next.addActionListener(this);
        add(next);
        
        ImageIcon iii1 = new ImageIcon(getClass().getResource("/xdxd.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,800,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,800);
        add(iiimage);


        setLayout(null);
        setSize(850,750);
        setLocation(450,80);
        
        setVisible(true);
    }

  
    public void actionPerformed(ActionEvent e) {
        String rel = (String) comboBox.getSelectedItem();
        String cate = (String) comboBox2.getSelectedItem();
        String inc = (String) comboBox3.getSelectedItem();
        
        String code = textP.getText();
        
        String m1 = " ";
        if ((r1.isSelected())){
            m1 = "SMS";
        } else if (r2.isSelected()) {
            m1 ="e-mail";
        }
        String m2 = " ";
        if ((r1.isSelected())){
            m2 = "en ligne";
        } else if (r2.isSelected()) {
            m2 ="courrier";
        }

        try{
            if (textP.getText().equals("") ) {
                JOptionPane.showMessageDialog(null,"Remplissez tous les champs");               
            }
            else if(!code.matches("\\d+")  || Integer.parseInt(code) <0) {
            	JOptionPane.showMessageDialog(null, "Le code_CIN doit être un entier positive");
            	
            }
            else {
                Connn c = new Connn();
                String q = "insert into Signuptwo values('"+formno+"', '"+rel+"', '"+cate+"','"+inc+"','"+code+"','"+m1+"','"+m2+"')";
                c.statement.executeUpdate(q);
                Client client =new Client(
            			name,
            			fname,
            			dob,
            			telf,
                        code,
                        address,
                        gender,
                        email,
                        marital,
                        nacio,
                        identite,
                        cate,
                        inc,
                        m1,
                        m2
            			
            			);
                
                
           	 
                Connn c1 = new Connn();
                Random ran = new Random();
                long first7 = (ran.nextLong() % 90L) + 14099600L;
                String cardno = "" + Math.abs(first7);

                long first3 = (ran.nextLong() % 9000L)+ 1000L;
                String pin = "" + Math.abs(first3);

                String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"','1')";
        
                c1.statement.executeUpdate(q2);
                JOptionPane.showMessageDialog(null,"Card Number : "+cardno+"\n Pin : "+pin );
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
                
                
                
                
                new Deposit(compte);
                setVisible(false);
            }


        }catch (Exception E){
            E.printStackTrace();
        }


    }

    public static void main(String[] args) {
        new Signup2("","","","","","","","","","","");
    }
}