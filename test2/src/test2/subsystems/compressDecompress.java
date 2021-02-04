package test2.subsystems;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterOutputStream;


public class compressDecompress {
    public static byte[] compress(String text) throws IOException {
        return compress(text.getBytes());
    }

    public static byte[] compress(byte[] bArray) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try (DeflaterOutputStream dos = new DeflaterOutputStream(os)) {
            dos.write(bArray);
        }
        return os.toByteArray();
    }

    public static byte[] decompress(byte[] compressedTxt) throws IOException {
        ByteArrayOutputStream os = new ByteArrayOutputStream();
        try (OutputStream ios = new InflaterOutputStream(os)) {
            ios.write(compressedTxt);
        }
        return os.toByteArray();
    }

public static void main(String[] args) throws IOException {
		
		System.out.println("baba..");
		 String testStr = "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA";
	        byte[] input = testStr.getBytes();
	        byte[] op = compressDecompress.compress(input);
	        System.out.println("original data length " + input.length + ",  compressed data length " + op.length);
	        byte[] org = compressDecompress.decompress(op);
	        System.out.println(org.length);
	        System.out.println(new String(org, StandardCharsets.UTF_8));
	}

}
