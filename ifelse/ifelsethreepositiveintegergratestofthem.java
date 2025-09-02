
import java.util.Scanner;

public class ifelsethreepositiveintegergratestofthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first integer :");
        int a = sc.nextInt();
        System.out.println("Enter a second integer :");
        int b = sc.nextInt();
        System.out.println("Enter a third integer :");
        int c = sc.nextInt();

        if (a>b && a>c) {
            System.out.println(a+ " is grater ");
        }
        else if (b>a && b>c){
            System.out.println(b+ " is grater");
        }
        else if (c>a && c>b){
            System.out.println(c+ " is grater");
        }
        else {
            System.out.println(" it is not grater");
        }
        sc.close();
     
    }
}
