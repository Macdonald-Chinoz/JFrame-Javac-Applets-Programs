package registration;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.event.ActionEvent;
import java.sql.Connection;
public class UserRegister {

	private JFrame frame;
	private JTextField firstname;
	private JTextField lastname;
	private JTextField email;
	private JTextField username;
	private JTextField passwordField;
	private JTextField mob;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UserRegister window = new UserRegister();
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
	public UserRegister() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 663, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("NEW USER REGISTER");
		lblNewLabel.setFont(new Font("Arial Black", Font.BOLD, 17));
		lblNewLabel.setBounds(219, 11, 257, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(10, 53, 81, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Last Name");
		lblNewLabel_2.setBounds(10, 106, 81, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Email Address");
		lblNewLabel_3.setBounds(10, 159, 81, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("UserName");
		lblNewLabel_4.setBounds(360, 53, 81, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Password");
		lblNewLabel_5.setBounds(360, 106, 81, 14);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("Mobile Number");
		lblNewLabel_6.setBounds(360, 159, 81, 14);
		frame.getContentPane().add(lblNewLabel_6);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName=firstname.getText();
				String lastName=lastname.getText();
				String emailId=email.getText();
				String userName=username.getText();
				String mobileNumber=mob.getText();
				int len=mobileNumber.length();
				String password=passwordField.getText();
				
				String msg="" + firstName;
				msg += " \n";
				if(len != 10) {
					JOptionPane.showMessageDialog(btnRegister, "Enter a valid mobile number");
			}
				
			try {
				Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/swing_demo","root","1234");
				String query="INSERT INTO account values('"+firstName+"','"+lastName+"','"+userName+"','"+password+"','"+emailId+"','"
				+mobileNumber+"')'";
				Statement sta=connection.createStatement();
				int x=sta.executeUpdate(query);
				if (x == 0) {
					JOptionPane.showMessageDialog(btnRegister, "This is already exist");
				}else {
					JOptionPane.showMessageDialog(btnRegister, "Welcome, "+ msg + "Your account is successfully");
				}
				connection.close();
			}catch(Exception exception) {
				exception.printStackTrace();
			}
			}
		});
		btnRegister.setBounds(219, 211, 222, 41);
		frame.getContentPane().add(btnRegister);
		
		firstname = new JTextField();
		firstname.setBounds(120, 50, 96, 20);
		frame.getContentPane().add(firstname);
		firstname.setColumns(10);
		
		lastname = new JTextField();
		lastname.setBounds(120, 103, 96, 20);
		frame.getContentPane().add(lastname);
		lastname.setColumns(10);
		
		email = new JTextField();
		email.setBounds(120, 156, 96, 20);
		frame.getContentPane().add(email);
		email.setColumns(10);
		
		username = new JTextField();
		username.setBounds(472, 50, 96, 20);
		frame.getContentPane().add(username);
		username.setColumns(10);
		
		passwordField = new JTextField();
		passwordField.setBounds(472, 103, 96, 20);
		frame.getContentPane().add(passwordField);
		passwordField.setColumns(10);
		
		mob = new JTextField();
		mob.setBounds(472, 156, 96, 20);
		frame.getContentPane().add(mob);
		mob.setColumns(10);
	}
}
