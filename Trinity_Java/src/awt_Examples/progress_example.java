package awt_Examples;

import javax.swing.*;
import java.util.*;
import java.awt.*;
class  progess_ex extends JFrame
{
	progess_ex()
	{
		int n;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the limit");
		n = S.nextInt();
		setLayout(null);
		
		
		JProgressBar pb = new JProgressBar();
		pb.setBackground(Color.white);
		pb.setForeground(Color.green);
		for(int i = 0;i<=n;i++)
		{
			pb.setValue(i);
		}
		pb.setStringPainted(true);
		pb.setBounds(50, 100, 150, 25);
		add(pb);
		pb.setIndeterminate(true);
		
		JSlider js = new JSlider();
		js.setMinorTickSpacing(1);
		js.setMajorTickSpacing(5);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		js.setValue(100);
		js.setBounds(50,200,500,125);
		add(js);
		
		ImageIcon ic = new ImageIcon("F:\\My wallpapers\\New wallpapers1\\new wallpapers\\FHD wallpaper\\norway-1920x1080-lofoten-islands-europe-mountains-sea-sunrise-5k-16595.jpg");
		JLabel l = new JLabel(ic);
		add(l);
		l.setBounds(50,300,100,100);
		
		setVisible(true);
		setSize(700,700);
	}
}

public class progress_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new progess_ex();
	}

}
