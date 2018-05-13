import javax.swing.*;
import java.awt.*;

public class MyFrame {
    public MyFrame(){
        JFrame frame=new JFrame();
        JPanel surface=new JPanel();
        frame.setBackground(new Color(53, 132, 233));
        surface.setBackground(new Color(230, 230, 57));
        frame.setSize(new Dimension(900,600));
        frame.setLocationRelativeTo(null);
        ImageIcon logo = new ImageIcon("lion.jpg");
        JLabel lion = new JLabel(logo);
        lion.setPreferredSize(new Dimension(50,50));
        surface.add(lion);
        frame.setContentPane(surface);
        frame.setVisible(true);
    }
}
