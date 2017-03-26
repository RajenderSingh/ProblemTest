import java.io.*;
import java.util.*;

public class Clock24 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String inputTime = scan.nextLine();
        String[] timeArray = inputTime.split(":");
        String amPM = timeArray[2].substring(2,4);
        String hr = "";
        if(amPM.equalsIgnoreCase("AM") && timeArray[0].equalsIgnoreCase("12")) {
            hr = "00:";
        } else if(amPM.equalsIgnoreCase("PM")) {
        	if(timeArray[0].equalsIgnoreCase("12")) {        		
                hr= "12:";
        	}else {
        		int tmp = Integer.parseInt(timeArray[0]);
                hr = String.valueOf(12 + tmp);
                hr+= ":";
        	}
        	
        } else {
            hr = timeArray[0]+ ":";
        }      
        System.out.print(hr + timeArray[1]+ ":" + timeArray[2].substring(0,2));
    }
}//12:45:54PM  12:45:54