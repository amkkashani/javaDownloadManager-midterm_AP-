import javax.swing.*;
import java.awt.*;

public class Left {
    private  JPanel panel ;
    public Left(){
        panel=new JPanel();
        panel.setLayout( new BorderLayout());
        ImageIcon lion = new ImageIcon("KDM.jpg");
        JLabel lionlabel = new JLabel (lion);
        panel.add(lionlabel , BorderLayout . NORTH);
        panel.setBackground(new Color(250,200,100));
        panel.setPreferredSize(new Dimension(173,200));
        JButton button = new JButton("")



    }

    public JPanel getPanel() {
        return panel;
    }
}
