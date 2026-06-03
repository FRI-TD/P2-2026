package predavanje15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Poslusalec implements ActionListener {
  public void actionPerformed(ActionEvent e) {
     System.out.println("OK!");
  }
}

public class GridBagLayoutTest {

  static final int P = 6;
  public static void main(String[] args) {
    JFrame okno = new JFrame("BorderLayoutTest");

    okno.setBounds(500,500,500,500);

    JPanel zgoraj = new JPanel(new GridBagLayout());
    JPanel spodaj = new JPanel(new FlowLayout());

    okno.setLayout(new BorderLayout());
    okno.add(zgoraj); // center
    okno.add(spodaj, BorderLayout.PAGE_END);

    JButton okGumb = new JButton("OK");
    okGumb.addActionListener(new Poslusalec());

    JButton cancelGumb = new JButton("Cancel");
    JButton helpGumb = new JButton("Help");

    spodaj.add(okGumb); spodaj.add(cancelGumb); spodaj.add(helpGumb);

    JLabel imeL          = new JLabel("Ime:");
    JLabel priimekL      = new JLabel("Priimek:");
    JTextField imeTF     = new JTextField();
    JTextField priimekTF = new JTextField();
    JTextArea vpisTA     = new JTextArea();

    cancelGumb.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        imeTF.setText(imeTF.getText() + " Cancel");
      }
    });

    helpGumb.addActionListener((e)->{
      System.out.println("HELP!!!");
    });

    vpisTA.addMouseMotionListener(new MouseMotionAdapter() {
      @Override
      public void mouseMoved(MouseEvent e) {
        int x = e.getX();
        int y = e.getY();
        vpisTA.setText(String.format("\n  (%d, %d)", x, y));
      }
    });

    GridBagConstraints gbc;

    Insets ins = new Insets(P,P,0,0);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=0;
    gbc.insets = ins;
    gbc.anchor = GridBagConstraints.WEST;

    zgoraj.add(imeL, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=1;
    gbc.anchor = GridBagConstraints.WEST;
    gbc.insets = ins;
    zgoraj.add(priimekL,gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=0;
    gbc.insets = new Insets(P,P,0,P);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    zgoraj.add(imeTF, gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=1;
    gbc.gridy=1;
    gbc.insets = new Insets(P,P,0,P);
    gbc.fill = GridBagConstraints.HORIZONTAL;
    zgoraj.add(priimekTF,gbc);

    gbc = new GridBagConstraints();
    gbc.gridx=0;
    gbc.gridy=2;
    gbc.fill = GridBagConstraints.BOTH;
    gbc.weightx = 1;
    gbc.weighty=1;
    gbc.gridwidth=2;
    gbc.insets = new Insets(P,P,P,P);
    JScrollPane jsp = new JScrollPane(vpisTA);
    zgoraj.add(jsp,gbc);

    okno.addWindowListener(new WindowAdapter() {
      @Override
      public void windowClosing(WindowEvent e) {
        int odgovor = JOptionPane.showConfirmDialog(okno,"Si prepičan?");
        if (odgovor == JOptionPane.OK_OPTION)
          System.exit(0);
      }
    });

    okno.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    okno.setVisible(true);
  }
}
