package Java_Fundamentals;

public class prg6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i ;
		if(args.length == 0)
		{
			System.out.println("No values recieved");
		}
		else {
			for(i=0;i<=args.length;i++)
			{
				try {
					System.out.print(args[i]+",");
				}
				catch (Exception e)
				{
					//System.out.println(e);
				}
				
			}
		}
	}

}
