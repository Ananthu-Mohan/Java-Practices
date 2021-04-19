package polymorphism;

final class exam // can't inherit its properties
{
	final int  i =10;
	final int x = 20;
	final void sum() //final method can't be overriden
	{
		final int c = i + x;
		System.out.println("Sum ="+c);
	}
	
}
public class final_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		exam e = new exam();
		e.sum();
	}

}

