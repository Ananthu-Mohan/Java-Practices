package awt_Examples;

import java.awt.*;

public class text_field extends Frame{

	text_field()
	{
		setLayout(null);
		
		Label l = new Label("Name");
		add(l);
		l.setBounds(100,100,50,20);
		
		Label l1 = new Label("Address");
		add(l1);
		l1.setBounds(100,170,50,20);
		
		Label l2 = new Label("Password");
		add(l2);
		l2.setBounds(100,260,70,20);
		
		TextField t = new TextField();
		add(t);
		t.setBounds(170,100,150,20);
		
		TextArea ta = new TextArea();
		add(ta);
		ta.setBounds(170,170,150,80);
		
		TextField pwd = new TextField();
		pwd.setEchoChar('*');
		add(pwd);
		pwd.setBounds(170,260,150,20);
		
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new text_field();
	}

}
