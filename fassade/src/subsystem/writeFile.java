package subsystem;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class writeFile {
		  public void write(String fpath, String sname){ 
			  
	    try {
	      FileWriter myWriter = new FileWriter(fpath);
	      myWriter.write(sname);
	      myWriter.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
}

