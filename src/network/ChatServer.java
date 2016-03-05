package network;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ChatServer {

	List<PrintWriter> writers = new ArrayList<>();//PrintWriter => Prints formatted representations of objects to a text-output stream;
	
	public ChatServer() 
	{
		ServerSocket server;
		
		try 
		{
			server =  new ServerSocket(5000);
			while(true)
			{
				Socket skt =  server.accept();
				new Thread(new ListenClient(skt)).start();
				PrintWriter p = new PrintWriter(skt.getOutputStream());
				writers.add(p);
			}
		} 

		catch (Exception e) {
			System.out.println("The port is used!");
		}

	}
	
	private void ForwardForAll (String text)
	{
		for (PrintWriter pw : writers) 
		{
			try
			{
				pw.println(text);
				pw.flush();
			}
			catch (Exception m){}
		}
	}
	

	private class ListenClient implements Runnable
	{
		Scanner reader;
		public ListenClient(Socket socket) 
		{
			try 
			{
				reader = new Scanner(socket.getInputStream());
			}
			catch (IOException e) {} 
		}

		@Override
		public void run() 
		{
			try
			{
				String text;
				while ((text = reader.nextLine())!=null)
				{
					System.out.println(text);
					ForwardForAll(text);
				}
			}
			catch (Exception e){}
			
		}
		
	}
	public static void main(String[] args) 
	{
		new ChatServer();
	}

}
