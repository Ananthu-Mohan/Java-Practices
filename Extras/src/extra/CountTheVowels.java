package extra;

public class CountTheVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input1 = "CauliFlower";
		char ch ='\0';
		char[] vowels = new char[] {'a','e','i','o','u'};
		int count = 0;
		input1 = input1.toLowerCase();
		//How many vowels in the given String
		
		for(int i=0;i<input1.length();i++)
		{
			ch = input1.charAt(i);
			for(int j=0;j<vowels.length;j++)
			{
				if(ch == vowels[j])
				{
					count++;
				}
			}
		}
		System.out.println("No:of Vowels in the given String = "+count);
		
		
		//Remove the vowels from the given String
		boolean flag = false;
		String out ="";
		for(int i=0;i<input1.length();i++)
		{
			ch = input1.charAt(i);
			for(int j =0;j<vowels.length;j++)
			{
				if(ch != vowels[j])
				{
					flag = true;
				}
				else
				{
					flag = false;
					break;
				}
			}
			if(flag == true)
			{
				out +=Character.toString(ch);
			}
		}
		System.out.println(out);
	}

}
