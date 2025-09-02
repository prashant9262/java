
import java.util.Scanner;
public class forlooptableofn_ininputuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a table :");
        int n = sc.nextInt();
        for(int i = 1;i<=10; i++ ){
            System.out.println(n*i);
        }
        sc.close();
        
    }
    
}
