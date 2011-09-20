import java.io.*;
import java.util.*;

public class BinaryCardsExecuter {
	public static void main(String[] args) throws IOException {
        		long A;
		long B;
        		A = TCReader.readlong();
		B = TCReader.readlong();
        
		System.out.println(new BinaryCards().largestNumber(A, B));
	}
}
