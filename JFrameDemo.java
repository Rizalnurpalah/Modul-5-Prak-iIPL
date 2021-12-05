/**
 * @(#)JFrameDemo.java
 *
 *
 * @author  M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/12/4
 */


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class JFrameDemo {

	public static void main(String s[]) {
		JFrame frame = new JFrame("JFrame Source Demo");
		// Add a window listner for close button
		frame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		// This is an empty content area in the frame
		JLabel jlbempty = new JLabel("");
		jlbempty.setPreferredSize(new Dimension(175, 100));
		frame.getContentPane().add(jlbempty, BorderLayout.CENTER);
		frame.pack();
		frame.setVisible(true);
	}
}