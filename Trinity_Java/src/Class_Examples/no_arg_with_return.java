package Class_Examples;

class demo_1
{
	int read()
	{
		int a =10;
		return a;
	}
}
public class no_arg_with_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_1 d = new demo_1();
		int b = d.read();
		System.out.println("returned value = "+b);
	}

}
