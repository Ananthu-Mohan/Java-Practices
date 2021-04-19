package polymorphism;

abstract class abstract_demo
{
	abstract void show();
}
class tests extends abstract_demo
{
	void show()
	{
		System.out.println("Abstract Method and class Example");
	}
}
public class abstract_example{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		tests t = new tests();
		t.show();

	}

}
