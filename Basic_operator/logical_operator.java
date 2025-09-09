
public class logical_operator {
    public static void main(String[] args) {
        
        int p = 15 ;
        int q = 10 ;
        int r = 5 ;

        // for && AND operator 

        System.out.println((p==q) && (p>r)); // false
        System.out.println((p>q) && (r<q)); // true

        // for || OR operator 

        System.out.println((p<q) || (q>r)); // true
        System.out.println((p>q) || (q>r)); // true
        System.out.println((p<q) || (q<r)); // false

        // for ! NOT operator 

        System.out.println(!(p>q)); // false
        System.out.println(!(p<q)); // true
    }
    
}
