package Array;

import java.util.Scanner;

public class arrayInput {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int marks[] = new int [100];

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();

        System.out.println("Phy" + marks[0]);
        System.out.println("Math" + marks[1]);

        sc.close();
    }
    
}
