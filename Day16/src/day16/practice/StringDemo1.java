package day16.practice;

public class StringDemo1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "this is my book ,my name is gongbiao"
					+ "I love you linux becacue this is my love";
		String str1 = "like";
		
		String names = "zhangshan ,wanger, sjun";   //名字的分割
		String namec[] = names.split(",");
		for (int i=0; i<namec.length; i++){
				System.out.println(namec[i]);
			
		}
		
		
		text = "     abc   ";   //只去除字符串两端的空格
		
		String str3 = text.trim();
		System.out.println(str3);
	
		
		
		
		
		
		
	}

}
