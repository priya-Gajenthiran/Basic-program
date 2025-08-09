import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%7==0 || n%10==7){
            System.out.println("Buzz Number");
        }
        else{
            System.out.println("Not Buzz Number");
        }
    }
}
