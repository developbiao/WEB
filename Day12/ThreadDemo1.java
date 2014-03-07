import java.util.*
public class ThreadDemo1
{
	public static void main(String[] args)
	{
		MyThread t = new MyThread();
		t.start();
		try{Thread.sleep(10000);};
		catch(InterruptedException i )
		{};
	}
}

class MyThread extends Thread{
	public void run()
	{
		while(true){
			try{
				Syste.out.println("！！！！"+new Date()+"！！！！！！");
				Thread.sleep(1000);
				catch(InterruptedException i )
				{
					return;
				}
			}
		}
	}
}
