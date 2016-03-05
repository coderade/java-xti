package gui;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Layouts extends JFrame {
	
	public Layouts() 
	{
		super("Layouts");
		Container c = getContentPane();
		BorderLayout b = new BorderLayout();
		c.setLayout(b);
		
		c.setLayout(new FlowLayout());
		c.add(new Button("1"));
		c.add(new Button("2"));
		c.add(new Button("3"));
		
		c.add(BorderLayout.NORTH, new JButton("ADD") );
		c.add(BorderLayout.SOUTH, new JButton("CLOSE"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
	}

	public static void main(String[] args) 
	{
		new Layouts();
	}

}
