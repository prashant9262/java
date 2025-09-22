import java.util.Scanner;

public class factorial_using_methode{
    public static double factorial (double n){
        double f = 1;

        for (double i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        double n = sc.nextDouble();
        System.out.println("The factorial of " + n+ " -> " + factorial(n));

        sc.close();
    }

    
}
