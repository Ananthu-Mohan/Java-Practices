package extra;

public class Unique_array {
	static int MAX_CHARS = 256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char [] input1 = {'G','Q','R'};
		char [] input2 = {'R','T','U'};
		int output=0,sum=0;
		int key ;
		char [] count = new char[MAX_CHARS];
		
		for(int i=0;i<input1.length;i++)
		{
			key = (int)input1[i];
			count[key]++;
		}
		for(int i=0;i<input2.length;i++)
		{
			key = (int)input2[i];
			count[key]++;
		}
		
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
			{
				continue;
			}
			if(count[i]==1)
			{
				sum += i;
			}
		}
		int temp = sum;
		int total = 0,rem = 0;
		while(sum>9)
		{
			while(temp!=0)
			{
				rem = temp%10;
				total +=rem;
				temp /= 10;
			}
			sum = total;
			total = 0;
			temp = sum;
		}
		System.out.println(sum);
		

	}

}
