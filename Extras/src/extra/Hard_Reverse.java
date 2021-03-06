package extra;

public class Hard_Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int case_option = 1;
		String input = "I Am alWays 24#7 Busy.";
		System.out.println(input);
		String output ="";
		if(case_option ==0)
		{
			output = Zero(input);
		}
		else
		{
			output = One(input);
		}
		System.out.println(output);
	}
	public static String Zero(String str)
	{
		String[] words = str.split(" ");
		String reverse ="";
		for(String s:words)  //taking each word n reversing it and adding it to the reverse string
		{
			StringBuffer sbuff = new StringBuffer(s);
			sbuff = sbuff.reverse();
			reverse +=sbuff.toString()+" ";
		}
		return reverse;
	}
	public static String One(String str)
	{
		String[] words = str.split(" "); //spliting according to the spaces
		String reverse ="";
		char ch ='\0';
		char extract ='\0';
		for(String s:words)
		{
			
			int[] index_capital = new int[s.length()];
			if(s.length()==1)  //if the word contains only one letter
			{
				reverse += s+" ";
			}
			else
			{
				for(int i=0;i<s.length();i++)
				{
					ch = s.charAt(i); //taking each character from the word
					if(Character.isUpperCase(ch)) //checking if it is upper or not
					{
						int key = s.indexOf(ch); // if it upper then find its index
						index_capital[key]++; // then an arry to keep track of the Capitliazed letters based on its indices
					}
				}
				
				
				StringBuffer sbuff = new StringBuffer(s.toLowerCase());//again adding the string to the buffer but in lower case
				sbuff = sbuff.reverse(); //reversing it
				
				
				if((Character.isLetter(sbuff.charAt(0))==false)) //if the reversed string's first charcter is not a letter then do the follwoing
				{
					extract = Character.toUpperCase(sbuff.charAt(sbuff.length()-1));// extract the last character from the reversed string nd convert it to UpperCase
					sbuff = sbuff.deleteCharAt(sbuff.length()-1); //delete the character at last
					sbuff = sbuff.insert(sbuff.length(), extract);//insert the Uppercased ccharacter at the last
				}
				
				
				for(int i=0;i<index_capital.length;i++)
				{
					if(index_capital[i]==0) // checking if the array contains zero if it contains zero then skip the iteration
					{
						continue;
					}
					else //if it contains 1 then do the following
					{
						extract = Character.toUpperCase(sbuff.charAt(i)); // extract the character from the reveresed string at that index and convert that charcter to Uppercaase
						sbuff = sbuff.deleteCharAt(i); //delete chracter at that index from the reversed string
						sbuff = sbuff.insert(i, extract);//insert the uppercased character to that index 
					}
				}//do this for the remaining upper case letters too
				reverse +=sbuff.toString()+" "; //convert the final output back to string and return it
			}	
		}
		return reverse;
	}

}
