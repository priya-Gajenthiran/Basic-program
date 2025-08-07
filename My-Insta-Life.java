import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        String name=sc.nextLine().trim();
        int follow=sc.nextInt();
        int post = sc.nextInt();
        double hour= sc.nextDouble();
        System.out.println("My name is "+name+", my Instagram has "+follow+" followers, "+"I have posted "+post+" posts, and I use Instagram for "+hour+" hours daily.");
    }
}
