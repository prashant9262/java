//package pattern;

import java.util.Scanner;
public class Hollow_Rectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row :");
        int row = sc.nextInt();
        System.out.println("enter a column :");
        int column = sc.nextInt();

        for (int i = 0; i<row; i++){
            for(int j=0; j<column;j++){
                if(i == 0 || i == row-1 || j == 0 || j == column-1){
                System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }


            }
           System.out.println( ); 
            

           
        }
        sc.close();
       
    }
    
}
