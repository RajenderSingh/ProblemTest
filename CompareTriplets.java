import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * The first line contains  space-separated integers, , , and , describing the respective values in triplet . 
 * The second line contains  space-separated integers, , , and , describing the respective values in triplet .
 * find their comparison points by comparing  with ,  with , and  with .
 * If ai > bi, then Alice is awarded  point. If ai < bi, then Bob is awarded  point. If ai=bi, then neither person receives a point.
 * Sample Input
 * 5 6 7
 * 3 6 10
 * Sample Output
 * 1 1 
 */
public class CompareTriplets {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        int res = 0;
        int alice = 0;
        int bob = 0;
        res = compare(a0, b0);
        if(res > 0) {
            alice++;
        } else if(res < 0) {
            bob++;
        }
        res = compare(a1, b1);
        if(res > 0) {
            alice++;
        } else if(res < 0) {
            bob++;
        }
        res = compare(a2, b2);
        if(res > 0) {
            alice++;
        } else if(res < 0) {
            bob++;
        }
        System.out.println(alice + " " + bob);
    }
    
    static int compare(int x, int y) {
        return (x - y);
    }
}
