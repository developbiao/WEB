/**
 * ��ֹ�̵߳ĵ��ͷ���
 */

public class TestThreadCiycle implements Runnable
{
	Sting name;
	boolean live = true;

	public TestThreadCiycle(String name)
	{
		super();
		this.name = name;
	}

	@Override
	public void run()
	{
		int i = 0;
		while(live)
		{
			System.out.println(name+(i++));
		}
	}

	public void terminate()
	{
		live = false;
	}

	public static void main(String[] args)
	{
		TestThreadCiyle ttc = new TestThreadCiyle("�߳�A:");
		Thread t1 = new Thread(ttc);  //����״̬
		t1.start();  //����״̬

		for (int i = 0; i< 1000; i++)
		{
			System.out.println(i);
		}
		ttc.terminate();
		System.out.println("tcc stop!");
	}
	
}
