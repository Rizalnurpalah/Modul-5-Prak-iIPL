/**
 * @(#)MyJOptionPane.java
 *
 *
 * @author  M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/12/5
 */

import javax.swing.*;
import java.awt.event.*;

public class MyJOptionPane extends WindowAdapter
{
  JFrame frame;

  MyJOptionPane()
  {
    frame = new JFrame();
    frame.addWindowListener(this);
    frame.setSize(250, 250);
    frame.setLayout(null);
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
  }

  public void windowClosing(WindowEvent e)
  {
    int res = JOptionPane.showConfirmDialog(frame,"Are you sure?");

    if(res == JOptionPane.YES_OPTION)
    {
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
  }

  public static void main(String[] args)
  {
    new  MyJOptionPane();
  }
}