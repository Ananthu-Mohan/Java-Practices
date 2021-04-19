package classdemo;
import java.util.*;
public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner S = new Scanner(System.in);
		int limit;
		String input = new String();
		ArrayList <String> a1 = new ArrayList<String>();
		System.out.println("Enter the limit ");
		limit = S.nextInt();
		for(int i =1;i<=limit;i++)
		{
			System.out.println("Enter "+i+" String: ");
			input = S.next();
			a1.add(input);
		}
		a1.forEach(n->System.out.print(n+" "));
		String r1 =new String();
		System.out.println();
		System.out.println("Printing Each Word Reversed");
		
		a1.forEach(n->
		{
			StringBuffer reve = new StringBuffer(n);
			System.out.println(reve.reverse());
			
		});
		
	}

}
