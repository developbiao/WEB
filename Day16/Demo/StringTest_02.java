/**
 * @discribe:  对一个字符串进行了字典顺序的排序生成一个有序的字符串
 * @Date:2014-01-07
 * @Author:Gongbiao
 */
class StringTest_02{
	public static void main(String[] args){

		String s3 = "ade2ba-9+1fq";
		
		s3 = sortString(s3);

		System.out.println(s3);
		
		System.out.println("is ok !");
	}

	public static String sortString(String str){
		//1、将字符串转成字符数组

		char[] chs = str.toCharArray();

		//2、对数组进行排序
		
		mySort(chs);

		return new String(chs);
	}

	private static void mySort(char[] chs){
		for(int x=0; x<chs.length-1; x++){
			for(int y=x+1; y<chs.length; y++){
				if(chs[x] > chs[y]){
					swap(chs,x,y);
				}

			}
		}
	}

	private static void swap(char[] chs, int x, int y){
		char temp = chs[x];
		chs[x] = chs[y];
		chs[y] = temp;
	}
}




