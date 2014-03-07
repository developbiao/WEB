class Resource
{
	private String name;
	private String sex;
	private boolean flag;

	public synchronized void set(String name, String sex)
	{
		if(flag)
		{
			try{this.wait();}catch(InterruptedException e){}
			this.name = name;
			this.sex = sex;
			flag = true;
			this.notify();
		}
	}

	public synchronized void out()
	{
		if(!flag)
		{
			try{this.wait();}catch(InterruptedException e){}
			System.out.println(name+"......+......"+sex);
			flag = false;
			notify();
		}
	
	}
}

//输入

class Input implements Runnable
{
	Resource r ;

	Input(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		int x = 0;
		while(true)
		{
			if(x==0)
			{
				r.set("mike","nan");
			}
			else
			{
				r.set("丽丽","girl");
			}
			
			x = (x+1)%2;
		}
		
	}

}


//输出

class Output implements Runnable
{
	Resource r ;
	Output(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		while(true)
		{
			r.out();
		}
	}
}


//主函数入口

class ResourceDemo3
{
	public static void main(String args[])
	{
		//创建资源
		Resource r = new Resource();

		//创建任务

		Input in =  new Input(r);
		Output out = new Output(r);

		//创建线程
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		//开启线程
		t1.start();
		t2.start();

	}
}
