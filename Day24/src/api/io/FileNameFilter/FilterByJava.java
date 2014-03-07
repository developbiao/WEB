package api.io.FileNameFilter;

import java.io.File;
import java.io.FilenameFilter;

public class FilterByJava implements FilenameFilter {
	
	public boolean accept(File dir, String name){
		
		return name.endsWith(".java");  //end.With;
		
	}

}
