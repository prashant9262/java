public class function_overloading {
    //function overloading using parameters
    public static int sum_1(int a , int b){
        return a + b;

    }
    public static int sum_2(int a, int b, int c){
        return a + b + c;
    }
    public static void main(String[] args) {
        System.out.println(sum_1(5, 4));
        System.out.println(sum_2(4, 8, 6));
    }
    
}
