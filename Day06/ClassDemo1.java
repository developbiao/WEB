/*
 * Practice:ClassDemo1
 * Author:Gongbiao-�������ϰ
 * Date:2013-9-3
 */

class ClassDemo1
{
	int x = 3; //��Ա����
	public static void main(String[] args)
	{
		ClassDemo1 d = new ClassDemo1();
		d.x = 5;
		show(d);
		System.out.println("x="+d.x);
		
	}

	public static void show(ClassDemo1 d)
	{
		d.x = 4;
	}
}
