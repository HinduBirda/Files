package Collections;

	import java.io.FileWriter;

	public class AppendToCSVExample
	{
	   public static void main(String[] args) throws Exception
	   {
		   String csvFilename = "D:\\student1.csv";
	        try {

	            FileWriter csvwriter = new FileWriter(csvFilename);
	            csvwriter.append("name");
	            csvwriter.append(",");
	            csvwriter.append("rollno");
	            csvwriter.append(",");
	            csvwriter.append("department");
	            csvwriter.append(",");
	            csvwriter.append("\n");

	            csvwriter.append("hindu");
	            csvwriter.append(",");
	            csvwriter.append("71");
	            csvwriter.append(",");
	            csvwriter.append("cse");
	            csvwriter.append(",");
	            csvwriter.append("\n");
	            csvwriter.close();
	            System.out.println("CSV file created succesfully.");
	        } catch (Exception e) {
	            System.out.println("exception :" + e.getMessage());
	        }

	   }
	}


