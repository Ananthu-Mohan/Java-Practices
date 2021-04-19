package Class_Examples;

import java.util.Scanner;

class circle
{
	void area(double r)
	{
		double a;
		a = 3.17*r*r;
		System.out.println("Area of circle = "+a);
	}
}
public class are_of_a_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		circle c = new circle();
		int g;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the radius of circle ");
		g = S.nextInt();
		c.area(g);
	}

}
