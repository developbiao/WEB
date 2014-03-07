package day16.practice;

public class StringDemo6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Byte.MAX_VALUE);
		int number1 = Integer.parseInt("23");
		//parsLong parseLong parseInterge parseBlooean
		System.out.println(number1);
		System.out.println(Integer.toBinaryString(-8));
		System.out.println(Integer.toString(6,3));
		
		Integer i = new Integer("77");
		int num = i.intValue();
		System.out.println(num-1);

	}

}
