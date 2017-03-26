import java.io.*;
import java.util.*;

/**
 * The first line of the input consists of an integer . The next line contains  space-separated integers contained in the array.
 * Output Format. Print a single value equal to the sum of the elements in the array.
 * 
 * Constraints 
 * 1<=N<=100<=A[i]<= 10^10
 * 
 * Sample Input
 * 5
 * 1000000001 1000000002 1000000003 1000000004 1000000005
 * Output
 * 5000000015
 */
public class BigSum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        long sum = 0;
        for(int i=0; i<size; i++) {
            sum+=scan.nextInt();
        }
        System.out.println(sum);
    }
}