/*
 * Pracitce:�̳е�ѧϰ��ϰ1
 * Author:Gongbiao
 * Date 2013-9-19
 */
class ExtendsDemo1
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.show();
		System.out.println("z="+z);
	
	}
}

class Fu
{
	void show()
	{
		System.out.println("Fu run!");
	}
}

class Zi extends Fu
{
	void show()
	{
		System.out.println("this"+this);
	}
}
