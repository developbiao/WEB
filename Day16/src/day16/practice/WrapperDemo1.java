package day16.practice;

public class WrapperDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* �Զ�װ����ϰ */
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println(a == b);// false
		System.out.println(a.equals(b));
		System.out.println("----------------------");

		Integer m = 127;
		Integer n = 128;
		System.out.println(m == n);
		System.out.println(m.equals(n));

		// ����Ĵ���ֵ�Ѿ���ԭ���Ļ����������Ƕ���
		show(5);

	}

	public static void show(Object x) { // �Զ�װ��
		System.out.println("x---->>" + x);
	}

}
