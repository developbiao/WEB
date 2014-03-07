/**
 * @Discribe£ºGenericDemo_01 ·ºÐÍ
 * @Date :2014-01-11
 * @Author:GongBiao
 */

class GenericDemo_01{
	public static void main(String[] args){

		Demo<String> d1 = new Demo<String>();
		d1.show("abc");
		//d1.show(new Integer(18));
		d1.Myprintf(13);
		
	
		System.out.println("is ok !");
	}
}

class Demo<E>{

	public void show(E e){
		System.out.println("shwo:" + e.toString());
	
	}

	public <P> void Myprintf(P p){
	
		System.out.println("printf: " + p);
	}

}


