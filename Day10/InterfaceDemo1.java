/*
 * Pracetice:Interface
 * Author:Gongibao
 * Date:2013-9-25
 */
abstract class AbsDeom
{
	abstract void show();
	abstract void method();
}

interface Inter  // ����һ���ӿ�
{
	public static final int num = 3;
	public abstract void show();

}

//����һ���ӿڵ�����Ըýӿ��еķ������и���

class InterImple implements Inter
{
	public void show()
	{
		System.out.println("show1");
	}

	public void method()
	{
		System.out.println("method");
	}
}




class InterfaceDemo1 //���������
{
	public static void main(String[] args)
	{
		InterImple p = new InterImple();
		p.show();		
		p.method();
	}
}
