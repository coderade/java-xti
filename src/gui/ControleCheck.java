package gui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleCheck  extends JFrame{

	JTextField text;
	JCheckBox bold, italic;
	
	public ControleCheck() 
	{
		super ();
		
		text= new JTextField("Font test", 9);
		text.setFont(new Font("Serif", Font.PLAIN, 25));
		
		bold = new JCheckBox("Bold");
		bold.addItemListener(new CheckListener());
		
		italic = new JCheckBox("Italic");
		italic.addItemListener(new CheckListener());
		
	    
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(text);
		c.add(bold);
		c.add(italic);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
		
	}
	
	class CheckListener implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if(bold.isSelected() && italic.isSelected())
			{
				text.setFont(new Font ("Serif", Font.BOLD | Font.ITALIC, 25));
			}
			else if (bold.isSelected())
			{
				text.setFont(new Font("Serif", Font.BOLD, 25));
			}
			else if (italic.isSelected())
			{
				text.setFont(new Font("Serif", Font.ITALIC, 25));
			}

		}
		
	}
	public static void main(String[] args)
	{ 
		new ControleCheck(); 
	}

}
