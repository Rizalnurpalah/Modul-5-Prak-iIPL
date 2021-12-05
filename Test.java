/**
 * @(#)Test.java
 *
 *
 * @author M Rizal Nurpalah - 3411191048
 * @version 1.00 2021/12/4
 */


import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import java.applet.*;
import java.awt.event.*;
import java.awt.*;

public class Test extends Applet implements KeyListener
{
	String msg="";
	public void init()
	{
		addKeyListener(this);
	}
	public void keyPressed(KeyEvent k)
	{
		showStatus("KeyPressed");
	}
	public void keyReleased(KeyEvent k)
	{
		showStatus("KeyRealesed");
	}
	public void keyTyped(KeyEvent k)
	{
		msg = msg+k.getKeyChar();
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg, 20, 40);
	}
}