/**
 * @Discribe:��������ת������ϰ
 * @Date:2014-01-08
 * @Author:Gongbiao
 */
class WrapperDemo_02{

	public static void main(String[] args){
	
		Integer x = new Integer(17);
		Integer y = new Integer("17");

		int var = Integer.valueOf(y);

		System.out.println("var is :" + var);

		System.out.println(x==y);
		System.out.println(x.equals(y));

		System.out.println("����������������");	

		//compareTo�Ƚ϶���Ĵ�СcompareTo
		//����ıȽ���Ҫʵ�� compareble�ӿ�
		Integer a = new Integer(11);
		Integer b = new Integer(9);

		System.out.println(a.compareTo(b));
	}
}
