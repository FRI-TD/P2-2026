package predavanje15;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame("FlowLayoutTest");

    okno.setLayout(new FlowLayout(FlowLayout.LEFT));

    okno.setBounds(500,500,500,500);

    okno.setMinimumSize(new Dimension(300, 1));

    JButton gumb1 = new JButton("Ena");
    JButton gumb2 = new JButton("Dva");
    JButton gumb3 = new JButton("Tri");
    JButton gumb4 = new JButton("Štiri");
    JButton gumb5 = new JButton("Pet");

    gumb1.setPreferredSize(new Dimension(300,300));

    okno.add(gumb1);
    okno.add(gumb2);
    okno.add(gumb3);
    okno.add(gumb4);
    okno.add(gumb5);


    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
