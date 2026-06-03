package predavanje15;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest {

  public static void main(String[] args) {
    JFrame okno = new JFrame("BorderLayoutTest");

    okno.setLayout(new BorderLayout());

    okno.setBounds(500,500,500,500);

    okno.setMinimumSize(new Dimension(300, 1));

    JButton gumb1 = new JButton("Ena");
    JButton gumb2 = new JButton("Dva");
    JButton gumb3 = new JButton("Tri");
    JButton gumb4 = new JButton("Štiri");
    JButton gumb5 = new JButton("Pet");

    gumb4.setFont(gumb4.getFont().deriveFont(34.0f));

    gumb3.setPreferredSize(new Dimension(200, 10));
    okno.add(gumb1,BorderLayout.PAGE_START);
    okno.add(gumb2,BorderLayout.PAGE_END);
    okno.add(gumb3,BorderLayout.LINE_START);
    okno.add(gumb4,BorderLayout.LINE_END);
    okno.add(gumb5);  /// center


    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
