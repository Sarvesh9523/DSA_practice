import java.util.HashMap;

public class First_None_Repeating_Character {
    public static void main(String[] args){
        String str = "aabbecdeff";
        // char ch = (char)(NoneRepeatingCharacter(str));
        
        int result = NoneRepeatingCharacter2(str);
        if(result == -1){
            System.out.println("-1");
        }else{
            System.out.println((char) result);
        }
    }

    static int NoneRepeatingCharacter(String str){
        str = str.toLowerCase().replace(" ", "");

        HashMap<Character, Integer> map = new HashMap<>();
        for(int i =0; i<str.length(); i++){
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        for(int i=0; i<str.length(); i++){
            if(map.get(str.charAt(i)) == 1){
                return str.charAt(i) ;
            }

        }

        return -1 ;      
    }
    
    //Another approache to find using frequency array

    static int NoneRepeatingCharacter2(String str){
        str = str.toLowerCase().replace(" ", "");
        int[] freq = new int[26];
        for(int i=0; i<str.length(); i++){
            freq[str.charAt(i) - 'a']++ ;
        }

        for(int i =0; i<str.length(); i++){
            if(freq[str.charAt(i) - 'a'] == 1){
                return str.charAt(i) ;
            }
        }

        return -1;
    }
}
