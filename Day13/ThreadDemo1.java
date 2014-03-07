/*
 * Practice:Thread ѧϰ1
 * Author:Gongbiao
 * Date:2013-10-5
 */

class MyThread extends Thread
{
	private int i = 0;
	public void run()
	{
		while (true)
		{
			System.out.println(++i);
			if (i > 100) break;
		}
	}
}

public class ThreadDemo1
{
	public static void main(String[] args)
	{
		new MyThread().start();
	}
}
