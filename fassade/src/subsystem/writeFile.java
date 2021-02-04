package subsystem;

import java.io.FileOutputStream;
import java.io.IOException; // Import the IOException class to handle errors
import java.io.OutputStream;

public class writeFile {
		  public void writer(String fpath, byte[] sname){ 
			  
	    try {
		   OutputStream  ostrm = new FileOutputStream(fpath);
	      ostrm.write(sname);
	      ostrm.close();
	      System.out.println("Successfully wrote to the file.");
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
	  }
}

