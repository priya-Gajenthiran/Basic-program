import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int y = sc.nextInt();
        if(y%400==0){
            System.out.println("Leap Year");
        }
        else if(y%100!=0 && y%4==0){
            System.out.println("Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
