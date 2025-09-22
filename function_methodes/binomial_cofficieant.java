import java.util.Scanner;

public class binomial_cofficieant {
    public static int factorial (int n){
        int f = 1;

        for (int i=1; i<=n; i++){
            f = f*i;
        }
        return f;
    }
    public static int binocoff(int n, int r){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int binocoff = fact_n/(fact_r * fact_nmr);
        return binocoff;


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number N :");
        int n = sc.nextInt();
        System.out.println( "Enter a number R :");
        int r = sc.nextInt();
        System.out.println("The binomial_factorial of "+ n + " or " + r + " " + " --> " + binocoff(n , r));

        sc.close();
    }

    
}
