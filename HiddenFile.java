package Files;
import java.io.File;

public class HiddenFile {

	public static void main(String[] args) {
		
		        String strFilePath = "D://student1.csv";
		        File file = new File(strFilePath);
		        boolean isHidden = file.isHidden();
		        
		        System.out.println("Is file hidden? " + isHidden);
		 
		    }
		 
		

	}


