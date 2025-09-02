
import java.util.Scanner;

public class forloopprinthelloworld {
    public static void main (String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        int i;

        for(i = 1; i<= n; i++ ){
            System.out.println(i+ "- hello world");
            sc.close();

        }
        System.out.println(i);
           
    }   
    
}
