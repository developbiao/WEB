/*
 * Practice:���캯������ϰ2
 * Author:Gongbiao
 * Date:2013-9-19
 */

class Fu extends Object
{
	int num;
/*
	Fu()
	{
		System.out.println("Fu running!");	
	}
	*/
	Fu(int x)
	{
		System.out.println("Fu runing="+x);	
	}
}

class Zi extends Fu
{
	
	Zi()
	{
		super(13); //�ֶ�ָ�����������
		
		System.out.println("zi num"+num);
	}	
	Zi(int x)
	{
		//super();
		this();  //�����Լ��Ĺ��캯��

		System.out.println("zi run"+x);
	}

}

class ExtendsDemo3
{
	public static void main(String[] args)
	{
		new Zi(32);	
	}
}
