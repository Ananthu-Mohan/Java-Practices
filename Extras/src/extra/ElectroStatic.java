package extra;

public class ElectroStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input1 = {3,2};
		String input2 = "PN";
		int input3 = 3;
		char ch ='\0';
		int sum_p = 0,sum_n = 0,sum=0;
		for(int i=0;i<input1.length;i++)
		{
			ch = input2.charAt(i);
			if(ch == 'P')
			{
				sum_p +=input1[i];
			}
			if(ch == 'N')
			{
				sum_n +=input1[i];
			}
		}
		sum = (sum_p-sum_n)*100;
		System.out.println("Electrostatic force = "+sum);
	}

}
