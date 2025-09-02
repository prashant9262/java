// This program checks if a number entered by the user is odd or even

import java.util.Scanner;

public class ifelseoddeven_inputuser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("enter a number :");
        int n = sc.nextInt();
        

        if(n%2==0){
           System.out.println("even number");

        }
        if(n%2!=0){
            System.out.println("odd number");

        }
        sc.close();
      // else {
        //System.out.println("odd number");
       //}

        
    }
    
}
