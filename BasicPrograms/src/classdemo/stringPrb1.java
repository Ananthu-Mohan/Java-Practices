package classdemo;

public class stringPrb1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Cider";
		String str1 = "Cried";
		
		str = str.toLowerCase();
		str1 = str1.toLowerCase();
		
		int len1 = str.length();
		int len2 = str1.length();
		boolean flag = true;
		
		if(len1 == len2)
		{
			for(int i=0;i<len1;i++)
			{
				for(int j=0;j<len2;j++)
				{
					if(str.charAt(i) == str1.charAt(j))
					{
						flag = true;
						break;
					}
					else
					{
						flag = false;
					}
				}
				if(flag == false)
				{
					break;
				}
			}
			if(flag == true)
			{
				System.out.println("Anagram");
			}
			else
			{
				System.out.println("Not an Anagram");
			}
		}
		else
		{
			System.out.println("Not an Anagram");
		}

	}

}
