import java.util.Scanner;
public class elseifparcentageofstudent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Percentege :");
        int n = sc.nextInt();

        if (n>90){
            System.out.println("Excelent");
        }
        else if (n>80){
            System.out.println("Very Good");
        }
        else if (n>70){
            System.out.println("Good");            
        }
        else if (n>60){
            System.out.println("Can do batter");
        }
        else if (n>50){
            System.out.println("Average");
        }
        else if (n>40){
            System.out.println("Bellow Average");
        }
        else {
            System.out.println("Fail");
        }
        sc.close();


    }
    
    
}
