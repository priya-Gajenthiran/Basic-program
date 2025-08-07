import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int i1 = sc.nextInt();
        int q1 = sc.nextInt();
        int i2 = sc.nextInt();
        int q2 = sc.nextInt();
        int i3 = sc.nextInt();
        int q3 = sc.nextInt();
        int budget = sc.nextInt();
        double total = i1* q1 + i2*q2 + i3 *q3;
        double tax = total/100 *10;
        System.out.printf("Total (Before Tax): %.2f\n",total);
        double after = total + tax;
        System.out.printf("Total (After Tax): %.2f\n",after);
        
        if(after<= budget){
            System.out.println("Within Budget");
        }
        else{
            System.out.println("Over Budget");
        }
        
    }
}
