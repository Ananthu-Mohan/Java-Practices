package extra;

public class FundTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {1,2,3,-6};
		int temp = 0;
		int sum = input1[0];
		for(int i=1;i<input1.length;i++)
		{
			temp = i;
			if(sum==0)
			{
				break;
			}
			else
			{
				sum+=input1[i];
			}
		}
		if(sum==0)
		{
			temp--;
		}
		if(temp==0)
		{
			temp = -1;
		}
			System.out.println(temp);
	}

}
