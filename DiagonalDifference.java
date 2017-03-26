import java.io.*;
import java.util.*;

/**
 * Sample Input
 * 3
 * 11 2 4
 * 4 5 6
 * 10 8 -12
 * Sample Output
 * 15
 * The primary diagonal is: 11      5         -12
 * Sum across the primary diagonal: 11 + 5 - 12 = 4
 * The secondary diagonal is:  4     5		10
 * Sum across the secondary diagonal: 4 + 5 + 10 = 19 
 * Difference: |4 - 19| = 15
 */
public class DiagonalDifference {

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
       int size = scan.nextInt();
       int primaryDiagonal = 0;
       int secondaryDiagonal = 0;
       for(int i=1; i<=size; i++) {
           for(int j=1; j<=size; j++) {
               int a = scan.nextInt();
               if(i==j) {
                   secondaryDiagonal+=a;                     
               }
               if((i+j)==(size+1)) {
                   primaryDiagonal+=a;
               }               
           }
       } 
       System.out.println(Math.abs(primaryDiagonal-secondaryDiagonal));
    }
}