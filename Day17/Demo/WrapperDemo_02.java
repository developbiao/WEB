/**
 * @Discribe:基本类型转对象练习
 * @Date:2014-01-08
 * @Author:Gongbiao
 */
class WrapperDemo_02{

	public static void main(String[] args){
	
		Integer x = new Integer(17);
		Integer y = new Integer("17");

		int var = Integer.valueOf(y);

		System.out.println("var is :" + var);

		System.out.println(x==y);
		System.out.println(x.equals(y));

		System.out.println("————————");	

		//compareTo比较对象的大小compareTo
		//对象的比较需要实现 compareble接口
		Integer a = new Integer(11);
		Integer b = new Integer(9);

		System.out.println(a.compareTo(b));
	}
}
