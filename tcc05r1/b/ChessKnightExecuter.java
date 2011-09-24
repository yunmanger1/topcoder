import java.io.*;
import java.util.*;

public class ChessKnightExecuter {
	public static void main(String[] args) throws IOException {
        		int x;
		int y;
		int n;
        		x = TCReader.readint();
		y = TCReader.readint();
		n = TCReader.readint();
		System.out.println("==================================================");        
		System.out.println(new ChessKnight().probability(x, y, n));
		System.out.println("==================================================");        
	}
}
