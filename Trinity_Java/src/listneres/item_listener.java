package listneres;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
class application_2 extends JFrame implements ItemListener
{
	JLabel l1;
	JTextField t1;
	Choice c1;
	application_2()
	{
		setLayout(null);
		
		l1 = new JLabel("The selected one is :");
		add(l1);
		l1.setBounds(50,50,150,40);
		
		t1 = new JTextField();
		add(t1);
		t1.setBounds(250,60,150,20);
		
		c1 = new Choice();
		c1.add("TVM");
		c1.add("ELK");
		c1.add("PKLD");
		c1.add("KSRD");
		c1.addItemListener(this);
		add(c1);
		c1.setBounds(50,150,150,20);
		
		setVisible(true);
		setSize(700,500);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(ie.getSource()==c1)
		{
			t1.setText(c1.getSelectedItem());
		}
	}
}
public class item_listener {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new application_2();
	}

}
