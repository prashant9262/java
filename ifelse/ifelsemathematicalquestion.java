
import java.util.Scanner;

public class ifelsemathematicalquestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //****************************FIRST METHODE*****************************
        System.out.println("Enter a number :");
        Double x1 = sc.nextDouble();
        System.out.println("Enter a number :");
        Double x2 = sc.nextDouble();
        System.out.println("Enter a number :");
        Double x3 = sc.nextDouble();
        System.out.println("Enter a number :");
        Double y1 = sc.nextDouble();
        System.out.println("Enter a number :");
        Double y2 = sc.nextDouble();
        System.out.println("Enter a number :");
        Double y3 = sc.nextDouble();

        if ((y2-y1)/(x2-x1) == (y3-y2)/(x3-x2)){
            System.out.println("The three point lie on a single point");
        }
        else {
            System.out.println("The three point is not lie on a single point");
        }
        sc.close();
        //***************************SECOND METHODE******************************
        // int x1 = 1, x2 = 2 ,x3 = 3 ,y1 = 1 ,y2 = 2 ,y3 = 3;
        // int m1 = (y2-y1)/(x2-x1);
        // int m2 = (y3-y2)/(x3-x2);

        // if (m1==m2) {
        //     System.out.println("The three point lie on a single line");
            
        // }
        // else {
        //     System.out.println("The three point is not lie on a single line");
        // }
        

    }
    
}
