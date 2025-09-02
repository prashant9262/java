// This program calculates profit or loss based on user input for cost price and selling price. 
import java.util.Scanner;
public class ifelseprofitloss_inputuser {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("Enter a cost price :");
        int cp = sc.nextInt();
        
        System.out.println("Enter a selling price :");
        int sp = sc.nextInt();

        if(cp<sp){
            System.out.print("Your profit is :");
            int profit = sp-cp ;
            System.out.println(profit);

        }
        if(sp<cp){
            System.out.print("Your loss is :");
            int loss = cp-sp;
            System.out.println(loss);

        }
        sc.close();



    }
}