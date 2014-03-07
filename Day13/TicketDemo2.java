/*
 *  将售票的例子改写成runnable接口的方式
 *  创建线程方式二:
 *  1、定义一个类实现Runnable接口
 *  2、覆盖Runnable接口中的run方法中
 *  3、创建该接口的子类对象
 *  4、通过学习Thread进行线程的创建，并将Runnable接口的子类对象作为Thread类的构造函数的实进行传递.
 */

class Ticket implements Runnable
{
	private int num = 100;

	public void run()
	{
		while(true)
		{
			if(num > 0)
			{
				System.out.println(Thread.currentThread().getName()+"----"+num--);
			}
			else
			break;
		}
	}
}

class TicketDemo2
{
	public static void main(String[] args)
	{
		Ticket t = new Ticket();

		//创建线程对象

		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);

			t1.start();
			t2.start();
			t3.start();


	}
}
