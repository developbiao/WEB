/*
 * Practice:ObjectDemo2
 * Author:Gongbiao
 * Date:2013-9-27
 */

class Demo1
{
	
	
	/* 重写了toString方法*/
//	public String toString()  
//	{
//		return "Demo1::name";
//	}
}

class Demo2
{

}

class ObjectDemo2
{
	public static void main(String[] args)
	{
		Demo1 d1 = new Demo1();
		Demo1 d2 = new Demo1();
		Class c1 = d1.getClass();
		Class c2 = d2.getClass();
		
		System.out.println(d1.getClass().getName()+"#"+Integer.toHexString(d1.hashCode()));
		System.out.println(d1.hashCode());
		System.out.println(c1.getName());
		System.out.println(c1==c2);
		System.out.println(d1);	
		System.out.println(d1.toString());
	}
}
