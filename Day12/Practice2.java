/*
 * Practice:Interface 7
 * info://�������;������������,Ҫ���������ڲ���
 */

interface Inter
{
	void show(int a , int b);
	void func();

}

class Practice2
{
	public static void main(String[] args)
	{
		//���д���
		Inter in = new Inter()
		{
			public void show(int a , int b)
			{
				System.out.println(a+b);	
			}
		
			public void func()
			{}
		};

		in.show(4,5);
		in.func();
	}
}
