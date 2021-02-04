package test2;
import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

import test2.subsystems.*;

public class main {


public static void main(String[] args) throws IOException {
	String testStr = "baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_";
	
	//create file
	try {
	      File myObj = new File("filename.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File created: " + myObj.getName());
	      } else {
	        System.out.println("File already exists.");
	      }
	    } catch (IOException e) {
	      System.out.println("An error occurred.");
	      e.printStackTrace();
	    }
    
	//write file
	 
		// encode_display
		 Base64.Encoder encoder = Base64.getEncoder();  
		 String str = encoder.encodeToString(testStr.getBytes());  
		 System.out.println("Encoded string: "+str);   
		
		//string compress and display
			//System.out.println("compress");
			        byte[] input = str.getBytes();
			        byte[] op = compressDecompress.compress(input);
			        System.out.println("original data length " + input.length + ",  compressed data length " + op.length);
			        System.out.println("compressed data:"+new String(op, StandardCharsets.UTF_8));
			      
			        
			        try {
			            FileWriter myWriter = new FileWriter("filename.txt");
			            String s = new String(op, StandardCharsets.UTF_8);
			            myWriter.write(s);
			            myWriter.close();
			            System.out.println("Successfully wrote to the file.");
			          } catch (IOException e) {
			            System.out.println("An error occurred.");
			            e.printStackTrace();
			          }
			         System.out.println("encoded_compressed_written");
	
 	 
	 
	 //read file
			         try {
			    	      File myObj = new File("filename.txt");
			    	      Scanner myReader = new Scanner(myObj);
			    	      while (myReader.hasNextLine()) {
			    	        String data = myReader.nextLine();
			    	        System.out.println("data in file:");
			    	        System.out.println(data);
			    	      }
			    	      myReader.close();
			    	    } catch (FileNotFoundException e) {
			    	      System.out.println("An error occurred.");
			    	      e.printStackTrace();
			    	    }
			         //string decompress and display
		    //       System.out.println("de-compress");
			            
			         byte[] org = compressDecompress.decompress(op);
		   	        System.out.println(org.length);
		   	        System.out.println(new String(org, StandardCharsets.UTF_8));
		  

		   	     //decode_ display
		   	     Base64.Decoder decoder = Base64.getDecoder();  
		   	     String dStr = new String(decoder.decode(str));  
		   	     System.out.println("Decoded string: "+dStr);  
		   	     System.out.println("decompress_decode_read.");
     
	 
	
	//
	
   
	 
	}
	
}


