package Java_Fundamentals;

public class prg34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[3][3];
		int x =0;
		for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
				arr[i][j] = Integer.parseInt(args[x++]);
			}
        }
		int max = 0;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {
				max = arr[i][j] > max ? arr[i][j] : max;  //conditional code
			}
		}
		System.out.println("The biggest number is " + max);
	}
}
