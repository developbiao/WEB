/**
 * @Discribe:自动装箱拆箱练习题03
 * @Date:2014-01-09
 * @Author:Gongbiao
 */

//自动装箱 Integer.valeOf();
//自动拆箱 Intvalue();
class WrapperDemo_03{

	public static void main(String[] args){

		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println(a==b);
		System.out.println(a.equals(b));

		Integer x = Integer.valueOf(127);
		Integer y = 127;

		System.out.println(x==y);
		System.out.println(x.equals(y));
	
		System.out.println("is ok !");
	}
}
