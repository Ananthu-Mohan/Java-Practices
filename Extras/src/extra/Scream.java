package extra;

public class Scream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {20,2,9,19};
		//b,b+a,b+2a,b+3a...
		//d,d+c,d+2c,d+3c..
		
		boolean flag = true;
		
		int a = input1[0];
		int b = input1[1];
		int c = input1[2];
		int d = input1[3];
		
		int[] sum_jack = new int[50];
		int[] sum_jill = new int[50];
		int sum = 0;
		
		int i = 0;
		for(i=0;i<50;i++)
		{
			sum_jack[i]= b+(i*a);
			//System.out.print(sum_jack[i]+"\t");
		}
		System.out.println();
		for(i=0;i<50;i++)
		{
			sum_jill[i]= d+(i*c);
			//System.out.print(sum_jill[i]+"\t");
		}
		outer:
		for(i=0;i<50;i++)
		{
			for(int j=0;j<50;j++)
			{
				if(sum_jill[j]==sum_jack[i])
				{
					sum = sum_jill[j];
					System.out.println(sum);
					break outer;
				}
			}
		}
		
	}

}
