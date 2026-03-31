public class CheckPalindrome {

    public static void main(String[] args){
        String str = "Hello" ;
        System.out.println(palindrome(str));
    }

    /*
     * Given a string, check if it is a palindrome. Ignore spaces and case.
     * A palindrome reads the same forwards and backwards.
     * Input: "Race Car"
     * Output: Palindrome
     * 
     * Input: "Hello"
     * Output: Not Palindrome
     */

    static boolean palindrome(String str){
        str = str.toLowerCase().replace(" ", "");
        for(int i =0; i<str.length()/2; i++){
            if(str.charAt(i) != str.charAt(str.length()-i-1)){
                return false ;
            }
        }
        return true ;
        
    }

}
