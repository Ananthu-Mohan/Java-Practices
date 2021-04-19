package awt_Examples;
import java.awt.*;
public class grid_layout extends Frame {
	grid_layout()
	{
		setLayout(new GridLayout(4,0,50,50));
		Button b = new Button("Button_1");
		add(b);
		Button b1 = new Button("Button_2");
		add(b1);
		Button b2 = new Button("Button_3");
		add(b2);
		Button b3 = new Button("Button_4");
		add(b3);
		Button b4 = new Button("Button_5");
		add(b4);
		setTitle("GridLayout");
		setVisible(true);
		setSize(500,500);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new grid_layout();
	}

}
