package test2.subsystems;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class testCompress {


	public static void main(String[] args) throws IOException {
		

        String testStr = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
        byte[] input = testStr.getBytes();
        byte[] op = compressDecompress.compress(input);
        System.out.println("original data length " + input.length + ",  compressed data length " + op.length);
        byte[] org = compressDecompress.decompress(op);
        System.out.println(org.length);
        System.out.println(new String(org, StandardCharsets.UTF_8));
    }

}


