import java.io.*;
import java.util.*;

public class NewItemShopTwoExecuter {
	public static void main(String[] args) throws IOException {
        		String[] customers;
        		customers = TCReader.readStringArray();
		System.out.println("==================================================");        
		System.out.println(new NewItemShopTwo().getMaximum(customers));
		System.out.println("==================================================");        
	}
}
