/*
 * Practice:�ڲ��ඨ���ھֲ�λ���ϣ�Ϊʲô���ܷ��ʾֲ���������
 */
class Outer{
	private Object obj;
	public void show()
	{
		int x = 3;

		class Inner
		{
			//������Objecto��׽��toString ����
			public String toString()
			{
				return "Inner :";
			}
			
		}

		Inner in = new Inner();
		System.out.println(in.toString());
		obj = in; //��new Inner()����ĵ�ַ��ֵ����������obj.

	}

	public void function()
	{
		System.out.println("obj:"+obj.toString());
	}
}

class InnerDemo1
{
	public static void main(String[] args)
	{
		Outer out = new Outer();
		out.show();	
		out.function();
		
	}
}
