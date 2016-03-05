package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File01
{	
	public static void main(String[] args) throws IOException{
		Path path = Paths.get("C:/Java/Files/test.txt");
		path.toAbsolutePath(); //Returns the absolute address of the file.
		path.getParent();//Returns the parent path, or null if this path does not have a parent. 
		path.getRoot();//Returns the root component of this path as a Path object.
		path.getFileName();//Returns the name of the file or directory denoted by this path as a Path object.
		
		//Creation of directories
		Files.createDirectories(path.getParent()); //Creates a directory by creating all nonexistent parent directories first.
		
		//Write and Read files
		byte[] bytes ="MyText".getBytes();// Creates an bytes' array that receives the bytes of the String "MyText".
		Files.write(path, bytes); //Writes bytes to a file.
		
		byte[] returns = Files.readAllBytes(path);//Reads all the bytes from a file
		System.out.println(new String(returns));
		
		
		
	}

}
