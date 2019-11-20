import javax.swing.*;
import java.awt.*;

public class Panel extends JPanel implements Runnable {
    public Panel(Frame frame) {
    }
    public void config() {

    }
    public void paintComponent(Graphics graphics) {

    }
    public void run() {
       while(true) {
           repaint();
           try {
               Thread.sleep(1);
           } catch (Exception e) {

            }
       }
    }
}
