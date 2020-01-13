package Files;
import java.io.*; 
import java.util.*; 
import com.opencsv.CSVWriter; 
  
public class CSVExample2 { 
    private static final String CSV_FILE_PATH 
        = "./student1.csv";
	private static Scanner sc; 
    public static void main(String[] args) 
    { 
        addDataToCSV(CSV_FILE_PATH); 
    } 
    public static void addDataToCSV(String output) 
    { 
        File file = new File(output); 
        sc = new Scanner(System.in); 
        try { 
            FileWriter outputfile = new FileWriter(file); 
  
            CSVWriter writer = new CSVWriter(outputfile); 
  
            List<String[]> data = new ArrayList<String[]>(); 
  
            System.out.println("Enter no of rows"); 
            int noOfRow = Integer.parseInt(sc.nextLine()); 
            System.out.println("Enter Data"); 
            for (int i = 0; i < noOfRow; i++) { 
                String row = sc.nextLine(); 
                String[] rowdata = row.split(" "); 
                data.add(rowdata); 
            } 
  
            writer.writeAll(data); 
  
            writer.close(); 
        } 
        catch (IOException e) { 
            e.printStackTrace(); 
        } 
    } 
} 