package classdemo;

public class count_charcters {
	static int MAX_CHARS =256;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Ananthu";
		str = str.toLowerCase();
		int[]count = new int[MAX_CHARS];
		char ch ='\0';
		int key = 0;
		for(int i=0;i<str.length();i++)
		{
			ch = str.charAt(i);
			key = (int)ch;
			count[key]++;
		}
		for(int i=0;i<count.length;i++)
		{
			if(count[i]==0)
			{
				continue;
			}
			else
			{
				System.out.print(count[i]+"\t");
			}
		}

	}

}
