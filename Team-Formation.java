import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int tot = sc.nextInt();
        int player = sc.nextInt();
        System.out.println("Total teams formed: "+ tot/player);
        System.out.println("Players left out: "+ tot%player);
    }
}
