/*
 *Practice:Java�������ݽ���ֻ����������
 *
 * */
class Swapnum
{
	public static void main(String[] args)
	{
		int a = 3;
		int b = 6;
		a ^= b;
		b ^= a;
		a ^= b;

		System.out.println("a="+a);
		System.out.println("b="+b);
	}

}
