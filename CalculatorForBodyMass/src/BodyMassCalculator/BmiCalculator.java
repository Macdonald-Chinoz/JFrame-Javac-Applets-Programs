package BodyMassCalculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BmiCalculator {

	private JFrame frame;
	private JTextField txtHeight;
	private JTextField txtWeight;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BmiCalculator window = new BmiCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public BmiCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 324, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Heigth(Inches):");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(10, 11, 130, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Weight(Pounds):");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(10, 78, 130, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		txtHeight = new JTextField();
		txtHeight.setBounds(150, 8, 148, 20);
		frame.getContentPane().add(txtHeight);
		txtHeight.setColumns(10);
		
		txtWeight = new JTextField();
		txtWeight.setBounds(150, 75, 148, 20);
		frame.getContentPane().add(txtWeight);
		txtWeight.setColumns(10);
		
		JLabel lbResult = new JLabel("normal-BMI:");
		lbResult.setFont(new Font("Tahoma", Font.BOLD, 11));
		lbResult.setBounds(10, 103, 288, 14);
		frame.getContentPane().add(lbResult);
		
		JButton btnCalculate = new JButton("BMI Calculator inJAVA GUI(CALCULATE)");
		btnCalculate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double weight=Double.parseDouble(txtWeight.getText());
				double height=Double.parseDouble(txtHeight.getText());
				
				double bmi=weight/Math.pow(height,2)*703;
				
				if (bmi<18.5) {
					lbResult.setText("underweight-BMI:"+bmi);
				}else if(bmi<25) {
					lbResult.setText("normal-BMI:"+bmi);
				}else if(bmi<30) {
					lbResult.setText("overweight-BMI:"+bmi);
				}else {
					lbResult.setText("obese-BMI:"+bmi);
				}
			}
		});
		btnCalculate.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnCalculate.setBounds(10, 127, 288, 70);
		frame.getContentPane().add(btnCalculate);
	}
}
