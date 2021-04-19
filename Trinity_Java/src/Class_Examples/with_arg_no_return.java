package Class_Examples;
class demo_2
{
	void add(int a, int b)
	{
		int sum;
		sum = a + b;
		System.out.println("Sum is "+sum);
	}
}
public class with_arg_no_return {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		demo_2 d = new demo_2();
		d.add(10,20);
	}

}
