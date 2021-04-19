package polymorphism;

class method1
{
	void show()
	{
		System.out.println("Insisde Method1(Parent Class)");
	}
}
class method2 extends method1
{
	void show()
	{
		System.out.println("Insisde Method2(Child Class)");
		//super.show(); super keyword helps us to acess the parent calss member variables and member functions
	}
}
public class runtime_polymorphims_method_overriding {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		method2 m = new method2();
		m.show();
		
	}

}
