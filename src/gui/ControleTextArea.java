package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class ControleTextArea extends JFrame

{
	JTextArea text;
	public ControleTextArea() 
	{
		super ("Text Editor");
		text = new JTextArea();
		JScrollPane scroll = new JScrollPane(text);
		text.setFont(new Font("Serif",Font.PLAIN, 28 ));
		
		JButton open = new JButton("Open File");
		open.setFont(new Font("Serif",Font.PLAIN, 25 ));
		open.addActionListener(new btnOpen());
		
		Container c = getContentPane();
		c.add (BorderLayout.CENTER, scroll);
		c.add (BorderLayout.SOUTH, open);
		
		
		setSize(300,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ControleTextArea();
	}
	
	class btnOpen implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e)
		{
			JFileChooser j = new JFileChooser();//JTextArea text
			j.showOpenDialog(new ControleTextArea());
			File file = j.getSelectedFile();
			try 
			{
				Path path = Paths.get(file.getAbsolutePath());
				String retorno = new String (Files.readAllBytes(path));
				text.setText(retorno);
			} 
			
			catch (Exception e2) 
			{
				JOptionPane.showMessageDialog(new ControleTextArea(), "Failed to open the file");
			}
		}
		
	}
}
