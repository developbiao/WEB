/**
 * @Discribe:基本数据类型的封装
 * @Date:2014-01-08
 * @Author:Gongbiao
 */

/*
 * byte Byte
 * short Short
 * int Interge
 * float Float
 * double Double
 * char Character
 * boolean Boolean
 *
 */

class WrapperDemo{

	public static void main(String[] args){
	
		int var = 33;
		System.out.println(Integer.parseInt("13")+var);
		//System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(".....>>");

		String str = Integer.toBinaryString(var);
		String str2 = Integer.toOctalString(var);

		System.out.println(str2);

		System.out.println(str);


		//进制的转换

		//其它进制转 ..>十进制

		
		System.out.println("-----------");

		String str3 = Integer.toString(1143,8);
		System.out.println(str3);



	}
}

