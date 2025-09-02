import java.util.Scanner;

public class ifelse_temprature {
      public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a temprature :");
        double temp = sc.nextDouble();
        if (temp>100){
            System.out.println("feaver");
        }
        else if(temp<=100){
            System.out.println("You don't have a fever");
        }
        sc.close();
    }
    
}
