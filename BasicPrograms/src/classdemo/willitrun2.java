package classdemo;

public class willitrun2 {
	public static void m1(Double d)
	{
		System.out.println("Inside Double");
	}
	public static void m1(Long i1)
	{
		System.out.println("Inside Long");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		willitrun2 w = new willitrun2();
		int x = 0;
		w.m1(x);
		long l1 = 10;
		w.m1(l1);
	}

}
