import java.io.*;
import java.util.*;

public class FortunateNumbersExecuter {
	public static void main(String[] args) throws IOException {
        		int[] a;
		int[] b;
		int[] c;
        		a = TCReader.readintArray();
		b = TCReader.readintArray();
		c = TCReader.readintArray();
		System.out.println("==================================================");        
		System.out.println(new FortunateNumbers().getFortunate(a, b, c));
		System.out.println("==================================================");        
	}
}
