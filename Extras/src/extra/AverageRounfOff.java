package extra;

public class AverageRounfOff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] input1 = {6,9,12,23,34};
		int input2 = 5;
		int sum =0;
		float avg = 0;
		double diff = 0;
		int Flooring = 0,ceiling = 0;
		for(int i=0;i<input2;i++)
		{
			sum +=input1[i];
		}
		avg = (float)sum/input2;
		System.out.println("Average in float = "+avg);
		//System.out.println("Average in Integer = "+(int)avg);
		diff = (double)(avg-(int)avg);
		
		if(diff<0.5)
		{
			Flooring =(int)Math.floor(avg);
			System.out.println("Flooring  = "+Flooring);
		}
		else
		{
			ceiling = (int)Math.ceil(avg);
			System.out.println("Ceiling = "+ceiling);
		}
		

	}

}
