
import java.util.Scanner;
public class ifelsedivisiblebyfiveorthree {
   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter a number :");
    int n = sc.nextInt();
    
    if(n%5==0 && n%3==0){
        System.out.println(" It is divisible by 3 and 5 ");

    }

    else{
        System.out.println(" it is not divisible by 3 and 5 ");
   
    }
    sc.close();

  }
    
}
