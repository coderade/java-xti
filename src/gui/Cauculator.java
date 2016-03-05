package gui;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Cauculator extends JFrame
{
	JButton one, two, three, four, five, six, seven, eight, nine, zero, sum, minus, div, mult, result, clear;
	JTextField display = new JTextField(20);
	int val1, val2 = 0;
	Double res = Double.NaN;
	String op;
	
	
	
	public Cauculator() 
	{
		super("Calculator");
		
		Container numbers = new JPanel();
		numbers.setLayout(new GridLayout(4,4));
		display.setFont(new Font("serif", Font.PLAIN, 26));
		Container screen = getContentPane();
		screen.add(BorderLayout.NORTH, display);
		screen.add(BorderLayout.CENTER, numbers);
		
		seven = new JButton("7");
		seven.addActionListener(new Seven());
		eight = new JButton("8");
		eight.addActionListener(new Eight());
		nine = new JButton("9");
		nine.addActionListener(new Nine());
		div = new JButton("/");
		div.addActionListener(new Division());
		four = new JButton("4");
		four.addActionListener(new Four());
		five = new JButton("5");
		five.addActionListener(new Five());
		six = new JButton("6");
		six.addActionListener(new Six());
		mult = new JButton("*");
		mult.addActionListener(new Multiplication());
		one = new JButton("1");
		one.addActionListener(new One());
		two = new JButton("2");
		two.addActionListener(new Two());
		three = new JButton("3");
		three.addActionListener(new Three());
		sum = new JButton("+");
		sum.addActionListener(new Sum());
		zero = new JButton("0");
		zero.addActionListener(new Zero());
		clear = new JButton("C");
		clear.addActionListener(new Clear());
		result = new JButton("=");
		result.addActionListener(new Result());
		minus = new JButton("-");
		minus.addActionListener(new Substration());
		
		numbers.add (seven);
		numbers.add (eight);
		numbers.add (nine);
		numbers.add (div);
		numbers.add (four);
		numbers.add (five);
		numbers.add (six);
		numbers.add (mult);
		numbers.add (one);
		numbers.add (two);
		numbers.add (three);
		numbers.add (sum);
		numbers.add (zero);
		numbers.add (clear);
		numbers.add (result);
		numbers.add (minus);
		
		
		setSize(300,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}

	public static void main(String args[])
	{
		new Cauculator();
	}
	
	class One implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == one && val1>= 0 )
			{
				display.setText("1");
				val1 = 1;
				
			}
			else if (e.getSource() == one && val1 >=0 )
			{
				display.setText("1");
				val2 = 1;
				
			}
			
			
		}
		
	}
	
	class Two implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == two && val1 ==Double.NaN )
			{
				display.setText("2");
				val1 = 2;
				
			}
			else if (e.getSource() == one && val1 >=0 )
			{
				display.setText("2");
				val2 = 2;
				
			}
			
		}
		
	}
	
	class Three implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == three && val1 ==Double.NaN )
			{
				display.setText("3");
				val1 = 3;
				
			}
			else if (e.getSource() == three && val1 >=0 )
			{
				display.setText("3");
				val2 = 3;
				
			}
			
			
		}
		
	}
	
	class Four implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == four && val1 ==Double.NaN )
			{
				display.setText("4");
				val1 = 4;
				
			}
			else if (e.getSource() == four && val1 >=0 )
			{
				display.setText("4");
				val2 = 4;
				
			}
			
			
		}
		
	}
	
	class Five implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == five && val1 ==Double.NaN )
			{
				display.setText("5");
				val1 = 5;
				
			}
			else if (e.getSource() == five && val1 >=0 )
			{
				display.setText("5");
				val2 = 5;
				
			}
			
			
		}
		
	}
	
	
	class Six implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == six && val1 ==Double.NaN )
			{
				display.setText("6");
				val1 = 6;
				
			}
			else if (e.getSource() == six && val1 >=0 )
			{
				display.setText("6");
				val2 = 6;
				
			}
			
			
		}
		
	}
	
	class Seven implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == seven && val1 ==Double.NaN )
			{
				display.setText("7");
				val1 = 7;
				
			}
			else if (e.getSource() == seven && val1 >=0 )
			{
				display.setText("7");
				val2 = 7;
				
			}
			
			
		}
		
	}
	
	class Eight implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == eight && val1 ==Double.NaN )
			{
				display.setText("8");
				val1 = 8;
				
			}
			else if (e.getSource() == eight && val1 >=0 )
			{
				display.setText("8");
				val2 = 8;
				
			}
			
			
		}
		
	}
	
	class Nine implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == nine && val1 ==Double.NaN )
			{
				display.setText("9");
				val1 = 9;
				
			}
			else if (e.getSource() == nine && val1 >=0 )
			{
				display.setText("9");
				val2 = 9;
				
			}
			
			
		}
		
	}
	
	class Zero implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (e.getSource() == zero && val1 == Double.NaN )
			{
				display.setText("0");
				val1 = 0;
				
			}
			else if (e.getSource() == zero && val1 >=0 )
			{
				display.setText("0");
				val2 = 0;
				
			}
			
			
		}
		
	}
	
	class Sum implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			op= "Sum";
			display.setText("");
			
		}
		
	}
	
	class Substration implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			op= "Sub";
			display.setText("");	
		}
		
	}
	
	class Division implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			op= "Div";
			display.setText("");
			
		}
		
	}
	
	class Multiplication implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			op= "Mult";
			display.setText("");
		}
		
	}

	class Result implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			if (op == "Sum")
			{
				res = (double) (val1 + val2);
				display.setText(res.toString());
			}
			
			else if (op == "Sub")
			{
				res = (double) (val1 - val2);
				display.setText(res.toString());
			}
			
			else if (op == "Div")
			{
				res = (double) (val1 / val2);
				display.setText(res.toString());
			}
			
			else 
			{
				res = (double) (val1 * val2);
				display.setText(res.toString());
			}
			
		}
		
	}
	
	class Clear implements ActionListener 
	{

		@Override
		public void actionPerformed(ActionEvent e) 
		{
			display.setText("");
			val1= 0;
			val2= 0;
			res= (double) 0;
			
		}
		
	}

	
	}
	
