package extra;

public class CoolDrink {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 5;
		int[] input2 = new int[]{3,10,8,6,11};
		int input3 = 4;
		int[] input4 = new int[]{1,10,3,11};
		
		
		int[] output = new int[input3];
		int count = 0;
		
		for(int i=0;i<input4.length;i++)
		{
			for(int j=0;j<input2.length;j++)
			{
				if(input2[j]<=input4[i])
				{
					count++;
				}
				output[i] = count;
			}
			count = 0;
		}
		for(int i=0;i<output.length;i++)
		{
			System.out.print(output[i]+" ");
		}
		
	}

}
