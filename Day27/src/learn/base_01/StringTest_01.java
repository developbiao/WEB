/**
 * @Date:2014/03/07
 * @Discribe:写一程序输出大写、小写、非大小写的字符串的个数
 * @Author:GongBiao
 */
package learn.base_01;

import java.util.regex.Pattern;

public class StringTest_01 {
	
	public static void main(String[] args){
		
		String str = "abdfsfldskfsdlfsdfsSDFSDFSDAFSDGFWdf65sdDFSDF56655SDF65ffew54s5fewdsfwe2";
		int iCount = 0;
		int uCount = 0;
		int nCount = 0;
		int oCount = 0;
		for (int i=0; i< str.length(); i++){
			char ch = str.charAt(i);
			String s =String.valueOf(ch);
		//	Character c = str.charAt(i);

			if (ch >= 'a' && ch <= 'z'){
				iCount ++;
			}
			else if (ch >= 'A' && ch <= 'Z'){
				uCount ++;
			}
			else if (isNumeric(str)){
				nCount ++;
			}
			else{
				oCount ++;
			}
		}
		
		System.out.println("小写的个数为: " + iCount );
		System.out.println("大写的个数为:" + uCount);
		System.out.println("数字个数为:" + nCount);
		System.out.println("其它的个数为:" + oCount);
		
		System.out.println("is ok ");
	}

	private static boolean isNumeric(String str) {
		// TODO Auto-generated method stub
		Pattern pattern = Pattern.compile("[0-9]*");
		return pattern.matcher(str).matches();
	}

}
