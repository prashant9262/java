
import java.util.Scanner;
public class nestedifelsedivisiblebythreefivenotfifteen {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        
        
      if (n%3==0 || n%5==0){
            if (n%15!=0){
                System.out.println("The number is divisible by 3 and 5");

            }
            else {
                System.out.println("The number is not divisible");
            }
        }    

    
       else {
          System.out.println("The number is not divisible");
        }
        sc.close();



    }
}
   
