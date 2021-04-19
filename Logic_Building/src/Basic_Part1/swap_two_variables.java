package Basic_Part1;
import java.util.*;
public class swap_two_variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a , b,temp;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the first number ");
		a =S.nextInt();
		System.out.println("Enter the second number ");
		b =S.nextInt();
		System.out.println(" Before a ="+a);
		System.out.println(" Before b ="+b);
		temp = a;
		a = b;
		b = temp;
		System.out.println(" After a ="+a);
		System.out.println(" After b ="+b);
	}

}
