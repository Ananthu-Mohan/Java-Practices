package thread_examples;

class Thread_Demo extends Thread
{
	public void run()
	{
		System.out.println("Running");
	}
	Thread_Demo()
	{
		System.out.println("Main Program");
	}
}
public class by_extending_thread_class {
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Thread_Demo t = new Thread_Demo();
		Thread t1 = new Thread(t);
		t1.start();
	}

}
