package fassade;

import java.nio.charset.StandardCharsets;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Scanner;

import subsystem.*;

public class fassadesystem {
	String en_str = null;
	String de_str = null;
	String com_str = null;
	String decom_str = null;
	
	String path ="filename.txt";
	
	encodeDecode objen = new encodeDecode();
	compressDecompress objcom = new compressDecompress();
	writeFile objw = new writeFile();
	readFile objr = new readFile();
	encodeDecode objde = new encodeDecode();
	compressDecompress objdecom = new compressDecompress();
	 
	    public void encodecompresswrite(String path, String str1)
	    {
	    	en_str   = objen.encode(str1);
	    	comp_str = objcom.compress(en_str);
	    	objw.writef(path,comp_str);
	    }
	    
	    public void decodedecompressread(String str)
	    {
	    	decom_str = objr.read(str);
	    	de_str    = objde.decompress()
	    	
	    }
	    
	 public static void main(String[] args) {
		 String testStr = "baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_";
			
		 encodecompresswrite(path,testStr);
		 decodedecompressread(testStr);
	 }
}
