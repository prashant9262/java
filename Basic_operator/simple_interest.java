
import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
      
        // taking input to user

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the principal : ");
        float p = sc.nextFloat();

        System.out.print("Enter the rate : ");
        float r = sc.nextFloat();

        System.out.print("Enter the time : ");
        float t = sc.nextFloat();

        float si = (p * r * t) /100;

        System.out.print("principal : " + p);
        System.out.print ("Rate : " + r);
        System.out.println("Time : " + t);

        System.out.println("simple interest : " + si);
        sc.close();
    
    }
    
}
