package Files;
	import java.io.*;  
	import java.util.Scanner;  
	public class ReadCSV 
	{  
	public static void main(String[] args) throws Exception  
	{  
	Scanner sc = new Scanner(new File("D:\\student1.csv"));  
	sc.useDelimiter(",");    
	while (sc.hasNext())  
	{  
	System.out.print(sc.next());  
	}   
	sc.close();  
	}  
	}  


