package awt_Examples;
import java.awt.*;
public class null_layout extends Frame{
    
	null_layout()
	{
		setLayout(null);
		setVisible(true);
		Button b1 = new Button("Button");
		add(b1);
		b1.setBounds(100,100,150,40);
		setSize(500,500);
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new null_layout();
	}

}
