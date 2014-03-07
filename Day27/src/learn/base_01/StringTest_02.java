/**
 * @Date:2014/03/07
 * @Discribe:String的基本操作Test2
 * @Author:GongBiao
 * 
 */
package learn.base_01;

public class StringTest_02 {
	
	public static void main(String[] args){
		
		int lCount = 0;
		int uCount = 0;
		int oCount = 0;
		
		String str = "sfsdlfksdlfjewlfsjfls";
		String sL = "abcdefghijklmnoqrstuvwxyz";
		String sU= "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		for (int i=0; i < str.length(); i++){
			char c = str.charAt(i);
			if (sL.indexOf(c) != -1){
				lCount ++;
			}else if(sU.indexOf(c) != -1){
				uCount ++;
			}else {
				oCount ++;
			}
		}
		
		System.out.println(lCount);
		System.out.println(uCount);
		System.out.println(oCount);
		
		System.out.println("is ok !");
	}

}
