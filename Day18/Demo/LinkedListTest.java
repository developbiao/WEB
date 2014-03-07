/**
 * @Discribe:用LinkedList模拟队列和堆栈
 * @Date:2014-01-09
 * @Author:GongBiao
 */

class LinkedListTest{

	public static void main(String[] args){

		MyQueue myq  = new MyQueue();
		myq.myAdd("abc1");
		myq.myAdd("abc2");
		myq.myAdd("abc3");
		myq.myAdd("abc4");
		myq.myAdd("abc5");

		while(!myq.isNull()){
		
			System.out.println(myq.myGet());
		}

	
		System.out.println("is ok !");
	}
}

