
import java.util.Scanner;
public class forloopdisplaythisap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number :");
        int n = sc.nextInt();
        //display this ap 1,3,5,7,9________up to n tearms
       // for (int i=1;i<=2*n-1;i=i+2){
       //     System.out.println(i+ " ");
        //}
      
        // display this ap ---> 4,7,10,13,16,__________up to n 
                  // methode-----> (1)
       //for(int i = 4; i<= 3*n-1; i=i+3){
       // System.out.println(i + " ");
      // }
                 // Methode------> (2)
        //int a = 3, d = 4;
        //for (int i = 1; i<=n ; i++){
        //    System.out.println(a + " ");
          //   a+=d;
       // }

       // Display this G.p- 3,12,48,_______up to n terams . >>>>>>>>>>>>>>>>>>>>>>> 
       int a = 3, d = 4;
       for (int i =1; i<=n; i++){
        System.out.println(a + " ");
        a*=d;

       }
       sc.close();

        
    }
    
}
