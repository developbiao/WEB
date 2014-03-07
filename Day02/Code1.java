/*编程首先要的是思路
 * 思想浅析了写步骤
 * 用代码来实现功能
 */

class Demo
{
	/**
	 * @ author:GongBiao
	 * @ version:1.0
	 */
	public static void main(String[] args)
	{
		byte b = 3;
		int var = 4;
		b = (byte)(b + var); //强制类型转换丢失精确，byte类型占1个字节
		System.out.println(b);
		System.out.println("sum printf out");
	}
}


