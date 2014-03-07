class StringTest_03{
	public static void main(String[] args){

		String str = "+dfsdfsdfafldkfsdfooioy";
		str = SortString(str);

		System.out.println(str);
		System.out.println("is ok ");
	}

	public static String SortString(String str){

		char[] chs = str.toCharArray();

		mySort(chs);

		return new String(chs);

	
	}

	public static void mySort(char[] chs){
	
		for(int i=0; i<chs.length-1; i++){
			for(int j=i+1; j<chs.length; j++){
				if(chs[i] > chs [j]){
					char temp = chs[i];
					chs[i] = chs[j];
					chs[j] = temp;
				}
			}
		}
	}
}


