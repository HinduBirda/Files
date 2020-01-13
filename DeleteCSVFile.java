
		package Files;
		import java.io.File;

		public class DeleteCSVFile {

			    public static void main(String[] args)
			    {	
			    	try{
			    		
			    		File file = new File("c:\\logfile20100131.log");
			        	
			    		if(file.delete()){
			    			System.out.println(file.getName() + " is deleted!");
			    		}else{
			    			System.out.println("Delete operation is failed.");
			    		}
			    	   
			    	}catch(Exception e){
			    		
			    		e.printStackTrace();
			    		
			    	}
			    	
			    }
			}



	


