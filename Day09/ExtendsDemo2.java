/*
 * Practices:��ļ̳�super
 * Author:Gongbiao
 * Date:2013-9-19
 */
class ExtendsDemo2
{
	public static void main(String[] args)
	{
		Zi z = new Zi();
		z.Function();
		
	}
}

class Fu
{
	//����Ĺ��캯���ĳ�ʼ��
	Fu()
	{
		System.out.println("�������....");	
	}	
}

class Zi extends Fu
{
	//����Ĺ��캯����Ĭ�϶���һ����ʽ�����super();
	 void Function()
	 {
		 System.out.println("Function is runing!");

	 }	
}


/*
 * ����������������������������������������������������
 * ����: ����Ĺ��캯�����ȿ��Ը�����Ķ����ʼ����Ҳ���Ը���������ʼ��
 * ����������������������������������������������������
