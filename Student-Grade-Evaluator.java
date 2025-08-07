import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        if(n>=90 && n<=100){
            System.out.println("Grade A");
        }
        else if(n<=89 && n>=80){
            System.out.println("Grade B");
        }
        else if(n<=79 && n>=70){
            System.out.println("Grade C");
        }
        else if(n<=69 && n>=60){
            System.out.println("Grade D");
        }
        else if(n<=59 && n>=50){
            System.out.println("Grade E");
        }
        else{
            System.out.println("Fail");
        }
    }
}
