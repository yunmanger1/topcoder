import java.io.*;
import java.util.*;

public class NetworkXOneTimePadExecuter {
	public static void main(String[] args) throws IOException {
        		String[] plaintexts;
		String[] ciphertexts;
        		plaintexts = TCReader.readStringArray();
		ciphertexts = TCReader.readStringArray();
		System.out.println("==================================================");        
		System.out.println(new NetworkXOneTimePad().crack(plaintexts, ciphertexts));
		System.out.println("==================================================");        
	}
}
