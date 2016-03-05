package network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class ChatClient extends JFrame
{

	JTextField textForSend;
	JTextArea receiveText;
	JButton btnSend;
	PrintWriter writer;
	String name;
	Scanner reader;
	
	
	private class ListenServer implements Runnable
	{

		@Override
		public void run() 
		{
			try
			{
				String text;
				while ((text = reader.nextLine())!= null)
				{
					receiveText.append(text + "\n");//Appends the given text to the end of the document.
				}
			}
			catch(Exception O){}
		}
		
	}
	public ChatClient(String name) 
	{
		super(name);
		this.name = name;
	
		Font font = new Font("SERIF", Font.PLAIN, 21);
		textForSend= new JTextField();
		textForSend.setFont(font);
		btnSend = new JButton("Send");
		btnSend.setFont(font);
		btnSend.addActionListener(new SendListener());
		Container ctnSend = new JPanel();
		ctnSend.setLayout(new BorderLayout());
		ctnSend.add(BorderLayout.CENTER, textForSend);
		ctnSend.add(BorderLayout.EAST, btnSend);
		
		receiveText = new JTextArea();
		receiveText.setFont(font);
		JScrollPane scroll = new JScrollPane(receiveText);
		getContentPane().add(BorderLayout.CENTER, scroll);
		getContentPane().add(BorderLayout.SOUTH, ctnSend);
		
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		SetNetwork();
	}
	
	
	private class SendListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e) 
		{
			writer.println(name + ": " + textForSend.getText());
			writer.flush();
			textForSend.setText("");
			textForSend.requestFocus();
			
		}

	}
	
	@SuppressWarnings("resource")
	public void SetNetwork() 
	{
		try 
		{
			Socket socket = new Socket("127.0.0.1", 5000);
			writer = new PrintWriter(socket.getOutputStream());
			reader = new Scanner(socket.getInputStream());
			new Thread(new ListenServer()).start();	
		} 
		catch (Exception e) 
		{
			JOptionPane.showMessageDialog(null, "The port or adress is in use or the server or is in use!");
		}
		
	}
	
	public static void main(String[] args) 
	{
		new ChatClient("Leo");
		new ChatClient("Valdeci");
		
	}

	
}
