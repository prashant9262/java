

public class traverseInString{
    public static String travers(String s){
        StringBuilder st = new StringBuilder();
        for (int i = 0; i< s.length() ; i++){
           st.append(s.charAt(i));
          
        }
        return st.toString();
    }
    public static void main(String[] args) {
       String s = "prashant";
     
        System.out.println(travers(s));
    }

}