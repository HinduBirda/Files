package Files;
	import java.io.File;
	import java.io.IOException;
	 
	public class ReadOnly
	{
	 
	    public static void main(String[] args) throws IOException
	    {	
	    	File myfile = new File("D://student1.csv");
	    	boolean flag = myfile.setReadOnly();	
	    	if (flag==true)
	    	{
	    	   System.out.println("File successfully converted to Read only mode!!");
	    	}
	    	else
	    	{
	    	   System.out.println("Unsuccessful Operation!!");
	    	}
	    }
	}


