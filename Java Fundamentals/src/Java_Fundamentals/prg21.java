package Java_Fundamentals;

public class prg21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] num = {0,1,2,3,4,5};
		int sum =0;
		int avg;
		for (int i=0;i<num.length;i++)
		{
			sum = sum + num[i];
		}
		avg = sum/num.length;
		System.out.println("Sum = "+sum+"\t"+"Avg = "+avg);
	}

}
