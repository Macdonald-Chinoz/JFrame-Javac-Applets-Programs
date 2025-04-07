import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class employee extends Applet implements ActionListener{
	JLabel lb;
	JLabel lb1;
	JLabel lb2;
	JButton b;
	JTextField tf;
	JTextField tf1;
	
	public void init(){
		lb=new JLabel("Employee Names:");
		lb.setBounds(20,40,130,20);
		
		tf=new JTextField();
		tf.setBounds(130,40,150,20);
		
		lb1=new JLabel("Job Title:");
		lb1.setBounds(20,70,130,20);
		
		tf1=new JTextField();
		tf1.setBounds(130,70,130,20);
		
		lb2=new JLabel("Employee's title");
		lb2.setBounds(100,100,210,20);
		
		b=new JButton("Click");
		b.setBounds(80,150,70,40);
		
		add(lb);
		add(tf);
		add(lb1);
		add(tf1);
		add(lb2);
		add(b);
		b.addActionListener(this);
		setLayout(null);
	}
	public void actionPerformed(ActionEvent e){
		String s1=tf.getText();
		String s2=tf1.getText();
		
		String result=s1+ " " +s2;
		lb2.setText(result);
	}
}
		