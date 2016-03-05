package professional;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Nesting extends JFrame
{
	JButton button;
				
	public Nesting() 
	{
		super("Nesting");
		button = new JButton("OK");
		button.addActionListener(new ListenerNestled());//Calling a nestled class

		button.addActionListener(new ActionListener() //Creating and calling a anonymous class
		{
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				System.out.println("Anonymous class executing: " + button.getText());
			}
		});
		
		Container c = getContentPane();
		c.add(button);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
	}
	
	class ListenerNestled implements ActionListener //Creating a nested class
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			System.out.println("Nesting class executing: " + button.getText());
		}
	}
	
	public static void main(String[] args)
	{	
		//Shadowing
		Nesting window = new Nesting();
		@SuppressWarnings("unused")
		Nesting.ListenerNestled listener = window.new ListenerNestled(); //Creating a nested class

	}

}
