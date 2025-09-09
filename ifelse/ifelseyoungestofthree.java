
import java.util.Scanner;

public interface ifelseyoungestofthree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ram age :");
        int a = sc.nextInt();
        System.out.println("Enter shyam age :");
        int b = sc.nextInt();
        System.out.println("Enter ajay age :");
        int c = sc.nextInt();

        // if(a>b && a>c){
        //     System.out.println(a+ " ram is youngest");
        // }
        // else if (b>a && b>c){
        //     System.out.println(b+ " shyam is youngest");
        // }
        // else if (c>a && c>b){
        //     System.out.println(c+ " ajay is youngest");
        // }
        // else {
        //     System.out.println( "Three are same");
        // }
         if (a>b){
            if (a>c){
                System.out.println(a+ " Ram is youngest");
            }
            else {
                System.out.println(c+ " Ajay is youngest");
            }
            
        }
        else {
            if (b>c){
                System.out.println(b+ " Shyam is youngest");
            }
            else {
                System.out.println(c+ " Ajay is youngest");
            }
        }
        sc.close();

    }
}
