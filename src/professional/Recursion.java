package professional;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Recursion {

	public static int Sum (int x)
	{
		if (x==0) 
		{
			return 0;
		}
		else 
		{
			System.out.println(x);
			return x + Sum(x-1);//x = 7 +(6 + (5 + (4 +  (3 + (2 + (1)))))) 
			
		}
		
	}
	
	public static int Power (int x, int y)
	{
		if (y == 1) 
		{
			System.out.println(x);
			return x; 
		} 
		else 
		{
			// X = 3125, Y = 1
			int e = x * Power(x, y -1);
			System.out.println(e);
			return e;
			
		}
		
	}
	
	public static void ToList (Path path)
	{
		if(Files.isRegularFile(path))
		{
			System.out.println(path.toAbsolutePath());
		}
		else
		{
			String dir = path.toAbsolutePath().toString();
			System.err.println(dir.toUpperCase());
			try(DirectoryStream<Path> stream= Files.newDirectoryStream(path)) //An object to iterate over the entries in a directory. A directory stream allows for the convenient use of the for-each construct to iterate over a directory
			{
				for (Path p : stream) 
				{
					System.out.println(p.toAbsolutePath());
					ToList(p);
				}
			} 
			catch (IOException e){}
		}
	}
	public static void main(String[] args) 
	{
		//System.out.println(Sum(7));
		//System.out.println(Power(5, 5));
		ToList(Paths.get("C:/Users"));
	}

}
