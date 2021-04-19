package Abstraction_Exception;
import java.lang.*;
public class prg7 {

	public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
		// TODO Auto-generated method stub
		int num[] = new int[5];
		int sum = 0;
		double avg = 0.0;
		for(int i = 0;i<5;i++)
		{
			num[i] = Integer.parseInt(args[i]);
		}
		for (int i=0;i<num.length;i++)
		{
			System.out.print(num[i]+"\t");
			sum = sum + num[i];
		}
		avg = sum / 5;
		System.out.println();
		System.out.println("Sum = " +sum );
		System.out.println("Average = "+avg);
	}

}
