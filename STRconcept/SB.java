public class SB {
    public static void main(String[] args){
        StringBuilder builder = new StringBuilder() ;
        for(int i=0; i<26; i++){
            char ch = (char)('a' + i);
            builder.append(ch) ;
        }
        System.out.println(builder.toString());
        /* This method do the same this as I studied in performance but the only difference is we can modify the StringBuilder which is not possible in String .
        StringBuilder is also a seperate Data type which is mutable .
        */

        // there are so much method for StringBuilder also like 
        builder.deleteCharAt(0) ; // it will delete the 0th index character .
        System.out.println(builder);

        builder.reverse(); // it will reverse the alphabets .
        System.out.println(builder); // it will reverse the alphabets .
    }
    
}
