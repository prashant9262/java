
import java.util.Scanner;
public class forloopprintonetohundred {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        int i=0;
        for(i=1;i<=n;i++){
          System.out.println(i);
          sc.close();
        }
        
    }
    
    
}
