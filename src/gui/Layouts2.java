package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings({ "unused", "serial" })
public class Layouts2 extends JFrame 
{

	public Layouts2() 
	{
		super("Layouts 02");
		Container c = getContentPane();
		
		/*BORDER LAYOUT
		c.setLayout(new BorderLayout(15,15));
		c.add(BorderLayout.NORTH, new JButton ("North"));
		c.add(BorderLayout.CENTER, new JButton ("Center"));
		c.add(BorderLayout.SOUTH, new JButton ("South"));
		c.add(BorderLayout.EAST, new JButton ("East"));
		c.add(BorderLayout.WEST, new JButton ("West"));
		
		GRID LAYOUT*/
		c.setLayout( new GridLayout(2,3));
		c.add(new JButton("1"));
		c.add(new JButton("2"));
		c.add(new JButton("3"));
		c.add(new JButton("4"));
		c.add(new JButton("5"));
		c.add(new JButton("6"));
		
		
		Container c2 = new JPanel();
		c2.setLayout(new GridLayout(4,1));
		c2.add(new JButton("ENTER"));
		c2.add(new JButton("CANCEL"));
		c2.add(new JButton("SETUP"));
		c2.add(new JButton("HELP"));
		
		c.setLayout(new BorderLayout());
		c.add(BorderLayout.CENTER, new JButton("CENTER"));
		c.add(BorderLayout.EAST, c2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new Layouts2();
	}

}
