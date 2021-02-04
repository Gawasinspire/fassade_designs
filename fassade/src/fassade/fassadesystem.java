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
	private static String en_str = null;
	private static String de_str = null;
	private static byte[] com_str;
	private static String decom_str = null;
	private static String path = "filename.txt";
	private static byte[] restr;

	private static encodeDecode endeobj = new encodeDecode();
	private static writeFile wrobj = new writeFile();

	public static void encodecompresswrite(String path, String str1) throws IOException {
		en_str = endeobj.encode(str1);
		com_str = compressDecompress.compress(en_str);
		wrobj.writer(path, com_str);
	}

	public static void decodedecompressread(String path) throws IOException {
		restr = readFile.reader(path);
		decom_str = compressDecompress.decompress(restr);
		de_str = endeobj.decode(decom_str);
	}

	/*
	 * public void encodecompresswrite(String path, String str1) { en_str =
	 * objen.encode(str1); comp_str = objcom.compress(en_str);
	 * objw.writef(path,comp_str); }
	 * 
	 * public void decodedecompressread(String str) { decom_str = objr.read(str);
	 * de_str = objde.decompress();
	 * 
	 * }
	 */

	public static void main(String[] args) throws IOException {
		String testStr = "baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_baba_";

		encodecompresswrite(path, testStr);
		decodedecompressread(path);
	 }
}
