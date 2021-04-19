package listneres;

import java.awt.event.*;
import javax.swing.*;

class application_1 extends JFrame implements ActionListener
{
	JTextField t1,t2,t3;
	JButton b1,b2,b3,b4,b5;
	JLabel l1,l2,l3;
	application_1()
	{
		setLayout(null);
		//JLabels
		l1 = new JLabel("Enter First Number : ");
		add(l1);
		l1.setBounds(50,50,115,40);
		
		l2 = new JLabel("Enter Second Number :");
		add(l2);
		l2.setBounds(50,100,130,40);
		
		l3 = new JLabel("Result :");
		add(l3);
		l3.setBounds(50,150,75,40);
		//JTextFields
		t1 = new JTextField();
		add(t1);
		t1.setBounds(250,60,150,20);
		
		t2 = new JTextField();
		add(t2);
		t2.setBounds(250,110,150,20);
		
		t3 = new JTextField();
		add(t3);
		t3.setBounds(250,160,150,20);
		//JButtons
		b1 = new JButton("Add");
		add(b1);
		b1.addActionListener(this);
		b1.setBounds(50,250,70,30);
		
		b2 = new JButton("Sub");
		add(b2);
		b2.addActionListener(this);
		b2.setBounds(150,250,70,30);
		
		b3 = new JButton("Product");
		add(b3);
		b3.addActionListener(this);
		b3.setBounds(250,250,100,30);
		
		b4 = new JButton("Divide");
		add(b4);
		b4.addActionListener(this);
		b4.setBounds(380,250,70,30);
		
		b5 = new JButton("Modulus");
		add(b5);
		b5.addActionListener(this);
		b5.setBounds(480,250,100,30);
		
		setVisible(true);
		setSize(700,500);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			int a , b, c;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = a + b;
			t3.setText(" "+c);
		}
		if(ae.getSource()==b2)
		{
			int a , b, c;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = a - b;
			t3.setText(" "+c);
		}
		if(ae.getSource()==b3)
		{
			int a , b, c;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = a * b;
			t3.setText(" "+c);
		}
		if(ae.getSource()==b4)
		{
			int a , b, c;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = a / b;
			t3.setText(" "+c);
		}
		if(ae.getSource()==b5)
		{
			int a , b, c;
			a = Integer.parseInt(t1.getText());
			b = Integer.parseInt(t2.getText());
			c = a % b;
			t3.setText(" "+c);
		}
	}
}
public class action_list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new application_1();
	}

}
