
import java.util.Scanner;
public class ifelsenumberistwodigitornot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();

        if (n>9 && n<100){
            System.out.println("This is a two digit number ");
        }
        else {
            System.out.println("it is not a two digit number ");
        }
        sc.close();

    }
}
