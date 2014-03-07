/**
 *  @Discribe:JDK1.5�Ժ�������� prame���Ա����
 *  @Date:2014-01-15
 *  @Author:GongBiao
 */

class PrameDemo_01{

	public static void main(String[] args){

		int[] arr = {11,77,88,33,24};
		int result = sum1(arr);

		//�ɱ䳤��
		int result2 = sum2(23,23,23,123,343,123,43);

		System.out.println(result);

		System.out.println(result2);

	
		System.out.println("is ok !");
	}

	//��ͳ�Ķ���������
	public static int sum1(int[] arr){
		int sum=0;
		for(int i=0; i<arr.length; i++){

			sum+=arr[i];
		
		}

		return sum;
	
	}

	//Prame 1.5 ���·���
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
 *  Prame 1.5JDK��������
 *  ���Ҫ���������������Ҷ���ͬһ���ͣ����Զ������������͵Ĳ���
 *  ���Ǵ���ʱ�����������������
 *  jdk1.5��Ϊ�˼���д�����������ԣ��ɱ����
 *  ͬ�»��Ǵ������飬���ǲ���Ҫ�ڴ�����������ˣ�ֱ�ӽ������е�Ԫ����Ϊ�������뼴��
 *  �����Զ�����Щ������װ��������
 *  �����ԣ��ɱ�������붨���ڲ����б�������
 * ------------------------------------------------------
 */

