/*
Programmer: Alejandro Parana
Date 11/6/2014
Circle.java
*/
import javax.swing.JFrame;

public class Circle
{
   public static void main (String[] args)
   {
      JFrame frame = new JFrame ("Circle");
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new CirclePanel());
	  frame.setLocationRelativeTo(null);

      frame.pack();
      frame.setVisible(true);
   }
}
