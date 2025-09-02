import java.util.Scanner;
public class positive_or_negative {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a inteager :");
        int num = sc.nextInt();
        if (num>0){
            System.out.println("The positive number");
        } 
        else if(num==0){
            System.out.println("neither positive nor negative");
        }
        else{
            System.out.println("The neagitive number");
        }
        sc.close();
       
    }
    
    
}
