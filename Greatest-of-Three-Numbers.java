import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        char ch= sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppercase Alphabet");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("Lowercase Alphabet");
        }
        else if(ch>='0' && ch<='9'){
            System.out.println("Digit");
        }
        else{
            System.out.println("Special Character");
        }
        
        
    }
}
