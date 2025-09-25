public class fun_overloding_using_DT {
    //function overloding using data type

    //function to calculate int sum
    public static int sum(int a, int b){
        return a+b;
    }
    
    //Function to calculate flote
    public static float sum(float a , float b){
        return a+b;
    }
    
    public static void main(String[] args) {
        System.out.println(sum (5 , 6));
        System.out.println(sum(4.5f , 6.2f));
    }
    
}
