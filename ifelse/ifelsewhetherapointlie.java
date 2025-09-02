
import java.util.Scanner;

public class ifelsewhetherapointlie {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input circle parameters
        System.out.print("Enter the center coordinates x1 of the circle: ");
        int x1 = sc.nextInt();
        System.out.print("Enter the center coordinates y1 of the circle: ");
        int y1 = sc.nextInt();

        System.out.print("Enter the radius of the circle: ");
        int r = sc.nextInt();

        // Input point coordinates
        System.out.print("Enter the coordinates x2 of the point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter the coordinates y2 of the point: ");
        int y2 = sc.nextInt();

        // Calculate distance between the point (x, y) and the circle's center (cx, cy)
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        // Determine the position of the point relative to the circle
        if (distance < r) {
            System.out.println("The point is inside the circle.");
        } else if (distance == r) {
            System.out.println("The point is on the circle.");
        } else {
            System.out.println("The point is outside the circle");
        }
        sc.close();

        
    
    }

}
