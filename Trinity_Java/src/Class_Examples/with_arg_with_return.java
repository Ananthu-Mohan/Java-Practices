package Class_Examples;

abstract class demo_3
{
	static int add(int a , int b)
	{
		int sum;
		sum = a + b;
		return sum;
	}
}
public class with_arg_with_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//demo_3 d = new demo_3();
		int total = demo_3.add(10, 20);
		System.out.println("returned Sum is "+total);
	}

}
