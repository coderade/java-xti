import javax.swing.Box;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MathTest 
{

	public static void main(String[] args) 
	{
		
	Mathe math = new Mathe();
//		int highest = math.Highest(10, 8);
//		System.out.println("The highest number is: " + highest);
////		double res = math.Sum(50, 30);
//		System.out.println("The sum of number is: " + res);
		/*	
		int odd = math.Highest(50, 60);
		int even = math.Highest(25, 31);
		
		double res = math.Sum("The sum of all numbers is : ",2,5,6,8,9,0);
		System.out.println(res);
		
		String rnum = JOptionPane.showInputDialog("Enter a number!");
		int numb = Integer.parseInt(rnum);
		
		int result = math.SquareRoot(numb);
		double sqrt = Math.sqrt(numb);
		NumberFormat formatter = new DecimalFormat("#0.0000");
		String sqrtf = formatter.format(sqrt);
		JOptionPane.showMessageDialog(null, "The integer square root of the number " 
		+ rnum + " is "+ result + "," + "\n" + "and the real square root is " + sqrtf  + "!");
		
*/		
		JPanel numbers = new JPanel();
		JTextField n1 = new JTextField (10);
		JTextField n2 = new JTextField (10);
		numbers.add(new JLabel("número 01: "));
		numbers.add(n1);
		numbers.add(Box.createHorizontalStrut(15));// add a spacer in the panel
		numbers.add(new JLabel("número 02: "));
		numbers.add(n2);	
		
		int n = JOptionPane.showConfirmDialog(null, numbers, 
	               "Please enter the first and second number", JOptionPane.OK_CANCEL_OPTION);
		
		int no1 = 0;
		int no2 = 0;
		
		if (n == JOptionPane.OK_OPTION)
		{
			String num1 = n1.getText();
			no1 = Integer.parseInt(num1);
			
			String num2 =n2.getText();
			no2 = Integer.parseInt(num2);
		}
		double nAverage = math.average(no1, no2);
		
		JOptionPane.showMessageDialog(null, "The average of numbers is: " + nAverage);
	
		
		/*
		System.out.print(" The average is: " + math.average(10,4));
		System.out.print(" The average is: " + math.average(3,2,10));
		System.out.print(" The average is: " + math.average("10","30"));
		System.out.print(" The average is: " + math.average(10));
	
*/
	}

}
