/*
 * Practice: �߳������ͨ��
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
				r.name = "С��";
				r.sex = "����";
			}

			else
			{
				r.name = "С����";
				r.sex = "Ů��";
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
		//������Դ

		Resource r = new Resource();

		//��������
		
		Input in = new Input(r);
		Output out = new Output(r);

		//�����߳�
		Thread t1 = new Thread(in);
		Thread t2 = new Thread(out);

		//�����߳�

		t1.start();
		t2.start();
		
	}
}
