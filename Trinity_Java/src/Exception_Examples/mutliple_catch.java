package Exception_Examples;

public class mutliple_catch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int[] b = {1,2,3,4};
		try
		{
			//a = 10 / 0;
			for(int i=0; i<6;i++)
			{
				System.out.println(b[i]);
			}
		}
		catch(ArithmeticException ec)
		{
			System.out.println("Exception Found = "+ec);
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("Exception Found = "+ex);
		}
		
	}

}
