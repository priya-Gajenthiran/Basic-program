import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int a= sc.nextInt();
        double h=sc.nextDouble();
        sc.nextLine();
        String n=sc.nextLine();
        System.out.printf("%s is %d years old and %.2f meters tall.",n,a,h);
    }
}
