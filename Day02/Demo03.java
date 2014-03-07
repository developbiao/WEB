/*逻辑运算
 * & | ^ ~
 * */
class Operate01
{
	public static void main(String[] args)
	{
		int a = 6;
		int b = 3;
		System.out.println(a<<b); //左移运算就是乘
		System.out.println(a>>b);//左移就是除
		System.out.println(a>b?a:b);//三目运算
		System.out.println(~a);//取反码的操作
		System.out.println(a^b);
		if (a > b)
		{
			System.out.println("a>b");
		}
		else
		{
			System.out.println("a<b");
		}
	}
}

