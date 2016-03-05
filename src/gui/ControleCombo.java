package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class ControleCombo extends JFrame{

	JComboBox<String> combo;//A component that combines a button or editable field and a drop-down list
	JLabel label;//A display area for a short text string or an image, or both
	ImageIcon[] images =//An implementation of the Icon interface that paints Icons from Images 
		{
			new ImageIcon(getClass().getResource("images/01.png")),//A component that combines a button or editable field and a drop-down list
			new ImageIcon(getClass().getResource("images/02.jpg")),
			new ImageIcon(getClass().getResource("images/03.jpg")),
			new ImageIcon(getClass().getResource("images/04.jpg")),
		};
	
	public ControleCombo() 
	{	
		super ("Photo Album");
		Container album = getContentPane();
		combo = new JComboBox<String>();
		combo.setFont(new Font("Serif", Font.BOLD, 29));
		combo.addItem("JAVA 01");
		combo.addItem("JAVA 02");
		combo.addItem("JAVA 03");
		combo.addItem("JAVA 04");
		combo.addItemListener(new comboImages());//Adds an aListener will receive one or two ItemEvents when the selected item changes.

		
		label = new JLabel(images[0]);
		
		album.add(BorderLayout.NORTH, combo);
		album.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 500);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ControleCombo();
	}
	
	class comboImages implements ItemListener
	{

		@Override
		public void itemStateChanged(ItemEvent e) 
		{
			if (e.getStateChange()== ItemEvent.SELECTED)
			{
				label.setIcon(images[combo.getSelectedIndex()]); //Returns the first item in the list that matches the given item. 
			}
		}
	}

}
