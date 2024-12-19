class MyThread extends Thread{
	public void run()
	{
	try {
		for(int i=0;i<5;i++)
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

public class MainThread {
	public static void main(String[] args)
	{
		MyThread mythread = new MyThread();
		mythread.start();
	}

}
