/**
 * @Discribe:  数学类的方法
 * @Date:2014/01/20
 * @Author:GongBiao
 */

class MathDemo_01{

	public static void main(String[] args){
	
		//Math方法是静态的
		double d1 = Math.ceil(12.33); //Math.ceil往最大的取
		double d2 = Math.floor(12.34);//Math.floor往最小的取
		double d3 = Math.round(12.549);    //四舍五入
		double d4 = Math.pow(2,8);   //次方


		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		System.out.println(d4);


		System.out.println("is ok !");
	}
}
