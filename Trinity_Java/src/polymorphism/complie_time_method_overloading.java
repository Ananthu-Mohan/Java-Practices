package polymorphism;

class methodOverloading
{
	void add()
	{
		int a = 10;
		int b = 20;
		int c = a + b;
		System.out.println("The Sum  = "+c);
	}
	void add(int x , int y)
	{
		int a = x;
		int b = y;
		int c = a + b;
		System.out.println("Second Add function The Sum  = "+c);
	}
	void add(int x, int y, int z)
	{
		int a = x;
		int b = y;
		int c = z + a + b;
		System.out.println("Third Add Function The Sum  = "+c);
	}
}

public class complie_time_method_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodOverloading t1 = new methodOverloading();
		t1.add();
		t1.add(40,50);
		t1.add(70,80,90);
	}

}
