package Class_Examples;

class example_1
{
	int a;
	void show()
	{
		a = 10;
		System.out.println("Inside show function a = "+a);
	}
	example_1(int b)
	{
		a = b;
		System.out.println("Inside parameterizied constructor a = "+a);
	}
}
public class parameterizied_construct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example_1 ex = new example_1(90);
		ex.show();
	}

}
