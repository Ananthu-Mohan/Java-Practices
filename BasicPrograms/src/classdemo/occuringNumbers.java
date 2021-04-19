package classdemo;
import java.util.*;

public class occuringNumbers {
	public static int getOddOccurence(int []arr,int arr_size)
	{
		int number = 0;
		int c ;
		for(int i = 0;i<arr_size;i++)
		{
			c = 0;
			for(int j =i+1 ;j<arr_size;j++)
			{
				if(arr[i]==arr[j])
				{
					c++;
				}
			}
			if(c%2!=0)
			{
				number = arr[i];
			}
		}
		return number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner S = new Scanner(System.in);
		System.out.println("Enter the array limit");
		int arr_size = S.nextInt();
		int[]arr = new int[arr_size];
		System.out.println("Enter the array values ");
		for(int i=0;i<arr_size;i++)
		{
			arr[i] = S.nextInt();
		}
		
		int number = getOddOccurence(arr,arr_size);
		System.out.println("Odd number occurance =  "+number);
	}

}
