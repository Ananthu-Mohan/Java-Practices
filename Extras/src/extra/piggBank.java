package extra;
import java.util.*;
public class piggBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int days;
		System.out.println("Enter the no:of days ");
		days = S.nextInt();
		int inital_savings;
		System.out.println("Enter the Initial Savings ");
		inital_savings = S.nextInt();

		int input2 =inital_savings;
		
		int[]odd =new int[days+1];
		int[]even = new int[days+1];
		
		int sum_odd = 0,sum_even=0;
		int sum = 0;
		for(int i=1;i<=days;i=i+2)
		{
			odd[i] = input2;
			input2 = input2*2;
		}
		for(int i=1;i<=days;i=i+2)
		{
			sum_odd+=odd[i];
		}
		input2 = inital_savings;
		int j=1;
		for(int i=2;i<=days;i=i+2)
		{
			//even[i] = input2;
			sum +=odd[j];
			j = j+2;
			input2 = sum/2;
			even[i] = input2;
		}
		for(int i=2;i<=days;i=i+2)
		{
			sum_even +=even[i];
		}
		System.out.println(sum_odd+":"+sum_even);
	}

}
