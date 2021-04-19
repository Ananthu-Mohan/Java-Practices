package awt_Examples;

import java.awt.*;

public class check_examples extends Frame
{

	check_examples()
	{
		setLayout(null);
		Checkbox c = new Checkbox("SSLC");
		add(c);
		c.setBounds(100,100,50,40);
		
		Checkbox c1 = new Checkbox("HSC");
		add(c1);
		c1.setBounds(170,100,50,40);
		
		Checkbox c2 = new Checkbox("UG");
		add(c2);
		c2.setBounds(230,100,50,40);
		
		Checkbox c3 = new Checkbox("PG");
		add(c3);
		c3.setBounds(290,100,50,40);
		
		CheckboxGroup cg = new CheckboxGroup();
		
		Checkbox cb = new Checkbox("Male",cg,true);
		add(cb);
		cb.setBounds(100,200,50,40);
		
		Checkbox cb1 = new Checkbox("Female",cg,true);
		add(cb1);
		cb1.setBounds(170,200,60,40);
		
		Choice cm = new Choice();
		cm.add("TVM");
		cm.add("ERK");
		cm.add("TSR");
		cm.add("PLKD");
		cm.add("VYND");
		
		
		
		
		
		
		
		add(cm);
		cm.setBounds(100,250,100,40);
		
		setTitle("ChechBox,CheckBoxGroup,Choice");
		setVisible(true);
		setSize(500,500);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new check_examples();
	}

}
