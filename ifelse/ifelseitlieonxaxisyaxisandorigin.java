
import java.util.Scanner;

public class ifelseitlieonxaxisyaxisandorigin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int x = sc.nextInt();
        System.out.println("Enter a number :");
        int y = sc.nextInt();

        if (x==0 && y==0){
            System.out.println("The point is origen");
        }
        else if (x==0){
            System.out.println("the point is y-axis");

        }
        else if (y==0){
            System.out.println("The point is x-axis");
        }
        else {
            System.out.println("The point is not liye");
        }
        sc.close();

    }
    
}
