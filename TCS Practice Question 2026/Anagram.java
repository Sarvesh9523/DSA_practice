import java.util.HashMap;

public class Anagram{
    public static void main(String[] args){
        String str1 = "Listen" ;
        String str2 = "silent" ;
        System.out.println(CheckAnagram2(str1, str2));
    }


    // This one is not a best approach because operation of hashmap is costly and here two maps are compared 
    static boolean CheckAnagram(String str1, String str2){
        char[] charArr1 = str1.toLowerCase().replace(" ", "").toCharArray() ;
        char[] charArr2 = str2.toLowerCase().replace(" ", "").toCharArray() ;

        HashMap<Character, Integer> map1 = new HashMap<>() ;
        for(int i=0; i<charArr1.length; i++){
            map1.put(charArr1[i], map1.getOrDefault(charArr1[i], 0) + 1);
        }

        HashMap<Character, Integer> map2 = new HashMap<>() ;
        for(int i=0; i<charArr2.length; i++){
            map2.put(charArr2[i], map2.getOrDefault(charArr2[i], 0) + 1);
        }

        if(!map1.equals(map2)){
            return false;
        }

        return true;
        

    }

    //best approach
    static boolean CheckAnagram2(String str1 , String str2){
        int[] freq = new int[26] ;
        str1 = str1.toLowerCase().replace(" ", "");
        str2 = str2.toLowerCase().replace(" ", "");

        if(str1.length() != str2.length()) return false ;

        for(int i =0; i<str1.length(); i++){
            freq[str1.charAt(i) - 'a']++;
            freq[str2.charAt(i) - 'a']--;
        }

        for(int f : freq){
            if(f != 0){  // we already make freq of every element to zero that why we are checking for non zero freq element that's why this condition is correct
                return false;
            }

        }
        return true ;
    }
}