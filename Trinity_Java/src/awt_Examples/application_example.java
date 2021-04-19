package awt_Examples;

import java.awt.*;

class new_application extends Frame
{
	new_application()
	{
		setLayout(null);
		
		//Labels
		Label l_name = new Label("Name");
		add(l_name);
		l_name.setBounds(50, 50, 50, 40);
		Label l_pwd = new Label("Password");
		add(l_pwd);
		l_pwd.setBounds(50, 120, 60, 40);
		Label l_email = new Label("Email");
		add(l_email);
		l_email.setBounds(50, 190, 50, 40);
		Label l_qual = new Label("Qualification");
		add(l_qual);
		l_qual.setBounds(50, 260, 70, 40);
		Label l_gender = new Label("Gender");
		add(l_gender);
		l_gender.setBounds(50, 330, 50, 40);
		Label l_add = new Label("Address");
		add(l_add);
		l_add.setBounds(50, 400, 50, 40);
		Label l_country = new Label("Country");
		add(l_country);
		l_country.setBounds(50,550,50,40);
		Label l_phone = new Label("Phone");
		add(l_phone);
		l_phone.setBounds(50,600,50,40);
		
		//Text Fields
		TextField t1 = new TextField();
		add(t1);
		t1.setBounds(200,60,150,20);
		TextField t2 = new TextField();
		add(t2);
		t2.setEchoChar('*');
		t2.setBounds(200,130,150,20);
		TextField t3 = new TextField();
		add(t3);
		t3.setBounds(200,200,150,20);
		TextField t4 = new TextField();
		add(t4);
		t4.setBounds(200,610,150,20);
		
		//Text Areas
		TextArea ta = new TextArea();
		add(ta);
		ta.setBounds(200,410,250,100);
		
		//Check-Box
		Checkbox cb_1 = new Checkbox("SSLC");
		add(cb_1);
		cb_1.setBounds(200,270,50,20);
		Checkbox cb_2 = new Checkbox("12th");
		add(cb_2);
		cb_2.setBounds(270,270,50,20);
		Checkbox cb_3 = new Checkbox("UG");
		add(cb_3);
		cb_3.setBounds(340,270,50,20);
		Checkbox cb_4 = new Checkbox("PG");
		add(cb_4);
		cb_4.setBounds(410,270,50,20);
		
		//Check-Box Group
		CheckboxGroup cg = new CheckboxGroup();
		Checkbox c_male = new Checkbox("Male",cg,false);
		add(c_male);
		c_male.setBounds(200,330,50,40);
		Checkbox c_female = new Checkbox("Female",cg,false);
		add(c_female);
		c_female.setBounds(270,330,70,40);
		
		//Choice
		Choice ch = new Choice();
		ch.add("India");
		ch.add("Brazil");
		ch.add("Switzerland");
		ch.add("London");
		ch.add("USA");
		ch.add("Poland");
		ch.add("Korea");
		ch.add("China");
		ch.add("Japan");
		add(ch);
		ch.setBounds(200,560,150,40);
		
		//Button
		Button B = new Button("Register");
		add(B);
		B.setBounds(500,300,150,70);
		
		setVisible(true);
		setSize(1500,700);
	}
}
public class application_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new new_application();
	}

}
