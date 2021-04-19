package awt_Examples;

import javax.swing.*;
import java.awt.*;
class first extends JPanel
{
	first()
	{
		JLabel l = new JLabel("First");
		add(l);
		l.setBounds(50,50,50,40);
		JOptionPane.showMessageDialog(this, "Successfully entered first","Admin",0/1/2/3);
		String head [] = {"id","Name","Address"};
		String data[][] = { {"1","Ananthu","Sasthamanagalam"},{"2","Lekshmi","Velapilshala"} };
		JTable jt = new JTable(data,head);
		
		jt.setBounds(10,100,500,300);
		add(jt);
	}
}
class second extends JPanel
{
	second()
	{
		JLabel l1 = new JLabel("second");
		add(l1);
		l1.setBounds(50,50,50,40);
		JOptionPane.showConfirmDialog(this, "Do you want to enter second?","Admin",0/1/2/3);
		
		
	}
}
class third extends JPanel
{
	third()
	{
		JLabel l2 = new JLabel("Third");
		add(l2);
		l2.setBounds(50,50,50,40);
		JOptionPane.showInputDialog(this, "Enter key","Admin",0/1/2/3);
	}
}
public class tabbed_pane extends JFrame {
	JTabbedPane jt;
	 tabbed_pane()
	 {
		// setLayout(null);
		 jt = new JTabbedPane();
		 jt.add("First",new first());
		 jt.add("Second",new second());
		 jt.add("Third",new third());
		 add(jt);
		 
		// getContentPane().setBackground(JColorChooser.showDialog(this,"Color",Color.white));
			JFileChooser js = new JFileChooser();
			js.showOpenDialog(this);
			add(js);
		 setTitle("Tabbed Pane");
		 setVisible(true);
		 setSize(500,500);
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new tabbed_pane();
	}

}
