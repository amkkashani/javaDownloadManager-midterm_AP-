import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class MyFrame {
    public MyFrame() {
        JFrame frame = new JFrame("KDM");
        JPanel surface = new JPanel();
        frame.setMinimumSize(new Dimension(1215, 800));
        frame.setLocationRelativeTo(null);
        surface.setLayout(new BorderLayout(5, 5));
        JPanel top = new JPanel(new BorderLayout());


        ImageIcon logo = new ImageIcon("lion2.jpg");
        JLabel lion = new JLabel(logo);
        lion.setPreferredSize(new Dimension(200, 200));
        JMenuBar menuBar = new JMenuBar();
        JToolBar toolBar = new JToolBar("toolbar");
        toolBar=new ToolBar(toolBar).getToolBar();

        toolBar.setRollover(true);





        //تنظمات منو و آیتماش




        menuBar.add(new DownloadMenue().jMenu);
        menuBar.add(new Help().jMenu);


        surface.add(new Left().getPanel(), BorderLayout.WEST);
        top.add(menuBar, BorderLayout.NORTH);
        top.add(toolBar, BorderLayout.CENTER);

        JPanel center = new JPanel(new BorderLayout(5, 5));
        center.add(top, BorderLayout.NORTH);
        surface.add(center);
        surface.add(lion, BorderLayout.SOUTH);

        frame.setContentPane(surface);

        frame.setVisible(true);
    }

}
