package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class Converter extends JFrame {

	private JPanel contentPane;
	private JTextField tfValue;
	private JTextField tfResult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Converter frame = new Converter();
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
	public Converter() {
		setTitle("Temperature Converter");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 399, 232);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{	
				DecimalFormat df = new DecimalFormat("#.00"); 
				
				try 
				{
					double fahrenheit = Double.parseDouble(tfValue.getText());
					double celsius = (fahrenheit - 32)/1.8;
					tfResult.setText(df.format(celsius) + " °C");
				} 
				catch (Exception error) 
				{
					JOptionPane.showMessageDialog(null, "Enter a valid number!");
				}
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFarenheit = new JLabel("Farenheit:");
		lblFarenheit.setHorizontalAlignment(SwingConstants.CENTER);
		lblFarenheit.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblFarenheit);
		
		tfValue = new JTextField();
		tfValue.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(tfValue);
		tfValue.setColumns(10);
		
		JLabel lblCelcius = new JLabel("Celsius:");
		lblCelcius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelcius.setFont(new Font("Tahoma", Font.PLAIN, 25));
		panel.add(lblCelcius);
		
		tfResult = new JTextField();
		tfResult.setEditable(false);
		tfResult.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(tfResult);
		tfResult.setColumns(10);
	}

}
