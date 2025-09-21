//package function_methodes;

import java.util.Scanner;

public class parameter{
    public static int calculatesum(int a, int b){ //jo parameters ham function ki defenation me likhte hai use ham --> parameter ya formal parameter kehte hai
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter numer A:");
        int a = sc.nextInt();
        System.out.print("Enter numer B:");
        int b = sc.nextInt();
        int sum = calculatesum(a, b); // jo value ham call krte hai wo ---> argument or actual parameter  hote hai
        System.out.println("Sum is :" + sum);
    }
    
}
