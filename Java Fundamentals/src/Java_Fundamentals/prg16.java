package Java_Fundamentals;

public class prg16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
	       int num=0;
	       System.out.println("The Prime numbers between 10 and 99 are:");
	       for (i=10;i<100;i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=1; num--)
		       {
	                if(i%num==0)
		            {
	 		            counter = counter + 1;
		            }
		        }
		        if (counter==2)
		        {
		            System.out.print(i+"\t");
		        }	
	        }	
	}

}
