
import java.util.Scanner;

public class nestedifelsethreeintegergraterofthem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a first integer :");
        int a = sc.nextInt();
        System.out.println("Enter a second integer :");
        int b = sc.nextInt();
        System.out.println("Enter a third integer :");
        int c = sc.nextInt();

        if(a>b){
            if(a>c){
                System.out.println(a+ " is grater");
            }
            else{
                System.out.println(c+ " is grater");
            }
        }
        else {
            if (b>c){
                System.out.println(b+ " is grater");
            }
            else {
                System.out.println(c+ " is grater");
            }
        }
        sc.close();

    }
    
}
