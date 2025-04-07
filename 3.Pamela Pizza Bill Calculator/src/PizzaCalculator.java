import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.border.TitledBorder;

public class PizzaCalculator extends JFrame {

	private JPanel contentPane;
	private JTextField txtID;
	private JTextField txtName;
	private JTextField txtQty;
	private JTextField txtRate;
	private JTextField txtAmount;
	private JTextField txtTop;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PizzaCalculator frame = new PizzaCalculator();
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
	public PizzaCalculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 832, 509);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		int rate=0,qty,amount,costTops=0;
		String Name;
		
		JLabel lblNewLabel = new JLabel("PAMELA'S PIZZA BILL CALCULATOR");
		lblNewLabel.setForeground(Color.BLUE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 23));
		lblNewLabel.setBounds(193, 11, 483, 59);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Order No.");
		lblNewLabel_1.setBounds(10, 98, 49, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Customer Name");
		lblNewLabel_2.setBounds(10, 139, 49, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Quantity");
		lblNewLabel_3.setBounds(10, 164, 49, 14);
		contentPane.add(lblNewLabel_3);
		
		txtID = new JTextField();
		txtID.setBounds(78, 95, 96, 20);
		contentPane.add(txtID);
		txtID.setColumns(10);
		
		txtName = new JTextField();
		txtName.setBounds(78, 136, 96, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtQty = new JTextField();
		txtQty.setBounds(69, 161, 96, 20);
		contentPane.add(txtQty);
		txtQty.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Rate");
		lblNewLabel_4.setBounds(355, 98, 49, 14);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Amount");
		lblNewLabel_5.setBounds(355, 139, 49, 14);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Cost Of Toppings");
		lblNewLabel_6.setBounds(355, 164, 49, 14);
		contentPane.add(lblNewLabel_6);
		
		txtRate = new JTextField();
		txtRate.setBounds(433, 95, 96, 20);
		contentPane.add(txtRate);
		txtRate.setColumns(10);
		
		txtAmount = new JTextField();
		txtAmount.setBounds(433, 136, 96, 20);
		contentPane.add(txtAmount);
		txtAmount.setColumns(10);
		
		txtTop = new JTextField();
		txtTop.setBounds(433, 161, 96, 20);
		contentPane.add(txtTop);
		txtTop.setColumns(10);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "PIZZA TYPE", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(10, 205, 269, 165);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rbnPan = new JRadioButton("Pan Pizza");
		rbnPan.setBounds(6, 7, 111, 23);
		panel.add(rbnPan);
		
		JRadioButton rbnCrust = new JRadioButton("Stuffed Crust");
		rbnCrust.setBounds(6, 50, 111, 23);
		panel.add(rbnCrust);
		
		JRadioButton rbnRegular = new JRadioButton("Regular");
		rbnRegular.setBounds(6, 102, 111, 23);
		panel.add(rbnRegular);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Toppings", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(355, 205, 281, 165);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chkOnion = new JCheckBox("Onion");
		chkOnion.setBounds(6, 7, 99, 23);
		panel_1.add(chkOnion);
		
		JCheckBox chkCheese = new JCheckBox("Cheese");
		chkCheese.setBounds(6, 43, 99, 23);
		panel_1.add(chkCheese);
		
		JCheckBox chkTomato = new JCheckBox("Tomato");
		chkTomato.setBounds(6, 86, 99, 23);
		panel_1.add(chkTomato);
		
		JCheckBox chkCorn = new JCheckBox("Corn");
		chkCorn.setBounds(6, 122, 99, 23);
		panel_1.add(chkCorn);
		
		JButton btnNewButton = new JButton("Generate Bill");
		btnNewButton.setBounds(10, 381, 198, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Clear");
		btnNewButton_1.setBounds(355, 381, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(20, 417, 619, 44);
		contentPane.add(textArea);
	}
}
