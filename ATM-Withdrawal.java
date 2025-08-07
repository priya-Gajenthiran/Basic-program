import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc= new Scanner(System.in);
        int amt=sc.nextInt();
        sc.nextLine();
        String status = sc.nextLine();
        if(status.equals("available")){
            if(amt%100==0)
              System.out.println("Amount "+amt+" can be withdrawn");
            else
               System.out.println("Enter amount in multiples of 500");
        }
       else{
           if(amt%500 == 0){
                             System.out.println("Amount "+amt+" can be withdrawn");
          }
            else
               System.out.println("Enter amount in multiples of 500");
       }                          
    }
}
