
import java.util.Scanner;

public class ifelseabsolutevalue_inputuser {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a absolute value :");
        int n = sc.nextInt();

        if(n<0){
            n = n * (-1);

        }
        sc.close();

        System.out.println("The absolute value is :" +n);
    }
    
    
}
