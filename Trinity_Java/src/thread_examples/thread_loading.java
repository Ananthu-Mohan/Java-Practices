package thread_examples;

class threads extends Thread
{
	threads()
	{
		System.out.println("Loading....");
		Thread t = new Thread(this);
		t.start();
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				Thread.sleep(1000);
			}
			System.out.println("After Sleep");
		}
		catch(Exception ex)
		{
			
		}
	}
}
public class thread_loading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new threads();
	}

}
