
import java.util.Scanner;

public class taking_input{
    public static void main (String [] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        System.out.println("Your name is : " + name);


        System.out.println ("Enter the number : ");
        int num1 = sc.nextInt();

        System.out.println("Your number is : " + num1);
        sc.close();
       

    }

}