package subsystem;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class readFile {
  private static byte[] compressedstring;

  public static byte[] reader(String filename) {
    /*try {
      File myObj = new File(filename);
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
        System.out.println(data);
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }*/
    try {
      compressedstring = Files.readAllBytes(Paths.get(filename));
      System.out.println(compressedstring);
    }
    catch(Exception e){
      System.out.println("Error occured");
      e.printStackTrace();
    }
    return compressedstring;
  }
}
