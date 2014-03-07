package day16.practice;

public class WrapperDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 自动装箱练习 */
		Integer a = new Integer(127);
		Integer b = new Integer(127);
		System.out.println(a == b);// false
		System.out.println(a.equals(b));
		System.out.println("----------------------");

		Integer m = 127;
		Integer n = 128;
		System.out.println(m == n);
		System.out.println(m.equals(n));

		// 这里的传的值已经不原来的基本类型了是对象
		show(5);

	}

	public static void show(Object x) { // 自动装箱
		System.out.println("x---->>" + x);
	}

}
