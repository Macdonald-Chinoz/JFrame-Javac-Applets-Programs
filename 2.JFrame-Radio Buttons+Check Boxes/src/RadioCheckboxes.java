import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JCheckBox;
import javax.swing.JRadioButton;
import javax.swing.border.TitledBorder;

public class RadioCheckboxes extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RadioCheckboxes frame = new RadioCheckboxes();
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
	public RadioCheckboxes() {
		setTitle("RADIO/COMBO");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 326);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "Radio Buttons", TitledBorder.LEFT, TitledBorder.TOP, null, null));
		panel.setBounds(10, 11, 174, 267);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("4 Slices");
		rdbtnNewRadioButton.setBounds(6, 17, 111, 23);
		panel.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("3 Slices");
		rdbtnNewRadioButton_1.setBounds(6, 92, 111, 23);
		panel.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("12 Slices");
		rdbtnNewRadioButton_2.setBounds(6, 166, 111, 23);
		panel.add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("16 Slices");
		rdbtnNewRadioButton_3.setBounds(6, 222, 111, 23);
		panel.add(rdbtnNewRadioButton_3);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "Check Boxes", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(411, 11, 175, 267);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("Anchovies");
		chckbxNewCheckBox.setBounds(6, 27, 99, 23);
		panel_1.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("Garlic");
		chckbxNewCheckBox_1.setBounds(6, 82, 99, 23);
		panel_1.add(chckbxNewCheckBox_1);
		
		JCheckBox chckbxNewCheckBox_2 = new JCheckBox("Onions");
		chckbxNewCheckBox_2.setBounds(6, 174, 99, 23);
		panel_1.add(chckbxNewCheckBox_2);
		
		JCheckBox chckbxNewCheckBox_3 = new JCheckBox("Spinach");
		chckbxNewCheckBox_3.setBounds(6, 237, 99, 23);
		panel_1.add(chckbxNewCheckBox_3);
	}
}
