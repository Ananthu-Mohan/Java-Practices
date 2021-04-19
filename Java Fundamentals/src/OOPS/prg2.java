package OOPS;

class Calculator
{
	static int p1;
	static double p2;
	
	static int powInt(int num1, int num2)
	{
		p1 = (int) Math.pow(num1, num2);
		return p1;
	}
	static double powDouble(double num1, int num2)
	{
		p2 = (double)Math.pow(num1, num2);
		return p2;
	}
}
public class prg2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c = new Calculator();
		int pow1;
		double pow2;
		pow1 = c.powInt(20, 2);
		pow2 = c.powDouble(20, 3);
		System.out.println("Power 1 = "+pow1);
		System.out.println("Power 2 = "+pow2);

	}

}

