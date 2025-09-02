
import java.util.Scanner;

public class ifelsesideofatrangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first side :");

        int a = sc.nextInt();

        System.out.println("Enter a second side :");

        int b = sc.nextInt();

        System.out.println("Enter a third side :");

        int c = sc.nextInt();

        if (a+b>c && b+c>a && c+a>b){
            System.out.println (" it is a trangle");
        }
        else{
            System.out.println("It is not a trangle");
        }
        sc.close();


    }
    
}
