import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println(a+" is greater");
        }
        else if(a<b){
            System.out.println(b+" is greater");
        }
        else{
            System.out.println("Both are equal");
        }
    }
}
