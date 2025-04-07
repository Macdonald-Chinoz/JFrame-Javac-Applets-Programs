import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;

public class FormObjects extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FormObjects frame = new FormObjects();
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
	public FormObjects() {
		setTitle("FormObjects");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 741, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(459, 42, 258, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(459, 73, 258, 218);
		contentPane.add(textArea);
		
		JButton btnNewButton = new JButton("GET DROP DOWN ITEM");
		btnNewButton.setBounds(281, 41, 168, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("SELECTED ITEMS");
		btnNewButton_1.setBounds(281, 146, 168, 23);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(10, 35, 227, 35);
		contentPane.add(comboBox);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 147, 234, 144);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("C SHARP");
		chckbxNewCheckBox.setBounds(6, 7, 99, 23);
		panel.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("JAVA");
		chckbxNewCheckBox_1.setBounds(6, 45, 99, 23);
		panel.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("PHP");
		chckbxNewCheckBox_2.setBounds(6, 85, 99, 23);
		panel.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("VISUAL BASIC");
		chckbxNewCheckBox_3.setBounds(6, 114, 99, 23);
		panel.add(chckbxNewCheckBox_3);
	}
}
