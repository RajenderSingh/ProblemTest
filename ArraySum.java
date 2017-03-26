import java.io.*;
import java.util.*;

/**
 * Input Format
 * The first line contains an integer, , denoting the size of the array. 
 * The second line contains  space-separated integers representing the array's elements.
 * Output Format
 * Print the sum of the array's elements as a single integer.
 * Sample Input
 * 6
 * 1 2 3 4 10 11
 * Sample Output
 * 31
 * 
 */
public class ArraySum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        
        int i = 0;
        int sum = 0;
        while(size >0) {
            i = scan.nextInt();
           
            sum+=i;
            size--;
        }
        System.out.println(sum);
    }
}