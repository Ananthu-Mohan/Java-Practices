package extra;
import java.util.*;

public class reducedArrCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int input2;
		System.out.println("Enter the limit");
		input2 = S.nextInt();
		int[]arr = new int[input2];
		int sum = 0,rem =0,total=0;
		System.out.println("Enter the array elements ");
		for(int i=0;i<input2;i++)
		{
			arr[i] = S.nextInt();
		}
		if(input2%2==0)
		{
			for(int i=0;i<input2;i++)
			{
				if(i%2==0)
				{
					arr[i]=0;
				}
			}
			for(int i=0;i<input2;i++)
			{
				sum +=arr[i];
			}
		}
		else
		{
			for(int i=0;i<input2;i++)
			{
				if(i%2!=0)
				{
					arr[i]=1;
				}
			}
			for(int i=0;i<input2;i++)
			{
				sum +=arr[i];
			}
		}
//		System.out.println(sum);
		if(sum>9)
		{
			while(sum!=0)
			{
				rem = sum%10;
				total +=rem;
				sum /=10;
			}
		}
		else {
			System.out.println(sum);
		}
		System.out.println("Total = "+total);
	}

}
