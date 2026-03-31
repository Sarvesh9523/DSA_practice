public class performance {
    public static void main (String[] args){
        String series = "" ;
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i) ;
            // System.out.println(ch);
            series = series + ch ;
        }
        System.out.println(series); // it will print all the alphabet in one line with the help of series .
        /*NOTE:
         * if one of the data type is String then output will be String .
         * in java the string is in double coat like --> "A" or "Sarvesh" .
         */

         // this method is not a good approach to print alphabets because it's time complexity is O(n*n) which is too bad .
         // The best approach to do the same thing is using StringBuilder not redirect the StringBuilder notes .

    }
    
}
