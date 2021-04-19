package Core_java;

class add
{
	int a = 10;
	int b = 20;
	int c ;
	void sum()
	{
		c = a+b;
		System.out.println(c);
	}
}

public class sample extends add{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		add s = new add();
		s.sum();

	}

}
