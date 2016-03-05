package collections;

import java.util.ArrayList;

public class JGenerics <E>
{
	E element;  

	public void setElement(E element)
	{
		this.element = element;
		
	}
	
	public E getElement ()
	{
		return element;
	}
	
	public Double Sum (ArrayList<? extends Number> list)
	{
		double total = 0;
		for (Number number : list) 
		{
		  total +=	total + number.doubleValue();
		  
		}
		return total;
		
	}
	
	public static void main(String[] args) 
	{
		JGenerics<String> g = new JGenerics<>();
		g.setElement("Palmeiras");
		//g.setElement(1234);
		g.getElement().toUpperCase();
		
	}

}
