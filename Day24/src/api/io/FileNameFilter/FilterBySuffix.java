package api.io.FileNameFilter;

import java.io.File;
import java.io.FilenameFilter;

public class FilterBySuffix implements FilenameFilter {
	
	private String suffix; 
	
	public FilterBySuffix(String suffix){
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		
		return name.endsWith(suffix);  //文件的结尾
	}
	
	

}
