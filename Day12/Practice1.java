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
		//Super();默认调用了父类中的空参数的构造函数
		System.out.println("C");
		i+=5;

	}

	public static void main(String[] args)
	{
		int i = 4;
		Super p = new Practice1("A");//多态，子类实例化
		System.out.println(p.i);
	}
}
