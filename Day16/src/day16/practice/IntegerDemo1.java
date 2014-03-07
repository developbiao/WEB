package day16.practice;

public class IntegerDemo1 {
	public static void main(String[] args){
		
		Integer t1 = new Integer(8);
		Integer t2 = new Integer("7");
		Integer t3 = new Integer("3");
		System.out.println(t1.compareTo(t2));
		System.out.println();
		/*×Ô¶¯×°Ïä*/
		
		Integer x1 = 3;
		x1 = x1.intValue()+5;
		System.out.println("x1-----"+x1);
	}

}
