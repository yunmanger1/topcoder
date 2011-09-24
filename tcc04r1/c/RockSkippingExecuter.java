import java.io.*;
import java.util.*;

public class RockSkippingExecuter {
	public static void main(String[] args) throws IOException {
        		String pads;
		int maxDist;
        		pads = TCReader.readString();
		maxDist = TCReader.readint();
		System.out.println("==================================================");        
		System.out.println(new RockSkipping().probability(pads, maxDist));
		System.out.println("==================================================");        
	}
}
