/*
 * Practice: 线程这间在通信
 */

class Resource
{
	String name;
	String sex;

}

class Input implements Runnable
{
	Resource r = new Resource();
	Input(Resource r)
	{
		this.r = r;
	}


	public void run()
	{
		synchronized(r)
		{
		int x  = 0;
		while(true)
		{
			if(x==0)
			{
				r.name = "小明";
				r.sex = "男生";
			}

			else
			{
				r.name = "小丽丽";
				r.sex = "女生";
			}
			x=(x+1)%2;

		}
		}
		
	}


}

class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r = r;
		
	}

	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				System.out.println(r.name+"......."+r.sex);
			}
		}
		
	}

}

class ResourceDemo
{
	public static void main(String[] args)
	{
		//创建资源

		Resource r = new Resource();

		//创建任务
		
		Input in = new Input(r);
		Output out = new Output(r);

		//创建线程
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		//开户线程

		t1.start();
		t2.start();
		
	}
}
