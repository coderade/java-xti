package gui;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ControleText extends JFrame
{
	JButton ok, cancel;
	JTextField user;
	JPasswordField pass;
	
	public ControleText() 
	{		
		super ("Text and Passwords");
		
		cancel = new JButton("Cancel");
		cancel.addActionListener(new ButtonCancel());
		
		ok = new JButton("OK");
		ok.addActionListener(new  ButtonOk());
		
		user = new JTextField();
		pass = new JPasswordField();
		
		Container c = getContentPane();
		c.setLayout(new GridLayout(3,2));
		c.add(new JLabel("Login:"));
		c.add(user);
		c.add(new JLabel("Password:"));
		c.add(pass);
		c.add(ok);
		c.add(cancel);
		
		setSize(300,200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) 
	{
		new ControleText();
	}
	
	
	class ButtonOk implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == ok)
			{
				String u = user.getText().toUpperCase();
				String p = new String(pass.getPassword()).toUpperCase();
				
				JOptionPane.showMessageDialog(null, ("The username is " + u + " and the password is " + p));
			}
		}
			
	}

	class ButtonCancel implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == cancel)
			{
				user.setText("");
				pass.setText("");
			}
		}
	}

	
}
