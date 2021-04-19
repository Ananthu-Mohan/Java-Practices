package awt_Examples;
import java.awt.*;
public class border_layout extends Frame{
	
	border_layout()
	{
		setLayout(new BorderLayout(100,100));
		Button b1 = new Button("North");
		add(b1,BorderLayout.NORTH);
		Button b2 = new Button("South");
		add(b2,BorderLayout.SOUTH);
		Button b3 = new Button("East");
		add(b3,BorderLayout.EAST);
		Button b4 = new Button("West");
		add(b4,BorderLayout.WEST);
		setVisible(true);
		setSize(500,500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new border_layout();
	}

}
