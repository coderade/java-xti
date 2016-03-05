package Strings;

public class StringOperations {

	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		String s1 = "Write Once ";
		String s2 = s1 + "Run Anywhere";
		String s3 = new String("Java Virtual Machine");
		char[] array ={'J','A','V','A'};
		String s4 =new String(array);
		
		//BASIC OPERATIONS -
		int size = s3.length();//Returns the size of the string s3
		System.out.println(s3.charAt(5)); //Returns the value of the identifier 5
		System.out.println(s2.toString());//Returns the String of the variable s2
		
		//LOCATION
		int position = s3.indexOf("Machine"); // Returns the position of the value "Machine"
		System.out.println(position);
		int last= s3.lastIndexOf("a");// Returns the position of the last value "a"
		System.out.println(last);
		boolean empty = s3.isEmpty(); // Returns true if the length() is 0.
		
		//COMPARISON
		String xti = "XTI";
		System.out.println(xti.equals("xti"));//Compares this string to the specified value.
		System.out.println(xti.equalsIgnoreCase("xti"));//Compares this String to another String, ignoring case considerations
		System.out.println(xti.startsWith("XT"));//Tests if this string starts with the specified prefix.
		System.out.println(xti.endsWith("F"));//Tests if this string ends with the specified suffix.
		
		int c = "Test".compareTo("Dog"); //Compares two strings lexicographically
		System.out.println(c);
		String t = "Valdeci Gomes";
		boolean v = t.regionMatches(8, "Gomes", 0, 4);//Tests if two string regions are equal. 
		System.out.println(v);
		
		//EXTRACTION 	
		String name = "Valdeci Gomes de Souza Filho";
		String sl =name.substring(15, name.length());//Returns a string that is a substring of this string. 
		System.out.println(sl);
		
		//MODIFICATION 
		String l= name.concat(" Java Developer");//Concatenates the specified string to the end of this string. 
		System.out.println(l);
		String replace = l.replace("l", "j");//Replaces each substring of this string that matches with the specified value 
		System.out.println(replace);
		String replaceF = l.replaceFirst("V", "T");//Replaces the first substring of this string that matches with the specified value 
		System.out.println(replaceF);
		String replaceAll = l.replaceAll("l", "k");//Replaces each substring of this string that matches the given regular expression with the given replacement.
		System.out.println(replaceAll);
		
		String upper = l.toUpperCase();//Converts all of the characters in this String to upper case.
		String lower = l.toLowerCase();//Converts all of the characters in this String to lower case. 
		System.out.println(lower);
		
		String remSpaces = "    JAVA    ";
		System.out.println(remSpaces.trim());//Returns a string whose value is this string, with any leading and trailing whitespace removed. 
	}

}
