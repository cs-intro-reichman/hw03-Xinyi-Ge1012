public class LowerCase {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(lowerCase(str));
    }

   /**
    * Returns a string which is identical to the original string, 
    * except that all the upper-case letters are converted to lower-case letters.
    * Non-letter characters are left as is.
    */
    public static String lowerCase(String str) {
          String lowerCase = "";
       for (int i = 0; i < str.length(); i++){
        if((str.charAt(i) >= 'A')&&(str.charAt(i) <= 'Z')){
            lowerCase += (char) (str.charAt(i)+32);
    
        } else {
            lowerCase += str.charAt(i);
        }
       }
        return lowerCase;
    }
}
