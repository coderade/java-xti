package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Windows extends JFrame {
	

		public Windows()
		{
			super("My Window!");
			JButton button = new JButton("CLIQUE!");
			getContentPane().add(button);
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(300, 300);
			setVisible(true);
		}
		
		
	public static void main(String[] args) 
	{
		new Windows();
	}

}
