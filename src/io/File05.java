package io;

import java.io.IOException;
import java.nio.file.DirectoryIteratorException;
import java.nio.file.DirectoryStream;
import java.nio.file.FileStore;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class File05 
{

	public static void getContents()
	{
		Iterable<Path> dir = FileSystems.getDefault().getRootDirectories();
		for (Path path : dir)
		{
			System.out.println(path);
		}
			
		//LIST THE CONTENTS
		Path dirs = Paths.get("C:/Java");
		try (DirectoryStream<Path> stream = Files.newDirectoryStream(dirs))
		{
			for (Path path : stream) 
			{
				System.out.println(path.getFileName());
			}
		} catch (IOException | DirectoryIteratorException e)
		{
			e.printStackTrace();
		}
	}
	
	public static void getPartitions() throws IOException
	{
		FileSystem fs = FileSystems.getDefault();
		for (FileStore store : fs.getFileStores()) 
		{
			System.out.println("\nUnitys: " + store.toString() );
			System.out.println("Total space: " + store.getTotalSpace());
			System.out.println("Free space: " + store.getUsableSpace());
			System.out.println("Used Space: " + (store.getTotalSpace() - store.getUsableSpace()));
		}
		
	}
	
	public static void main(String[] args) throws IOException 
	{
		File05.getPartitions();
	}
}