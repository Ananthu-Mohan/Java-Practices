package awt_Examples;

import java.awt.*;

public class label_example extends Frame{

	label_example()
	{
		setLayout(null);
		Label l = new Label("Name");
		add(l);
		l.setBounds(100,100,50,20);
		setVisible(true);
		setSize(500,500);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new label_example();
	}

}
