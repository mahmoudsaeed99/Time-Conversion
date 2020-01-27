import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        char[] o=s.toCharArray();
        char ch1 = s.charAt(8);
         if(ch1=='P'){
            if(o[0]+o[1]==99){  
             o[0]='0';
             o[1]='0';
            }
            else if(o[0]+o[1]<=103){
                o[0]=(char)(o[0]+1);
                o[1]=(char)(o[1]+2);
            }
            else{
                o[0]='2';
                o[1]=(char)(o[1]-8);
                
            }
            
         }
        o[9]=0;
        o[8]=0;
        String ou = new String(o);   
        return ou;         
}
 

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] time = sc.nextLine().split(":");
        
        String hours = time[0];
        String minutes = time[1];
        String seconds = time[2].substring(0,2);
        String dayEve = time[2].substring(2,4);
        if(dayEve.equals("AM")){
            System.out.println((hours.equals("12")?"00":hours) +":"+minutes+":"+seconds);
        }else{
            System.out.println((hours.equals("12")?hours:(Integer.parseInt(hours)+12))            +":"+minutes+":"+seconds);
        }
    }
}
