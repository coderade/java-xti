package network;

import java.net.Socket;
import java.util.Scanner;

public class ClientAdvice {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception 
	{
		//0-1023 ports are used by the system.
		Socket socket = new Socket("127.0.0.1", 5000);// A socket is an endpoint for communication between two machines. 
		Scanner scan = new Scanner(socket.getInputStream()); //getInputStream - Returns an input stream for this socket. 
		System.out.println("The message is: " + scan.nextLine());
		scan.close();

	}

}
