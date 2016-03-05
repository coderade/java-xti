package gui;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Converter02 extends JFrame {

	private JPanel contentPane;
	private JTextField tfTemperature;
	private JTextField tfResult;
	private JRadioButton  rdbtnFahrenheit, rdbtnCelsius ;
	private double value, result;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter02 frame = new Converter02();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Converter02() {
		GroupTemperature();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 324, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		tfTemperature = new JTextField();
		tfTemperature.setColumns(10);
		
		
		JButton btnConverter = new JButton("Convert");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				
				DecimalFormat df = new DecimalFormat("#.00");
				try
				{
					 value = Double.parseDouble(tfTemperature.getText());
					
					
					if (rdbtnCelsius.isSelected())
					{
						result = ((value - 32) * 5)/9;
						tfResult.setText (df.format(result) + " °C" );
					}
					else
					{
						result = ((value*9) /5) + 32;
						tfResult.setText (df.format(result) + " °F");
					}
				} 
				
				catch (Exception e2)
				{
					JOptionPane.showMessageDialog(null, "Enter a valid number!");
				}
			}
		});
		
		JButton btnClear = new JButton("Clean");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				tfResult.setText("");
				tfTemperature.setText("");
				value =0;
				result =0;
				
			}
		});
		
		JLabel lblTemperature = new JLabel("Temperature:");
		
		tfResult = new JTextField();
		tfResult.setForeground(Color.BLACK);
		tfResult.setEditable(false);
		tfResult.setColumns(10);
		
		JLabel lblResult = new JLabel("Result:");
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		
		rdbtnCelsius = new JRadioButton("Celsius");
		rdbtnCelsius.setBounds(6, 5, 71, 23);
		panel.add(rdbtnCelsius);
		
		rdbtnFahrenheit = new JRadioButton("Fahrenheit");
		rdbtnFahrenheit.setBounds(89, 5, 96, 23);
		panel.add(rdbtnFahrenheit);
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblTemperature, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfTemperature, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(82)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 191, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(5)
					.addComponent(lblResult, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
					.addGap(10)
					.addComponent(tfResult, GroupLayout.PREFERRED_SIZE, 171, GroupLayout.PREFERRED_SIZE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(71)
					.addComponent(btnConverter, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addComponent(btnClear, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblTemperature))
						.addComponent(tfTemperature, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(10)
					.addComponent(panel, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
					.addGap(24)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(7)
							.addComponent(lblResult))
						.addComponent(tfResult, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
					.addGap(64)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnConverter)
						.addComponent(btnClear)))
		);
		
		contentPane.setLayout(gl_contentPane);
	}
	
	private void GroupTemperature()
	{
		ButtonGroup group = new ButtonGroup();
		group.add(rdbtnCelsius);
		group.add(rdbtnFahrenheit);
		
	}
}
