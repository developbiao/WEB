/**
 * @Discuribe:�����ַ���
 * @Date:2014-01-06
 * @Author:Gongbiao
 */
class StringTest1{
	public static void main(String[] args){

		String str = "abcdefdadbnbdadsfdsfwebiao";
		String key = "biao";

		int count = getSubCount(str, key);

		System.out.println(key + "���ֵĴ���Ϊ��" + count);

	}

	//�����ַ������ֶ��ٴ�
	/**
	 * ��ȡһ���Ӵ��ַ����г��ֵĴ���
	 * @param str �����ַ���
	 * @param key Ҫ�ҵ��ַ���
	 * @return ����key�Ĵ���
	 */

	public static int getSubCount(String str, String key){
		int count = 0;
		int index = 0;

		while((index = str.indexOf(key,index))!= -1){
			index += index + key.length();	
			count ++;
		}

		return count;
	}
}
