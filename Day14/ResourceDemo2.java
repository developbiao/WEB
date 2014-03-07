//资源

class Resource
{
	String name;
	String sex;
	boolean flag = false;
}

//输入

class Input implements Runnable
{
	Resource r;
	
	Input(Resource r)
	{
		this.r = r;
	}

	public void run()
	{
		int x = 0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException e){}
				if(x==0)
				{
					r.name = "丽丽";
					r.sex = "女女女";
				}

				else
				{
					r.name = "小强";
					r.sex = "男";
				}
				r.flag = true;
				r.notify();
			}

			x= (x+1)%2;
		}
	}
}


//输出

class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r  = r;	
	}

	public void run()
	{
		while(true)
		{
		
			synchronized(r)
			{
				if(!r.flag)
				{
					try{r.wait();}catch(InterruptedException e){}
				}

				System.out.println(r.name+"........"+r.sex);
				r.flag = false;
				r.notify();
			}
		}
	}
}

//主函数的入口 

class ResourceDemo2
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

		//开启线程
		
		t1.start();
		t2.start();
	}
}
