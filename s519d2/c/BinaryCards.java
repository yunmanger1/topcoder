import java.io.*;
import java.util.*;
import java.math.*;

public class BinaryCards {
	public long largestNumber(long A, long B) {
		long result = Math.max(A,B);
		int p = (int)(Math.log(B)/Math.log(2));
		if (A < Math.pow(2,p)){
			result = Math.max((long)Math.pow(2,p+1)-1,result);
		}else{
			long x = (long)Math.pow(2,p);
			if (x != 0){
				result = Math.max(result, x + largestNumber(A % x, B % x));
			} 
		}
		return result;
	}
}
