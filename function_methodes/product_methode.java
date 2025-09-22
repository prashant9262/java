import java.util.Scanner;
public class product_methode {
    public static int multiply (int a, int b){
        int multiply = a * b;
        return multiply;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter a number A :");
        int a = sc.nextInt();
        System.out.println("Enter a numbe B :");
        int b = sc.nextInt();
        int prod = multiply (a , b);
        System.out.println("The product is -> " + prod);

        sc.close();
    }
    
}
