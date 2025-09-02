
import java.util.Scanner;

public class whileloopusongsolvequesyion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");

        int n = sc.nextInt();

        int num = 1;
        while(num<=n){
            System.out.print(num+ " ");

            num++;

        }
        sc.close();
    }
    
}
