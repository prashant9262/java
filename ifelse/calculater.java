import java.util.*;
public class calculater {
    public static void main(String [] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number a :");
        int a = sc.nextInt();
        System.out.println("enter a number b :");
        int b = sc.nextInt();
        System.out.println("enter operator :");
        char operator = sc.next().charAt(0);

        switch (operator) {
            case '+':
            System.out.println("The number is"+ (a+b));
            break;
            case '-':
            System.out.println("The number is :" +(a-b));
            break;
            case '*':
            System.out.println("The number is :" + (a*b));
            break;
            case '/':
            System.out.println("The number is :" + (a/b));
            break;
            default:
            System.out.println("error");
                
                
        }
        sc.close();


    }
    
}
