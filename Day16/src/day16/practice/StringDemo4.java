package day16.practice;


public class StringDemo4 {
	public static void main(String[] args){
		String text = "cdebafgflp";
		
		text = sortString(text);
		
		System.out.println("sort..."+text);
		
	}
	/**
	 *   �ֵ�����
	 * @param str
	 * @return
	 */
	public static String sortString(String str){
		//1�����ַ���ת���ַ�����
		char [] chs = str.toCharArray();
		
		//2������������
		mysort(chs);
		
		return String.copyValueOf(chs);
	}
	private static void mysort(char[] chs) {
		// TODO Auto-generated method stub
		
		for (int x=0; x<chs.length-1; x++){
			
			for(int y=x+1; y<chs.length; y++){
	
				if(chs[x] > chs[y]){
					swap(chs, x, y);
				}
					
				
			}
		}
	}
	private static void swap(char[] chs, int x, int y) {
		//��������
		
		char temp = chs[x];
		chs[x] = chs[y];
		chs[y] = temp;
		
	}

}
