package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressions {

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		boolean v = "Java".matches("java");
		System.out.println(v);

		/* Modifiers
		(?i), Ignores upper case and lower case letters.
		(?x), Ignores Comments
		(?m), Ignores Multilines
		(?s), Ignores Dottals*
		*/
		boolean c = "Java".matches("(?i)java");
		System.out.println(c);

		/*Metacharacters
		 .	some letter
		 \d	digits			[0-9]
		 \D isn't digit		[^0-9]
		 \s spaces			[\t \n \x0B \f \r]
		 \w letter			[a-z A-Z_0-9]
		 \W isn't letter
		*/

		boolean k= "@".matches(".");
		boolean a = true;
		a = "2".matches("\\w");
		a = "#".matches(".");
		a = " ".matches("\\W");
		a = "Pi".matches("..");
		a = "20".matches("\\w\\w");
		System.out.println(k);



		/*QUANTIFIERS
		X{n} 	X, exactly N times.
		X{n,}	X, at least N times.
		X{n,m}	X, at least N time but no more than m times.
		X? 		X, 0 or 1 time.
		X*		X, 0 or N times.
		X+		X, 1 or N times.
		*/
		String cep = "\\d{5}-\\d{3}";
		String date= "\\d{4}/\\d{2}/\\d{2}";
		boolean d = "86055-690".matches(cep);
		d = "21".matches("\\d{2}");
		d = "212".matches("\\d{2,}");
		d = "21".matches("\\d{2,5}");

		d = " ".matches(".?");//0 or 1
		d = "ab".matches(".*"); //0 or +
		d = "123".matches(".+");//1 or +
		d = "86055-690".matches(cep);
		d = "1994/08/29".matches(date);
		System.out.println(d);

		/*METACHARACTER
		 ^	Starts
		 $ 	Ends
		 |	OR
		*/

		boolean dev = "Valdeci".matches("^Valdeci"); // Start with Valdeci?
		dev = "Valdeci Gomes".matches(".*Gomes"); // Ends with Gomes?
		dev = "There is Java Developer".matches(".*Java.*"); // There is Java in the context?
		dev = "There is Java Developer".matches("^There .* Developer$"); // Starts with There and ends with Developer?
		dev = "yes".matches("^yes||^no");	//There is yes or no?
		System.out.println(dev);

		/*GROUPERS
		[...]			Grouping
		[a-z]			Range
		[a-e][i-u]		Union
		[a-z&&[aeiou]]	Intersection
		[^abc]		 	Exception
		[a-z&&[^m-p]]	Subtraction
		\x				Literal Escape
		*/

		boolean f = "x".matches("[a-z]"); //There is a x in the context?
		f = "5".matches("[0-9]");//There is a 5 in the context?
		f = "Link".matches("[Ll]ink"); //There is Link Starting with L or l?
		f = "Oracle".matches("[A-Z][A-Za-z]*"); //The word starts from A to Z Upper case letter and continues from A to Z or a-z letters?
		f = "Surf".matches("[^a-f]urf"); //The word doesn't starts from a to f letter and continues with urf
		f = "Bomberman".matches("Bomberm[ae]n"); //The word can be Bomberman or Bombermen.

		boolean email = "example@email.com".matches("\\w+@\\w+\\.com"); //The email must start with 1 or N letters, use the @, continues with 1 or N letter, use the dot(.) and ends with the com.
		System.out.println(email);

		String nerd = "I am a NerD Nerd NERD!";
		Matcher matcher = Pattern.compile("(?i)nerd").matcher(nerd);// Change the all words nerd ignoring lower and upper case letters.

		while(matcher.find())// while there is the word nerd, print the words found.
		{
			System.out.println(matcher.group());
		}

		//REPLACEMENT
		String j = nerd.replaceAll("(?i)nerd", "Surfer"); // Change all words nerd ignoring lower and upper case letters for the word Surfer.
		System.out.println(j);

		String butt = "I like big butt butt butt!";
		String val =  butt.replaceAll("b[aeiou]", "f"); // Change all letters b followed from a,e,i,o or u for f
		val = "Tabule this text".replaceAll("\\s", "\t");// Chance the spaces in the text for a tabulation.
		System.out.println(val);

		String url = "www.oracle.com/java-2014-duke.jsp";
		//www.oracle.com.br/java/2014/duke.jsp
		String newUrl = "(www.oracle.com)/(\\w{4})-(\\d{4})-(\\w{4}).jsp"; //Create with the parentheses four variables.

		boolean vUrl = url.matches(newUrl); //Compares of url matches the newUrl statement.
		System.out.println(vUrl);
		
		String test = url.replaceAll(newUrl,"https://$1/$2/$3/$4.jsp" ); //Replaces the text using the variables created.
		System.out.println(test);

	}

}
