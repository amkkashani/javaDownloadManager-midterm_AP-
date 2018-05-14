import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class DownloadMenue {
    JMenu jMenu=new JMenu("Download");
    public DownloadMenue(){
        jMenu.setFont(new Font("fff",50,25));

        JMenuItem item1 = new JMenuItem("New download");
        item1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F4 , ActionEvent.ALT_MASK));
        item1.setMnemonic(KeyEvent.VK_N);

        JMenuItem item2=new JMenuItem("Pause");
        item2.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P , ActionEvent.ALT_MASK));
        item2.setMnemonic(KeyEvent.VK_P);

        JMenuItem item3=new JMenuItem("Resume");
        item3.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R , ActionEvent.ALT_MASK));
        item3.setMnemonic(KeyEvent.VK_R);

        JMenuItem item4=new JMenuItem("Cancle");
        item4.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C , ActionEvent.ALT_MASK));
        item4.setMnemonic(KeyEvent.VK_C);

        JMenuItem item5=new JMenuItem("Remove");
        item5.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, ActionEvent.ALT_MASK));
        item5.setMnemonic(KeyEvent.VK_R);

        JMenuItem item6=new JMenuItem("Setting");
        item6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S , ActionEvent.ALT_MASK));
        item6.setMnemonic(KeyEvent.VK_S);

        JMenuItem item7=new JMenuItem("Exit");
        item7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E , ActionEvent.CTRL_MASK));
        item7.setMnemonic(KeyEvent.VK_E);



        jMenu.add(item1);
        jMenu.add(item2);
        jMenu.add(item3);
        jMenu.add(item4);
        jMenu.add(item5);
        jMenu.add(item6);
        jMenu.add(item7);

    }
    public JMenu getJMenu(){
        return jMenu;
    }
}
