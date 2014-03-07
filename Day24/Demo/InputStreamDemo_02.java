/**
 * @Discribe:键盘内容写到文件
 * @Author:GongBiao
 * @Date:2014/02/07
 */
import java.IO.*;

class InputStreamDemo_02{
	
	public static void main(String[] args){

		BufferedWriter bufw = new BufferedReaderWriter(new OutputStream(new FileOutputStream("TEMP\\data.txt")));
		
		InputStream is = System.in;
		String line = null;
		int ch = 0;

		StringBuilder sb = new StringBuilder();
		

		while((line = is.read()) != -1){

			if(ch == '\n')
				continue;
			if(ch == '\r'){
				String s = sb.toString();
			if("over".equals(s) || "OVER".equals(s))
				break;
			else{
				bufw.writer(line);
				sb.delete(0,sb.length());
			}
			}

			else
				sb.aapend((char) ch);

			
		}

		System.out.println("is ok !");
	}
}
