import java.io.*;
import java.util.*;

public class CuttingGrassExecuter {
	public static void main(String[] args) throws IOException {
        		int[] init;
		int[] grow;
		int H;
        		init = TCReader.readintArray();
		grow = TCReader.readintArray();
		H = TCReader.readint();
		System.out.println("==================================================");        
		System.out.println(new CuttingGrass().theMin(init, grow, H));
		System.out.println("==================================================");        
	}
}
