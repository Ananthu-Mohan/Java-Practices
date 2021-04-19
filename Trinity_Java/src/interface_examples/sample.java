package interface_examples;

interface sum
{
	void add();
}
interface diff
{
	void sub();
}
class example implements sum,diff
{
	public void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("Sum = "+c);
	}
	public void sub()
	{
		int a = 10;
		int b = 20;
		int c = a - b;
		System.out.println("diff = "+c);
	}
}
public class sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		example e = new example();
		e.add();
		e.sub();

	}

}
