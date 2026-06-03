package predavanje15;

import javax.swing.*;
import java.awt.*;

public class GridLayoutTest {
  public static void main(String[] args) {
    JFrame okno = new JFrame("GridLayoutTest");

    okno.setLayout(new GridLayout(4, 3, 10,10));

    okno.setBounds(500, 500, 500, 500);

    for (int i=1; i<=9; i++) {
      JButton gumb = new JButton(i+"");
      okno.add(gumb);
    }
    okno.add(new JPanel());
    okno.add(new JButton("0"));

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }

}