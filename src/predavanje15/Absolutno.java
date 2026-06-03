package predavanje15;

import javax.swing.*;

public class Absolutno {

  public static void main(String[] args) {
    JFrame okno = new JFrame("Imenik");

    okno.setBounds(300,300, 300,150);

    JLabel napis = new JLabel("Ime:");
    JTextField vpis = new JTextField();
    JButton gumb = new JButton("Išči");
    JTextArea jta = new JTextArea();

    okno.setLayout(null); // absolutno pozicioniranje

    napis.setBounds(10, 20, 30, 20);
    okno.add(napis);

    vpis.setBounds(50, 20, 140, 20);
    okno.add(vpis);

    gumb.setBounds(210, 20, 60, 20);
    okno.add(gumb);

    jta.setBounds(10, 50, 280, 40);
    okno.add(jta);

    okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    okno.setVisible(true);
  }
}
