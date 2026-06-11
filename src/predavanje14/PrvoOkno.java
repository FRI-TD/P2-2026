package predavanja14;

import javax.imageio.IIOImage;
import javax.swing.*;
import java.awt.*;

public class PrvoOkno {

  public static void main(String[] args) throws Exception {
    JFrame okno = new JFrame();
    okno.setBounds(500,500, 300, 300);
    okno.setTitle("Moj prvi program");

    //Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
    //okno.setSize(dim);

    // okno.setResizable(false);

    JPanel panel = new JPanel();
    //panel.setBackground(Color.red);
    // panel.setBorder(BorderFactory.createLineBorder(Color.blue, 5));
    panel.setBorder(BorderFactory.createTitledBorder("Naslov okvira"));
    okno.add(panel);

    JButton gumb = new JButton("OK");
    panel.add(gumb);
    gumb.setEnabled(false);

    okno.setIconImage(new ImageIcon("viri/j.ico").getImage());

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
