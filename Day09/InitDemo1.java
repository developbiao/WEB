/*
 * Practic:һ���������ڴ��еĳ�ʼ������
 * Author:Gongbiao
 * Date:2013-9-19
 */
class Fu
{
	Fu()
	{
		this.show();
	}	

	void show()
	{
		System.out.println("fu show runing");
	}
}

class Zi extends Fu
{
	int num = 8;
	{//��������
		System.out.println("cons function num = "+num);
	
	}

	Zi()
	{
		super();
		System.out.println("zi show num="+num);
	}

	void show()
	{
		System.out.println("zi show num="+num);
	}

}

class InintDeom1
{
	public static void main(String[] args)
	{
		new Zi();
		System.out.println("output!");
	}
}
