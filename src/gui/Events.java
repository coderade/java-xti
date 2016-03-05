package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Events extends JFrame implements ActionListener 
{

	JButton button;
	
	public Events() 
	{
		super("Events");
		button = new JButton("Click here!"); //Creates a button with text.*/		
		button.addActionListener(this);//Adds an ActionListener to the button
		getContentPane().add(button);//Returns the contentPane object for this frame and the button.
		setSize(300,300);//Resizes this component so that it has width width and height height.
		setVisible(true);//Shows or hides this Window depending on the value of parameter b
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Sets the operation that will happen by default when the user initiates a "close" on this frame.
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) 
	{
		button.setText("It's Clicked");
	}

	public static void main(String[] args) 
	{
		new Events();
	}

	

}
