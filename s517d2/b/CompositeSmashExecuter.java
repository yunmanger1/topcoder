import java.io.*;
import java.util.*;

public class CompositeSmashExecuter {
	public static void main(String[] args) throws IOException {
        		int N;
		int target;
        		N = TCReader.readint();
		target = TCReader.readint();
		System.out.println("==================================================");        
		System.out.println(new CompositeSmash().thePossible(N, target));
		System.out.println("==================================================");        
	}
}
