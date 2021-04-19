package Basic_Part1;
import java.util.*;
public class multiplication_table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int n;
		System.out.println("Enter the number ");
		n = S.nextInt();
		for(int i =1;i<=10;i++)
		{
			System.out.println(n+" x "+i+" = "+n*i);
		}
	}

}
