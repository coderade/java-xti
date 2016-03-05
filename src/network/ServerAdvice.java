package network;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerAdvice 
{

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception 
	{
		//0-1023
		ServerSocket server = new ServerSocket(5000); //This class implements server sockets. A server socket waits for requests to come in over the network
		while (true)
		{
			Socket socket = server.accept(); //Listens for a connection to be made to this socket and accepts it. The method blocks until a connection is made. 
			try (PrintWriter print = new PrintWriter(socket.getOutputStream())) //Prints formatted representations of objects to a text-output stream
			{
				print.println("Learn Java and you'll be admited!");
			}
		}

	}

}
