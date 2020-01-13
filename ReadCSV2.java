package Files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV2 {
	private static BufferedReader br;

	public static void main(String[] args)   
	{  
	String line = "";  
	String splitBy = ",";  
	try   
	{  
	br = new BufferedReader(new FileReader("D:\\student1.csv"));  
	while ((line = br.readLine()) != null)
	{  
	String[] student1 = line.split(splitBy);
	System.out.println("student1 [ name=" + student1[0]+"]");
	}  
	}   
	catch (IOException e)   
	{  
	e.printStackTrace();  
	}  
	}  

}
