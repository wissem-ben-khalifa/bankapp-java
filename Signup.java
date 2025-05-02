package projet_java;



import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup extends JFrame implements ActionListener {
    JRadioButton r1,r2,m1,m2,m3,m4;
    JButton next;
    JComboBox comboBox;

    JTextField textName ,textFname, textEmail,textAdd,textville,texttelf;
    JDateChooser dateChooser;
    Random ran = new Random();
    long first4 =(ran.nextLong() % 9000L) +1000L;
    String first = " " + Math.abs(first4);
    Signup(){
        super ("APPLICATION FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        JLabel label1 = new JLabel("welcome guys");
        label1.setBounds(160,20,600,40);
        label1.setForeground(Color.white);
        label1.setFont(new Font("Raleway",Font.BOLD,38));
        add(label1);

        JLabel label2 = new JLabel("information personnel");
        label2.setFont(new Font("Ralway",Font.BOLD, 22));
        label2.setForeground(Color.white);
        label2.setBounds(330,70,600,30);
        add(label2);

        

        JLabel labelName = new JLabel("Prénom :");
        labelName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelName.setForeground(Color.red);
        labelName.setBounds(100,190,100,30);
        add(labelName);
        

        textName = new JTextField();
        textName.setFont(new Font("Raleway",Font.BOLD, 14));
        textName.setBounds(300,190,400,35);
        add(textName);
        
        textName.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));


        JLabel labelfName = new JLabel("Nom de famille  :");
        labelfName.setFont(new Font("Raleway", Font.BOLD, 20));
        labelfName.setForeground(Color.red);
        labelfName.setBounds(100,240,200,30);
        add(labelfName);

        textFname = new JTextField();
        textFname.setFont(new Font("Raleway",Font.BOLD, 14));
        textFname.setBounds(300,240,400,35);
        add(textFname);
        
        textFname.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));


        JLabel DOB = new JLabel("Date de naissance :");
        DOB.setForeground(Color.red);
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100,340,200,30);
        add(DOB);

        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105,105,105));
        dateChooser.setBounds(300,340,400,30);
        add(dateChooser);

        JLabel labelG = new JLabel("Genre :");
        labelG.setFont(new Font("Raleway", Font.BOLD, 20));
        labelG.setForeground(Color.red);
        labelG.setBounds(100,290,200,30);
        add(labelG);

        r1 = new JRadioButton("Homme") {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (getModel().isPressed()) {
                    setBackground(Color.black); 
                } else if (getModel().isRollover()) {
                    setBackground(Color.blue); 
                } else {
                    setBackground(new Color(222, 255, 228)); 
                }
            }
        };
        r1.setFont(new Font("Raleway", Font.BOLD, 14));  
        r1.setBackground(new Color(222, 255, 228));   
        r1.setBounds(300, 290, 200, 30);               
        r1.setFocusPainted(false); 
        r1.setCursor(new Cursor(HAND_CURSOR));	
        r1.setOpaque(true);                             
        add(r1);

        r2 = new JRadioButton("Femme") {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (getModel().isPressed()) {
                    setBackground(Color.BLACK); 
                } else if (getModel().isRollover()) {
                    setBackground(Color.red); 
                } else {
                    setBackground(new Color(222, 255, 228)); 
                }
            }
        };
        r2.setFont(new Font("Raleway", Font.BOLD, 14));  
        r2.setBackground(new Color(222, 255, 228));    
        r2.setBounds(500, 290, 200, 30);              
        r2.setFocusPainted(false);                     
        r2.setOpaque(true); 
        r2.setCursor(new Cursor( HAND_CURSOR));
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);


        JLabel labelEmail = new JLabel("Adresse e-mail  :");
        labelEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        labelEmail.setForeground(Color.red);
        labelEmail.setBounds(100,390,200,30);
        add(labelEmail);

        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway",Font.BOLD, 14));
        textEmail.setBounds(300,390,400,35);
        add(textEmail);
        
        textEmail.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));



        JLabel labelMs = new JLabel("État civil :");
        labelMs.setFont(new Font("Raleway", Font.BOLD, 20));
        labelMs.setForeground(Color.red);
        labelMs.setBounds(100,440,200,30);
        add(labelMs);
        
        

        m1 = new JRadioButton("Marié(e)");
        m1.setBounds(300,440,100,30);
        m1.setBackground(new Color(222,255,228));
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        m1.setCursor(new Cursor(HAND_CURSOR));	
        add(m1);

        m2 = new JRadioButton("Célibataire");
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(440,440,100,30);
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        m2.setCursor(new Cursor(HAND_CURSOR));	
        add(m2);
        
        m4 = new JRadioButton(" Divorcé(e)");
        m4.setBackground(new Color(222,255,228));
        m4.setBounds(575,440,120,30);
        m4.setFont(new Font("Raleway", Font.BOLD,14));
        m4.setCursor(new Cursor(HAND_CURSOR));	
        add(m4);

        m3 = new JRadioButton("autre");
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(720,440,100,30);
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        m3.setCursor(new Cursor(HAND_CURSOR));	
        add(m3);

        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);
        buttonGroup1.add(m4);

        JLabel labelAdd = new JLabel("Adresse complète :");
        labelAdd.setFont(new Font("Raleway", Font.BOLD, 20));
        labelAdd.setForeground(Color.red);
        labelAdd.setBounds(100,490,200,30);
        add(labelAdd);

        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway",Font.BOLD, 14));
        textAdd.setBounds(300,490,400,35);
        add(textAdd);
        
        textAdd.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));


        JLabel labelCity = new JLabel("Nationalité :");
        labelCity.setFont(new Font("Raleway", Font.BOLD, 20));
        labelCity.setForeground(Color.red);
        labelCity.setBounds(100,540,200,30);
        add(labelCity);

        textville = new JTextField();
        textville.setFont(new Font("Raleway",Font.BOLD, 14));
        textville.setBounds(300,540,400,30);
        add(textville);

        JLabel labelPin = new JLabel("numero telephone :");
        labelPin.setFont(new Font("Raleway", Font.BOLD, 20));
        labelPin.setForeground(Color.red);
        labelPin.setBounds(100,590,200,30);
        add(labelPin);

        texttelf = new JTextField();
        texttelf.setFont(new Font("Raleway",Font.BOLD, 14));
        texttelf.setBounds(300,590,400,35);
        add(texttelf);
        
        texttelf.setBorder(BorderFactory.createCompoundBorder(
                BorderFactory.createLineBorder(Color.GRAY, 5),  
                BorderFactory.createEmptyBorder(5, 10, 5, 10)  
            ));


        JLabel labelstate = new JLabel("Type de pièce d'identité :");
        labelstate.setForeground(Color.red);
        labelstate.setFont(new Font("Raleway", Font.BOLD, 20));
        labelstate.setBounds(55,640,350,30);
        add( labelstate);
        
        String piece[] = {"C.I nationale"," Passeport", "Permis de conduire"};
        comboBox = new JComboBox(piece);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        comboBox.setBounds(350,640,320,30);
        add(comboBox);

        

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
        next.setBounds(620, 710, 100, 30);
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
        setSize(850,800);
        setLocation(360,40);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String formno = first;
        String name = textName.getText();
        String fname = textFname.getText();
        String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender = null;
        if(r1.isSelected()){
            gender = "Homme";
        }else if (r2.isSelected()){
            gender = "Femme";
        }
        String email = textEmail.getText();
        String marital =null;
        if (m1.isSelected()){
            marital = "Marié(e)";
        } else if (m2.isSelected()) {
            marital = "Célibataire";
        } else if (m3.isSelected()) {
            marital = "Divorcé(e)";
        }
        else if (m3.isSelected()) {
            marital = "autre";
        }

        String address = textAdd.getText();
        String nacio = textville.getText();
        String telf = texttelf.getText();
        String identite = (String) comboBox.getSelectedItem();
        
        
        

        try{
            if (textName.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Remplissez tous les champs");
            }
            else if (!name.matches("[a-zA-ZÀ-ÿ ]+")) {             
                JOptionPane.showMessageDialog(null, "Le nom doit contenir uniquement des lettres"); 
            } else if (!fname.matches("[a-zA-ZÀ-ÿ ]+")) {
                JOptionPane.showMessageDialog(null, "Le prénom doit contenir uniquement des lettres");
            } else if (!nacio.matches("[a-zA-ZÀ-ÿ ]+")) {
                JOptionPane.showMessageDialog(null, "La nationalité doit contenir uniquement des lettres");
            }
            else if (!telf.matches("\\d+") || Integer.parseInt(telf)<0) {
                JOptionPane.showMessageDialog(null, "Le numéro de téléphone doit être un entier positive"); 
            } 
            else {
                Connn c = new Connn();
                String q = "insert into signup values('"+formno+"', '"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"', '"+address+"', '"+nacio+"','"+telf+"','"+identite+"' )";
                c.statement.executeUpdate(q);
                new Signup2(formno,name,fname,dob,gender,email,marital,address,nacio,telf,identite);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
        new Signup();
    }
}