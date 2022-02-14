package virtualKey;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;

public class Directory {

	    public static final String pathName = "C:\\Users\\kashy\\Desktop\\AddedFiles/";
	    private ArrayList<File> files = new ArrayList<>();
	    Path path = FileSystems.getDefault().getPath(pathName).toAbsolutePath();
	    File Dfiles = path.toFile();

	    public String getPathName() {
	        return pathName;
	    }
	    public ArrayList<File> ListFiles() { //sort files
	        File[] directoryFiles = Dfiles.listFiles();
	        files.clear();
	        for(File directoryFile : directoryFiles) {
	            if(directoryFile.isFile()) {
	                files.add(directoryFile);
	            }
	        }
	        Collections.sort(files);
	        return files;
	    }
	    public ArrayList<File> getFiles() {
	        ListFiles();
	        if (files.isEmpty()){
	            System.out.println("No files exist");}
	        else {
	            System.out.println("Existing files: ");
	            for (File file : ListFiles()) {
	                System.out.println(file.getName());
	            }
	        }
	            return files;
	        }



	}