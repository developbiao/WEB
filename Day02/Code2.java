/*编译器检查练习题*/
class Demo02
{
	public static void main(String[] args)
	{
		byte var1 = 4;
		byte var2 = 3;
	//	byte var1 = var1 + var2; //量变的不确定性，编译器会提示丢失精度
		
		System.out.println("var1="+var1+",var2="+var2);
		System.out.println("15"+5+6);//字符串在这里面的作用是链接
		System.out.println("15"+(7+7));
		System.out.println((char)('c'+3));
	}
}
