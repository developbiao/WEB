/*
 * Pracitc:���̵߳�ѧϰ�����
 */

class Demo extends Thread
{
	private String name;
	Demo(String name)
	{
		//super(name);
		this.name = name;
	}

	public void run()
	{
		for (int i=0; i<10; i++)
		{
			//for (int y=-9999999; y<9999999; y++){};
			System.out.println(name+"....="+i+".....name="+Thread.currentThread().getName());
		}
	}
}

class ThreadDemo4
{
	public static void main(String[] args)
	{
		Demo d1 = new Demo("С��");
		Demo d2 = new Demo("С��");

		d1.start();
		d2.start();

		for (int i=0; i<10; i++)

		System.out.println("Output is ok!");
	
	}
}
