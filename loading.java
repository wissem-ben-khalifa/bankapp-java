package projet_java;
import javax.swing.*;
import java.awt.*;

public class loading {
     JFrame frame;
     JProgressBar progressBar;
     JLabel  label1,label2;
     
    

    loading() {
        frame = new JFrame("Loading...");
        frame.setUndecorated(true); 
        frame.setSize(400, 300); 
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.setBackground(Color.WHITE);

        JLabel loadingLabel = new JLabel("Loading...");
        loadingLabel.setHorizontalAlignment(SwingConstants.CENTER);
        loadingLabel.setFont(new Font("Arial", Font.BOLD, 20)); 
        loadingLabel.setForeground(Color.BLACK); 
        panel.add(loadingLabel, BorderLayout.NORTH);
        
        label2 = new JLabel("bienvenu");
        label2.setFont(new Font("Ralway", Font.BOLD, 22));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        panel.add(label2);

        ImageIcon i1 = new ImageIcon(getClass().getResource("/bankbruh.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(150,55,100,100);
        panel.add(image);
        
        label1 = new JLabel("Bank_wiss");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde", Font.BOLD, 18));
        label1.setBounds(250,110,550,40);
        panel.add(label1);
        
        ImageIcon iii1 = new ImageIcon(getClass().getResource("/xdxd.png"));
        Image iii2 = iii1.getImage().getScaledInstance(400,300,Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,400,300);
        panel.add(iiimage);
        
        

        progressBar = new JProgressBar();
        progressBar.setValue(0);
        progressBar.setStringPainted(true);
        panel.add(progressBar, BorderLayout.SOUTH);

        frame.add(panel);
    }

    public void show() {
        frame.setVisible(true);

        new Thread(() -> {
            for (int i = 0; i <= 100; i++) {
                try {
                    Thread.sleep(30); 
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                updateProgress(i);
            }
            frame.dispose(); 
            new main_choose();
        }).start();
    }

    public void updateProgress(int value) {
        SwingUtilities.invokeLater(() -> progressBar.setValue(value));
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            loading l = new loading();
            l.show();
        });
    }
}
