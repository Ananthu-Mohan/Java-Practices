package polymorphism;

class constructOverloading
{
	int a ,b ,c;
	constructOverloading()
	{
		a = 10;
		b = 20;
		c = a+b;
		System.out.println("Default Consturctor 1 Sum = "+c);
	}
	constructOverloading(int x, int y)
	{
		a = x;
		b = y;
		c = a+b;
		System.out.println("Parameterizied Consturctor 2 Sum = "+c);
	}
	constructOverloading(int x, int y, int z)
	{
		a = x;
		b = y;
		c = z+a+b;
		System.out.println("Parameterizied Consturctor 3 Sum = "+c);
	}
	
}
public class compile_time_constructor_overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new constructOverloading();
		new constructOverloading(67,89);
		new constructOverloading(90,67,54);
		
	}

}
