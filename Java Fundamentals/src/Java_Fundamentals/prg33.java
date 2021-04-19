package Java_Fundamentals;

import java.util.Scanner;

public class prg33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a=args.length;
		    int i;
		    int arr[][] = new int[4][4];
		    if(a==4)  
		    {
		        int k=0;
		        for(i=0;i<2;i++)
		        {
		            for(int j=0;j<2;j++)
		            {        
		                arr[i][j]=Integer.parseInt(args[k]);
		                k++;
		            }
		        
		        }
		        System.out.println("The array is:");
		        for(i=0;i<2;i++)
		        {
		            for(int j=0;j<2;j++)
		            {
		                System.out.print(arr[i][j]+" ");
		            }
		            System.out.println();
		        }
		        System.out.println("The reverse of array is:");
		        for(i=1;i>=0;i--)
		        {
		            for(int j=1;j>=0;j--)
		            {
		                System.out.print(arr[i][j]+" ");
		            }
		            System.out.println(); 
		        }

		    }
	}

}
