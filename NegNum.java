import java.io.*;
import java.util.*;

public class NegNum {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        double positveNumCount = 0;
        double negativeNumCount = 0;
        double zeroNumCount = 0;
        for(int i=0; i<size; i++) {
            double num = scan.nextDouble();
            if(num > 0) {
                positveNumCount++;
            } else if(num < 0) {
                negativeNumCount++;
            } else {
                zeroNumCount++;
            }
        }
        System.out.println((positveNumCount/size));
        System.out.println((negativeNumCount/size));
        System.out.println((zeroNumCount/size));
    }
    
}