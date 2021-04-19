package OOPS;

class Box
{
	int width,height,depth;
	int result;
	Box(int x, int y, int z)
	{
		width = x;
		height = y;
		depth = z;
	}
	int volume()
	{
		result = width*height*depth;
		return result;
	}
}

public class prg1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Box b = new Box(3,4,5);
		int rs;
		rs = b.volume();
		System.out.println("Volume = "+rs);

	}

}
