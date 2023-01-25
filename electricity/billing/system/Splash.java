package electricity.billing.system;

import javax.swing.*;
import java.awt.*;

public class Splash extends JFrame implements Runnable {     
    Thread t;
    Splash() {
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/hello.jpg"));// to use image ,to find image
        Image i2 = i1.getImage().getScaledInstance(730, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        add(image);// to add image on frame
        
        setVisible(true);                    // to make visible to frame
        
        int x = 1;
        for (int i = 2; i < 600; i+=4, x+=1) {
            setSize(i + x, i);                  // to make frame(width,height)       
            setLocation(700 - ((i + x)/2), 400 - (i/2));  // to set location of frame(right,top)
            try {
                Thread.sleep(5);             // to slow open the frame
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        t = new Thread(this);  // create object of Thread class to call run method
        t.start();          // calls run method       
        setVisible(true);
    }
    //override from Runnable interface
    public void run() {        // this method is used to open next window in how much time
        try {
            Thread.sleep(4000);   // 4 sec
            setVisible(false);
            
            // login frame
            new Login();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        new Splash();                // anonymous object i.e no name  
    }
}

// if you are implements an interface you have to override abstract methods from interface
// or you can make that class abstract but you can't create object of abstract class
