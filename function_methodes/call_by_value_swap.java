import java.util.Scanner;

public class call_by_value_swap {

    public static void swap(int a, int b){
        a = a^b;
        b = a^b;
        a = a^b; 
        System.out.println("A = " + a);
        System.out.println("B = " + b);
    }
    
    public static void main (String arg []){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number A :");
        int x = sc.nextInt();
        System.out.println("Enter number B :");
        int y = sc.nextInt();
        swap (x , y);

        sc.close();

    }
    
}
