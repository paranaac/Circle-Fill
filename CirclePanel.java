/*
Programmer: Alejandro Parana
Date 11/6/2014
CirclePanel.java
*/

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class CirclePanel extends JPanel
{
   private JButton on, off;
   private JLabel label;
   private JPanel buttonPanel;
   boolean filled = false;
   
   public CirclePanel ()
   {
	on = new JButton ("On");
    off = new JButton ("Off");
	
	ButtonListener listener = new ButtonListener();
	on.addActionListener(listener);
	off.addActionListener(listener);
	label = new JLabel("Push a button");
	
	buttonPanel = new JPanel();
	buttonPanel.setPreferredSize(new Dimension(200,40));
    buttonPanel.setBackground (Color.green);
    buttonPanel.add (on);
    buttonPanel.add (off);
	setPreferredSize (new Dimension(400, 150));
    setBackground (Color.green);
    add (label);
    add (buttonPanel);
	}
	
	public void paintComponent (Graphics page)
   {
	  super.paintComponent (page);
	  if (filled)
	  {
		page.setColor (Color.white);
		page.fillOval(60,60,60,60);
		repaint();
	  }
	  else
	  {
		page.setColor (Color.black);
		page.fillOval(60,60,60,60);
		repaint();
	  }
   }
	
	private class ButtonListener implements ActionListener
    {
		public void actionPerformed (ActionEvent event)
		  {
			 if (event.getSource() == on)
			 {
				filled = true;
			
			}
			 else if (event.getSource() == off)
			 {
				filled = false;
			 }
		  }
    }  
}


