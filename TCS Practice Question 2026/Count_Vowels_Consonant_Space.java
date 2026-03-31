public class Count_Vowels_Consonant_Space{
    public static void main(String[] args){
        String str =  "Hello World";
        count(str);


    }

    static void count(String str){
        char[] ch = str.toLowerCase().toCharArray() ;
        String vowels = "aeiou";

        
        int consonentCount = 0;
        int Vowelcount = 0;
        int spaceCount = 0;

        for(int i=0; i<ch.length; i++){
            if(ch[i] == ' ') spaceCount++ ;
            else if(vowels.indexOf(ch[i]) != -1) Vowelcount++ ;
            else if(ch[i] >= 'a' && ch[i] <= 'z') consonentCount++ ;
        }
        
        
        System.out.println("Vowel: " + Vowelcount);
        System.out.println("Consonent: " + consonentCount);
        System.out.println("Space: " + spaceCount);


    }
    
}
