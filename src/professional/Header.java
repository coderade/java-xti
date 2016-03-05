package professional;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Documented
public @interface Header 
{
	String company();
	String project();
	String creationDate();
	String creator();
	int review() default 1;
}
