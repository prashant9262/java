import java.util.Scanner;

//public class cheack_prime_or_not {
//     public static boolean isprime(int n){
//         for(int i = 2; i<=n-1; i++){
//             if (n%i == 0){
//                 return false;
//             }
//         }
//         return true;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number :");
//         int n = sc.nextInt();
//         System.out.println(isprime(n));

//         sc.close();
//     }
//}

// this code for optmize solution to cheack if a number prime of using function and methode 
public class cheack_prime_or_not {
    public static boolean isprime(int n){
    if(n == 2){
      return true;
    }
    for(int i = 2; i<=Math.sqrt(n); i++){
        if (n % i == 0){
            return false;
        }

    }
    return true;

 }
 public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter a number :");
     int n = sc.nextInt();
     System.out.println(isprime(n));

     sc.close();
    
    }

    
}
