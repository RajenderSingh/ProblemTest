import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Rotate {

    public static void main(String[] args) {
    	
    	/*
    	 * 51 51 100
39356 87674 16667 54260 43958 70429 53682 6169 87496 66190 90286 4912 44792 65142 36183 43856 77633 38902 1407 88185 80399 72940 97555 23941 96271 49288 27021 32032 75662 69161 33581 15017 56835 66599 69277 17144 37027 39310 23312 24523 5499 13597 45786 66642 95090 98320 26849 72722 37221 28255 60906
    	 */
        Scanner in = new Scanner(System.in);
        int n = 51;//in.nextInt();
        int k = 51;//in.nextInt();
        int q = 100;//in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            System.out.print(a[a_i]);
        }
        System.out.println("");
        System.out.println("---------------------");
        for(int i = 0; i < k; i++){
            int rightmostnum = a[n-1];
            for(int j=n-2;j >=0; j--) {
                a[j+1] = a[j];
            }
            a[0] = rightmostnum;
            
        }
        for(int x=0; x < n; x++){
            System.out.println(a[x]);
        }
        
    }
}
