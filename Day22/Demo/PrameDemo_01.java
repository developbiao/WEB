/**
 *  @Discribe:JDK1.5以后的新特性 prame可以变参数
 *  @Date:2014-01-15
 *  @Author:GongBiao
 */

class PrameDemo_01{

	public static void main(String[] args){

		int[] arr = {11,77,88,33,24};
		int result = sum1(arr);

		//可变长度
		int result2 = sum2(23,23,23,123,343,123,43);

		System.out.println(result);

		System.out.println(result2);

	
		System.out.println("is ok !");
	}

	//传统的多个数组参数
	public static int sum1(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){

			sum+=arr[i];
		
		}

		return sum;
	
	}

	//Prame 1.5 的新方法
	public static int sum2(int num,int... arr){
	
		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			sum += arr[i];
		}

		return sum + num;
	}

	//Prame 1.5 method 3
	
	public static int sum3(int... arr){
	
		int sum = 0;
		for(int i=0; i<arr.length; i++){
		
			sum += arr[i];
		}

		return sum;
	}
}

/**
 * -------------------------------------------------
 *  Prame 1.5JDK的新特性
 *  如果要传入多个参数，而且都是同一类型，可以定义数组类类型的参数
 *  但是传递时，必须先有数组对象。
 *  jdk1.5后为了简化书写，出现了特性，可变参数
 *  同新还是代表数组，但是不需要在创建数组对象了，直接将数组中的元素作为参数传入即可
 *  它会自动将这些参数封装到数组中
 *  局限性，可变参数必须定义在参数列表的最后面
 * ------------------------------------------------------
 */

