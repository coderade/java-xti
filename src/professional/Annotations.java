package professional;

import java.io.Serializable;

/*
 * Company: 		Oracle
 * Project: 		Java SE Course
 * Creation date:	20/12/2014
 * Creator: 		Valdeci Gomes
 * Review:			2
 */

@Header
(
	company = "Oracle", 
	project = "Java SE Course",
	creationDate = "20/12/2014",
	creator = "Valdeci Gomes",
	review = 1
)

@BugsFixed (bugs = {"001", "002"})
@SuppressWarnings("serial")//Indicates that the named compiler warnings should be suppressed in the annotated element (and in all program elements contained in the annotated element). 
public class Annotations implements Serializable
{	
	@Deprecated//A program element annotated @Deprecated is one that programmers are discouraged from using, typically because it is dangerous, or because a better alternative exists.
	public void note() {}
	
	@SuppressWarnings("unused")
	@Override//Indicates that a method declaration is intended to override a method declaration in a supertype.
	public String toString()
	{	
		String name;
		return "";
	}
}
