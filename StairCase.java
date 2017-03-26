import java.io.*;
import java.util.*;

public class StairCase {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        String space = " ";
        String hash = "#";
 
        for(int i=1; i<=size; i++) {
        	for(int sp=1; sp<=size-i; sp++) {
        		System.out.print(space);
        	}
        	for(int hs=1; hs<=i; hs++) {
        		System.out.print(hash);
        	}
        	 	
            System.out.println();
        }
                
    }
    
}