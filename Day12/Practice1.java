/*
 * Pracitc6
 */
class Super
{
	int i =0;
	public Super(String a )
	{
		System.out.println("A");
		i = 1;
	}

	public Super()
	{
		System.out.println("B");
	}
}

class Practice1 extends Super
{
	public Practice1(String a)
	{
		//Super();Ĭ�ϵ����˸����еĿղ����Ĺ��캯��
		System.out.println("C");
		i+=5;

	}

	public static void main(String[] args)
	{
		int i = 4;
		Super p = new Practice1("A");//��̬������ʵ����
		System.out.println(p.i);
	}
}
