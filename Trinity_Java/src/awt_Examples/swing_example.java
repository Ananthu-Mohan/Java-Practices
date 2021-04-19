package awt_Examples;

import javax.swing.*;

class swing_application extends JFrame
{
	JMenu m1,m2,m3;
	JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12;
	swing_application()
	{
		setLayout(null);
		
		//Labels
		JLabel l_name = new JLabel("Name");
		add(l_name);
		l_name.setBounds(50, 50, 50, 40);
		JLabel l_pwd = new JLabel("Password");
		add(l_pwd);
		l_pwd.setBounds(50, 120, 60, 40);
		JLabel l_email = new JLabel("Email");
		add(l_email);
		l_email.setBounds(50, 190, 50, 40);
		JLabel l_qual = new JLabel("Qualification");
		add(l_qual);
		l_qual.setBounds(50, 260, 70, 40);
		JLabel l_gender = new JLabel("Gender");
		add(l_gender);
		l_gender.setBounds(50, 330, 50, 40);
		JLabel l_add = new JLabel("Address");
		add(l_add);
		l_add.setBounds(50, 400, 50, 40);
		JLabel l_country = new JLabel("Country");
		add(l_country);
		l_country.setBounds(50,550,50,40);
		JLabel l_phone = new JLabel("Phone");
		add(l_phone);
		l_phone.setBounds(50,600,50,40);
		
		//Text Fields
		JTextField t1 = new JTextField();
		add(t1);
		t1.setBounds(200,60,150,20);
		JPasswordField t2 = new JPasswordField();
		add(t2);
		t2.setBounds(200,130,150,20);
		JTextField t3 = new JTextField();
		add(t3);
		t3.setBounds(200,200,150,20);
		JTextField t4 = new JTextField();
		add(t4);
		t4.setBounds(200,610,150,20);
		
		//Text Areas
		JTextArea ta = new JTextArea();
		add(ta);
		ta.setBounds(200,410,250,100);
		
		//Check-Box
		JCheckBox cb_1 = new JCheckBox("SSLC");
		add(cb_1);
		cb_1.setBounds(200,270,70,20);
		JCheckBox cb_2 = new JCheckBox("12th");
		add(cb_2);
		cb_2.setBounds(270,270,50,20);
		JCheckBox cb_3 = new JCheckBox("UG");
		add(cb_3);
		cb_3.setBounds(340,270,50,20);
		JCheckBox cb_4 = new JCheckBox("PG");
		add(cb_4);
		cb_4.setBounds(410,270,50,20);
		
		//Check-Box Group
		ButtonGroup cg = new ButtonGroup();
		JRadioButton c_male = new JRadioButton("Male");
		cg.add(c_male);
		add(c_male);
		c_male.setBounds(200,330,100,40);
		JRadioButton c_female = new JRadioButton("Female");
		cg.add(c_female);
		c_female.setBounds(330,330,120,40);
		add(c_female);
		
		//Choice
		JComboBox ch = new JComboBox();
		ch.addItem("India");
		ch.addItem("Brazil");
		ch.addItem("Switzerland");
		ch.addItem("London");
		ch.addItem("USA");
		ch.addItem("Poland");
		ch.addItem("Korea");
		ch.addItem("China");
		ch.addItem("Japan");
		add(ch);
		ch.setBounds(200,560,150,30);
		
		//Button
		JButton B = new JButton("Register");
		add(B);
		B.setBounds(500,300,150,70);
		
		//Menu Bar
		JMenuBar mb = new JMenuBar();
		m1 = new JMenu("File");
		m2 = new JMenu("Edit");
		m3 = new JMenu("Help");
		
		i1 = new JMenuItem("Open");
		i2 = new JMenuItem("Save");
		i3 = new JMenuItem("Close");
		i4 = new JMenuItem("Exit");
		
		i5 = new JMenuItem("Cut");
		i6 = new JMenuItem("Copy");
		i7 = new JMenuItem("Paste");
		i8 = new JMenuItem("Find/Replace");
		
		i9 = new JMenuItem("Welcome to app");
		i10 = new JMenuItem("Contribute");
		i11 = new JMenuItem("Credits");
		i12 = new JMenuItem("About author");
		
		m1.add(i1);
		m1.add(i2);
		m1.add(i3);
		m1.add(i4);
		
		m2.add(i5);
		m2.add(i6);
		m2.add(i7);
		m2.add(i8);
		
		m3.add(i9);
		m3.add(i10);
		m3.add(i11);
		m3.add(i12);
		
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		setJMenuBar(mb);
		
		setVisible(true);
		setSize(1500,700);
	}
}
public class swing_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new swing_application();

	}

}
