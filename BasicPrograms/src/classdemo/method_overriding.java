package classdemo;

class Method1
{
	public int a =10;
	public int b =20;
	public int c;
	void sum()
	{
		c = a+ b;
		System.out.println(c);
	}
}
class Method2 extends Method1
{
	int a = 30;
	int b =50;
	int c;
	void sum() {
		c = a+b;
		System.out.println(c);
	}
}

public class method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Method2 M = new Method2();
		M.sum();
		Method1 M1 = new Method1();
		M1.sum();
	}

}
