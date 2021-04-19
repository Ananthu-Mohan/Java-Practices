package Class_Examples;

class outer_class
{
	void show_outer()
	{
		System.out.println("Inside outer Class");
	}
	class inner_class
	{
		void show_inner()
		{
			System.out.println("Inside inner Class");
		}
	}
}
public class class_inside_another_class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer_class out = new outer_class();
		out.show_outer();
		outer_class.inner_class obj = new outer_class().new inner_class(); // to access inner class that is inside the outer class 
		obj.show_inner();
	}

}
