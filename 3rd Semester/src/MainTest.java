class MyRunnable implements Runnable{
	public void run()
	{
	try {
		for(int i=0;i<=10;i++)
		{
			System.out.println("Thread "+i+" is running");
			Thread.sleep(1000);
			}
		}
	catch(InterruptedException e){
		System.out.println("Thread was interrupted");
	}
		
	}
}

public class MainTest {
	public static void main(String[] args)
	{
		Thread mythread = new Thread(new MyRunnable());
		mythread.start();
	}

}
