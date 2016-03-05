package io;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File02 {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		Path path = Paths.get("C:/Java/Files/test.txt");
		Charset utf8 = StandardCharsets.UTF_8;
		
		//To Write Files
		try (BufferedWriter t = Files.newBufferedWriter(path,utf8 );)
		{
			t.write("Valdeci Gomes");
			t.write(" Java");
			t.write(" Developer");
		}
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//To Read files
		try(BufferedReader reader = Files.newBufferedReader(path, utf8)) 
		{
			String line = null;
			while  ((line = reader.readLine())!=null)				
			{
				System.out.println(line);
			}
				
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}	
