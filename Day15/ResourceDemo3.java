class Resource
{
	private String name;
	private String sex;
	private boolean flag = false;

	public synchronized void set(String name, String sex)
	{
		if(flag)
			try{this.wait();}catch(InterruptedException e){}
		this.name = name;
		this.sex = sex;
		flag = true;
		this.notify();
	}

	public synchronized void out()
	{
		if(!flag)
			try{this.wait();}catch(InterruptedException e){}
		System.out.println(name+"...."+"...."+sex);
		flag = false;
		notify();
	}
}

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
			if(x==0)
			{
				r.set("mike","nan");
			}
			else
			{
				r.set("ÀöÀö","ÃÀÅ®");
			}
			x = (x+1)%2;

		}
	}
}

//Êä³ö

class Output implements Runnable{
	Resource r;
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

class ResourceDemo3
{
	public static void main(String[] args)
	{
		Resource r = new Resource();

		Input in = new Input(r);
		Output out = new Output(r);

		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		t1.start();
		t2.start();

		
	}
}
