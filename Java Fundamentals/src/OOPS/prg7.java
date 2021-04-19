package OOPS;

class shape
{
	void draw()
	{
		System.out.println("Drawing Shape...");
	}
	void erase()
	{
		System.out.println("Erasing Shape...");
	}
}
class circle extends shape
{
	void draw()
	{
		System.out.println("Drawing Circle...");
	}
	void erase()
	{
		System.out.println("Erasing Circle...");
	}
}
class triangle extends shape
{
	void draw()
	{
		System.out.println("Drawing Triangle...");
	}
	void erase()
	{
		System.out.println("Erasing Triangle...");
	}
}
class square extends shape
{
	void draw()
	{
		System.out.println("Drawing Square...");
	}
	void erase()
	{
		System.out.println("Erasing Square...");
	}
}
public class prg7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shape c = new circle();
		shape t = new triangle();
		shape s = new square();
		c.draw();
		c.erase();
		t.draw();
		t.erase();
		s.draw();
		s.erase();

	}

}
