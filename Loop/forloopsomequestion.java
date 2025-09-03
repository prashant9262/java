
import java.util.Scanner;

public class forloopsomequestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int sum = 0;
       /*  int sum = 0;

        for(int i = 0; i<=n; i++){
            sum = sum+i;

        }
        System.out.println("sum of number up to :" +sum);
        */

        // this code is created by while loop.. for sum of N natural number..
        int i= 0;  
        while (i<=n){
            sum += i;
            i++;
        }
        System.out.println("The sum is :" + sum);
         sc.close();
     
    }
    
}
