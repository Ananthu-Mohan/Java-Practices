package new_pack;

import java.applet.*;
import java.awt.*;

public class prg_5 extends Applet {
	public void paint(Graphics g)
	{
		int[] A = {150,120,115};
		int[] B = {151,100,120};
		g.drawPolygon(A,B,3);
	}

}
