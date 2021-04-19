package awt_Examples;
import java.awt.*;

class test extends Frame
{
	test()
	{
		setLayout(new FlowLayout(FlowLayout.CENTER));
		Button b = new Button("Example");
		add(b);
		setTitle("Button Example");
		setVisible(true);
		setSize(500,500);
	}
}
public class button_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new test();
	}

}
