package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class File04 {

	public static void main(String[] args) throws IOException 
	{	
		/*Path file = Paths.get("C:/Java/Files/io.txt");
		System.out.println(Files.exists(file)); //The file in the path file exists?
		System.out.println(Files.isDirectory(file));//The file is a directory?
		System.out.println(Files.isRegularFile(file));//Tests whether a file is a regular file with opaque content
		System.out.println(Files.isReadable(file));//Tests whether a file is readable
		System.out.println(Files.size(file) + " bytes");//Returns the size of a file (in bytes). 
		System.out.println(Files.getLastModifiedTime(file));//Returns a file's last modified time.
		System.out.println(Files.getOwner(file));//Returns the Owner of the file.
		System.out.println(Files.probeContentType(file));//Returns the content type of a file. 
		
		//DELETE
		Files.delete(file);
		Files.deleteIfExists(file);
		*/
		
		
		

		//CREATE
		Path file = Paths.get("C:/Java/Files/source.txt");
		Files.write(file, "My source code".getBytes());
		
		
		//COPY
		Path copy = Paths.get("C:/Java/Files/copy.txt");
		Files.copy(file, copy, StandardCopyOption.REPLACE_EXISTING);
		
		//MOVE
		Path move = Paths.get("C:/Java/Files/Move/move.txt");
		Files.createDirectories(move.getParent());
		Files.move(file, move, StandardCopyOption.REPLACE_EXISTING);
	}

}
