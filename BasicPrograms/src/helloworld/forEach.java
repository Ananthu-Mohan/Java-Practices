package helloworld;

import java.util.ArrayList;

public class forEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		for(int i=0;i<10;i++)
		{
			list1.add(i);
		}
		list1.forEach(n->{System.out.print(n+" ");});
		System.out.println();
		list1.forEach(n->
		{
			if(n%2==0)
			{
				System.out.print(n+" ");
			}
		});
		System.out.println();
		list1.forEach(System.out::println);
	}

}
