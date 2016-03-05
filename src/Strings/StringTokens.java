package Strings;

public class StringTokens {

	public static void main(String[] args) 
	{
		String language = "C#;JAVA;DELPHI;PROGRESS";
		String[] tokens = language.split(";");
		System.out.println(tokens.length + " tokens");
		for (String token : tokens) 
		{
			System.out.println(token);
		}
	}

}
