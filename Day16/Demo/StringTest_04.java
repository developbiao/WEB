/**
 * @Discribe:��ȡ�ַ���������Ӵ�
 * @Date:2014-01-07
 * @Author:Gongbiao
 */

class StringTest_04{
	public static void main(String[] args){

		String str1 = "abcdefadfsdfiu8k";
		String str2 = "abc";

		String maxsub = getMaxSubString(str1,str2);
		System.out.println(maxsub);

		
		System.out.println("is ok !");
	}


	/**
	 * ��ȡ�����ַ����������ͬ���Ӵ�
	 * @param s1
	 * @param s2
	 * @return 
	 */

	public static String getMaxSubString(String s1, String s2){
	
		String max,min;
		max = s1.length() > s2.length()?s1:s2;

		min = max.equals(s1)?s2:s1;

		for(int x=0; x<min.length(); x++){

			for(int y=0,z=min.length()-x; z!=min.length()+1; y++, z++){
				//��ȡs2�Ӵ�

				String temp = min.substring(y,z);

				if(max.contains(temp)){
					return temp;
				}
			
			}
		
		}

		return null;
	}
}
