import java.util.Scanner;

public class reverse_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        for(int i = 0; i<n ; i++){
           int lastDigit = n%10;
           System.out.print(lastDigit);
           n = n/10;
        }
        System.out.println( );
        sc.close();
    }
    
    
}
