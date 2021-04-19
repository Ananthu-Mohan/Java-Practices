package Class_Examples;

class first_class
{
	void read()
	{
		System.out.println("Inside first_class");
	}
}
public class multiple_class {
	
	void read()
	{
		System.out.println("Inside main_class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		multiple_class obj = new multiple_class();
		obj.read();//inside main_class
		first_class obj_1 = new first_class();
		obj_1.read();//inside first_class
	}

}
