/*If Demo �жϼ���*/
class IfDemo
{
	public static void main(String[] args)
	{
		int month = 12;
		if (month>12 || month<1)
			System.out.println(month+"�·ݲ����ڼ���");
		else if (month>=3 && month<=5)
			System.out.println(month+"�����Ǵ���");
		else if(month>=6 && month<=8)
			System.out.println(month+"�������ļ�");
		else if (month>=9 && month<=11)
			System.out.println("�������＾");
		else
			System.out.println(month+"�����Ƕ���");
	}
}
