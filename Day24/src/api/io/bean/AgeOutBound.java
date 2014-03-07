/**
 * @Discribe:自定义异常
 * @Author:GongBiao
 * @Date:2014/02/06
 */
package api.io.bean;

public class AgeOutBound extends Exception {
	
	public AgeOutBound(){
		System.out.println("Sorry,age out of bound!");
	}
}
