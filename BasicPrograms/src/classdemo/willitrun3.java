package classdemo;

public class willitrun3 {
	public static void m1(int i)
	{
		System.out.println("Inside Int");
	}
	public static void m1(Integer i1)
	{
		System.out.println("Inside Integer");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		willitrun3 w = new willitrun3();
		byte x = 10;
		w.m1(x);
		int k =5;
		Integer y = new Integer(10);
		//System.out.println("k == y "+k==y);
	}

}
