package extra;

public class GenerateLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 9987;
		int max = 0,max2=0;
		
		int temp = input1,rem = 0;
		String demo = Integer.toString(temp);
		StringBuffer sbuff = new StringBuffer(demo);
		while(temp!=0)
		{
			rem = temp%10;
			if(rem>max)
			{
				max = rem;
			}
			temp /=10;
		}
		String maximum = Integer.toString(max);
		int index = sbuff.indexOf(maximum);
		sbuff = sbuff.deleteCharAt(index);
		temp = Integer.parseInt(sbuff.toString());
		while(temp!=0)
		{
			rem = temp%10;
			if(rem>max2)
			{
				max2 = rem;
			}
			temp /=10;
		}
		
		StringBuffer sout = new StringBuffer();
		sout = sout.append(max+""+max2);
		int output = Integer.parseInt(sout.toString());
		System.out.print(output);
		
	}

}
