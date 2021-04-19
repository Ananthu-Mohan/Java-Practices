package Basic_Part1;
import java.util.*;
public class countDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] c = new int[] {0,0,0,0,0,0,0,0,0,0};
		int rem = 0;
		int number;
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the Number");
		number = S.nextInt();
		while(number!=0)
		{
			rem = number % 10;
			c[rem]++;
			number = number/10;
		}
		for(int i =0;i<c.length;i++)
		{
			if(c[i]!=0)
			{
				System.out.println(i+" = "+c[i]);
			}
		}
	}

}
