package professional;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Reflection {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) throws Exception
	{
		String name = "io.Accounts3";	
		Class classe = Class.forName(name);	//Returns the Class object associated with the class or interface with the given string name.
		System.out.println(classe.getSimpleName() + "\n");	//Returns the simple name of the underlying class as given in the source code.
		
		Field[] f = classe.getFields();	//Returns an array containing Field objects reflecting all the accessible public fields of the class or interface represented by this Class object. 
		for (Field field : f) 
		{
			System.out.println(field);
		}
			
		Method[] m = classe.getDeclaredMethods();	//Returns an array containing Method objects reflecting all the declared methods of the class or interface represented by this Class object, including public, protected, default (package) access, and private methods, but excluding inherited methods. 
		for (Method method : m) 
		{
			System.out.println(method.getName());
		}
		
		Constructor[] c = classe.getConstructors();	//Returns an array containing Constructor objects reflecting all the public constructors of the class represented by this Class object.
		for (Constructor constructor : c) 
		{
			System.out.println(constructor);
		}
		
		Object o = classe.newInstance();	//Creates a new instance of the class represented by this Class object. 
		Method md = classe.getMethod("Deposite", double.class);		//Returns a Method object that reflects the specified public member method of the class or interface represented by this Class object
		md.invoke(o, 130);	//Invokes the underlying method represented by this Method object, on the specified object with the specified parameters.
		Method me = classe.getMethod("ShowBalance");	//Returns a Method object that reflects the specified public member method of the class or interface represented by this Class object. 
		me.invoke(o);
		
		Constructor client = classe.getConstructor(String.class, double.class);//Returns a Constructor object that reflects the specified public constructor of the class represented by this Class object. 
		Object co = client.newInstance("Valdeci", 10000.00);
		me.invoke(co);
		
	}

}
