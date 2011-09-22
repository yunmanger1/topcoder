import java.io.*;
import java.util.*;

public class MonochromaticBoardExecuter {
	public static void main(String[] args) throws IOException {
        		String[] board;
        		board = TCReader.readStringArray();
		System.out.println("==================================================");        
		System.out.println(new MonochromaticBoard().theMin(board));
		System.out.println("==================================================");        
	}
}
