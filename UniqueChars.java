/** String processing exercise 2. */
public class UniqueChars {
    public static void main(String[] args) {  
        String str = args[0];
        System.out.println(uniqueChars(str));
    }

    /**
     * Returns a string which is identical to the original string, 
     * except that all the duplicate characters are removed,
     * unless they are space characters.
     */
    public static String uniqueChars(String str) {
          String uniqueChars = "";
        boolean duplicate;
        int n;
      for (int i = 0; i < str.length(); i++ ){
         duplicate = false;
        if(str.charAt(i) != ' '){
           n = str.indexOf(str.charAt(i));
           if(str.charAt(n) == str.charAt(i) && (i != n)){
           duplicate = true;
           }
          }
        if (!duplicate)
            uniqueChars += str.charAt(i);
      }
        return uniqueChars;
    }
}

  
