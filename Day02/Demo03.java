/*�߼�����
 * & | ^ ~
 * */
class Operate01
{
	public static void main(String[] args)
	{
		int a = 6;
		int b = 3;
		System.out.println(a<<b); //����������ǳ�
		System.out.println(a>>b);//���ƾ��ǳ�
		System.out.println(a>b?a:b);//��Ŀ����
		System.out.println(~a);//ȡ����Ĳ���
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

