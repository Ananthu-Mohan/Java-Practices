package extra;

public class RSF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input1 = 69287;
		
		int result = input1;
		
		while(result>99)
		{
			result = RFS(result);
		}
		System.out.println(result);
		
	}
	public static int RFS(int number)
	{
		
		String str = Integer.toString(number);
		int len = str.length();
		int diff = 0;
		String ans ="";
		for(int i=0;i<len-1;i++)
		{
			diff = Math.abs((int)str.charAt(i) - (int)str.charAt(i+1));
			ans +=diff;
		}
		int rtn = Integer.parseInt(ans);
		return rtn;
	}
	
	
}
