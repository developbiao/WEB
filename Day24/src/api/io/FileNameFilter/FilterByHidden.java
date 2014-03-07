package api.io.FileNameFilter;

import java.io.File;
import java.io.FileFilter;


public class FilterByHidden implements FileFilter {
	
	@Override
	public boolean accept(File pathname){
		return pathname.isHidden();  //ÅÐ¶ÏÊÇ²»ÊÇÒþ²Ø
	}

}
