package subsystem;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class compressDecompress 
{
	public static byte[] compress(String text) throws IOException {
		ByteArrayOutputStream obj = new ByteArrayOutputStream();
        GZIPOutputStream gzip = new GZIPOutputStream(obj);
        gzip.write(text.getBytes("UTF-8"));
        gzip.close();
        return obj.toByteArray();
	}

	public static String decompress(byte[] compressedTxt) throws IOException {
		GZIPInputStream gis = new GZIPInputStream(new ByteArrayInputStream(compressedTxt));
		BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "UTF-8"));
		String outStr = "";
        String line;
        while ((line=bf.readLine())!=null) {
          outStr += line;
        }
        return outStr;
	}
}