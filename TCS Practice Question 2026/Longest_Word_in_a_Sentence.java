public class Longest_Word_in_a_Sentence {
    public static void main(String[] args){
        String str = "I love competitive programming";
        longest_string(str);
    }

    static void longest_string(String str){
        str = str.toLowerCase() ;
        String[] word = str.split("\\s+") ;
        String longestWord = word[0] ;
        int max = word[0].length() ;
        for(int i = 1; i < word.length; i++){
            if(word[i].length() > max){
                max = word[i].length() ;
                longestWord = word[i];
            }          
        }
        System.out.println(longestWord);
        
    }
    
}
