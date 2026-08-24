import java.util.*;

public class Longest_Palindromic_Substring_5 {
    public static void main(String[] args){
        String s = "babad";
        System.out.println(longestPalindrome1(s));

    }

    //First Method Brute Force
    public static String longestPalindrome1(String s){
        String ans = "";
        for(int left = 0; left<s.length(); left++){
            for(int right = left; right<s.length(); right++){
                if(isPalindrom(s, left, right)){
                    if(right - left + 1 > ans.length()){
                        ans = s.substring(left, right + 1);
                    }
                }
            }
        }
        return ans ;
    }
    static boolean isPalindrom(String s, int left, int right){
        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false ;
            }
            left++;
            right--;
        }
        return true ;
    }

    //Second Method
    //Best Approach to expand the palindrom from center and center element can be 1 or 2 mean odd lenght or even length
    public static String longestPalindrome2(String s) {       
        if(s == null || s.length() < 1) return "" ;
        int start = 0;
        int end = 0;
        for(int i=0; i<s.length(); i++){
            //odd lenght palindrom check
            int len1 = expand(s,i,i);

            //even length palindrom check
            int len2 = expand(s, i, i+1);
            int maxlen = Math.max(len1, len2) ;
            if(maxlen > end - start){
                start = i - (maxlen-1)/2;
                end = i + maxlen/2;
            }
            
        }
        return s.substring(start, end + 1);
        
    }
    static int expand(String s, int left, int right){
        while(left > 0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        return right - left - 1;
    }
    
}
