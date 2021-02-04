package subsystem;
import java.util.Base64;  


public class encodeDecode {
	public String encode(String strg1) {  
	            // Getting encoder  
	            Base64.Encoder encoder = Base64.getEncoder();  
	            // Encoding string  
	            String str = encoder.encodeToString(strg1.getBytes());  
				System.out.println("Encoded string: "+str);  
				return str;
	           }  
	public String decode(String strg2) {
		 // Getting decoder  
        Base64.Decoder decoder = Base64.getDecoder();  
        // Decoding string  
        String dStr = new String(decoder.decode(strg2));  
		System.out.println("Decoded string: "+dStr);  
		return dStr;
	}
}  

