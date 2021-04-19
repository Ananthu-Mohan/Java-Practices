package Class_Examples;
class outer
{
	void show()
	{
		System.out.println("Inside a show function");
		class func_inner
		{
			void inner()
			{
				System.out.println("Inside a class which is inside the function show()");
			}
		}
		func_inner in = new func_inner();
		in.inner();
	}
}
public class class_inside_a_func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outer out = new outer();
		out.show();
	}

}
