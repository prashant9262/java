
import java.util.Scanner;

public class ifelselengthandbredth_userinput {
    public static void main (String [] arg) {

        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a length :");
        int length = sc.nextInt();

        System.out.print("Enter a breadth :");
        int breadth = sc.nextInt();
        int area = length * breadth;

        int perimeter = 2 * (length + breadth);

        if(area>perimeter){
            System.out.println("Area is grater than perimeter :");

        }
        else if(area<perimeter){
            System.out.println("perimeter is grater than area :");

        }
        else {
            System.out.println("area is equal to perimeter");
        }
        sc.close();
    }

    
}
