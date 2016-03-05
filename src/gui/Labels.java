package gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class Labels extends JFrame 
{
	public Labels() 
	{
		super("Labels");		
		
		JLabel simple = new JLabel("Simple JLabel");
		simple.setToolTipText("My ToolTip");//Registers the text to display in a tool tip.
		
		Font font = new Font("serif", Font.BOLD | Font.ITALIC, 15);//Creates a new Font from the specified name, style and point size. 

		JLabel fontLabel = new JLabel("Font");//Creates a JLabel instance with the specified text.
		fontLabel.setFont(font);//Sets the font for this component
		fontLabel.setForeground(Color.GREEN);//Sets the foreground color of this component.
		
		ImageIcon icon = new ImageIcon(getClass().getResource("images/images.jpg"));//Creates an ImageIcon from the specified URL. 
		JLabel image = new JLabel(icon);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(simple);
		c.add(fontLabel);
		c.add(image);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300,300);
		setVisible(true);
		
		
	}
	public static void main(String[] args)
	{
		new Labels();
	}

}
