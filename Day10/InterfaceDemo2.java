class A
{
	public void show()
	{
		System.out.println("show A");
	}
}

interface B
{
	public void show();
}

interface C
{
	public void show();
}

interface D extends B,C
{
	public void show();
		

}

class F implements D
{
	public void show()
	{
		System.out.println("OK implements!");
	}
}

interface Inter1
{
	public void Justit();
	public void Speak();

}

class Imple2 implements Inter1
{
	public void Justit()
	{
		System.out.println("JUSTDO!");
	}

	//����ȫ������
	public void Speak()
	{
		System.out.println("˵�õ��Ҹ��أ�");
	}

	
}

class InterfaceDemo2
{
	public static void main(String[] args)
	{
		F f = new F();
		f.show();

		Imple2 p = new Imple2();
		p.Justit();
	}
}
