package Array;

import java.util.Scanner;

public class data_type {
    // Data Type in array
    public static void main(String[] args) {
    int marks [] = new int[100];
    // int number []= {1, 2, 3};
    // int morenumber[] = {1, 2, 3, 4};
    // String frute [] = {"apple", "mango", "banana"};

    Scanner sc = new Scanner(System.in);
    marks[0] = sc.nextInt();
    marks[1] = sc.nextInt();

    System.out.println(marks[0]);
    System.out.println(marks[1]);

    sc.close();
    }
    
    
        
    
}
