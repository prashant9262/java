
import java.util.Scanner;

public class ifelsedivisibleby5_inputuser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if(n%5==0){
            System.out.println("The number is divisible");
       
        }
        
         else{
            System.out.println("The number is not sivisible");
        }
        sc.close();


    }
    
}
