import java.util.*;

// public class Letter_Combinations_of_a_Phone_Number_17 {
//     public static void main(String[] args) {
//         String digits = "23" ;
//         // System.out.println(KeyPad("", digits));
//         System.out.println(RealKeyPad(digits));

//     }

//     static ArrayList<String> KeyPad(String p, String up) {
//         if (up.isEmpty()) {
//             ArrayList<String> ans = new ArrayList<>();
//             ans.add(p);
//             return ans;
//         }

//         // now covert the string digit into integer digit
//         int digit = up.charAt(0) - '0';
//         ArrayList<String> ans = new ArrayList<>();
//         for (int i = (digit - 1) * 3; i < (digit * 3); i++) {
//             char ch = (char) ('a' + i);
//             ans.addAll(KeyPad(p + ch, up.substring(1)));
//         }
//         return ans;

//     }

//     // correct mapped character according to real keypad and then solution
//     static String[] map = {
//             "",     // 0
//             "",     // 1
//             "abc",  // 2
//             "def",  // 3
//             "ghi",  // 4
//             "jkl",  // 5
//             "mno",  // 6
//             "pqrs", // 7
//             "tuv",  // 8
//             "wxyz"  // 9

//     };

//     static ArrayList<String> RealKeyPad(String digits) {
        
//         if(digits.isEmpty()){
//             ArrayList<String> base = new ArrayList<>();
//             base.add("");
//             return base ;
//         }
//         int digit = digits.charAt(0) - '0' ;
//         String onKey = map[digit] ;

//         ArrayList<String> smallAns =
//             RealKeyPad(digits.substring(1));

//         ArrayList<String> ans = new ArrayList<>();

//         for(int i = 0; i < onKey.length(); i++){

//         char ch = onKey.charAt(i);

//         for(String s : smallAns){

//             ans.add(ch + s);
//         }
//     }
//         return ans ;

//     }



// }

 public class Letter_Combinations_of_a_Phone_Number_17 {
    public static void main(String[] args) {
        String digits = "23" ;
//         // System.out.println(KeyPad("", digits));
        System.out.println(letterCombinations(digits));

    }

    static String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public static List<String> letterCombinations(String digits) {

        List<String> ans = new ArrayList<>();

        if(digits.length() == 0) {
            return ans;
        }

        backtrack(0, digits, new StringBuilder(), ans);

        return ans;
    }

    static void backtrack(int index,
                   String digits,
                   StringBuilder current,
                   List<String> ans) {

        if(index == digits.length()) {

            ans.add(current.toString());
            return;
        }

        int digit = digits.charAt(index) - '0';

        String letters = map[digit];

        for(int i = 0; i < letters.length(); i++) {

            current.append(letters.charAt(i));

            backtrack(index + 1, digits, current, ans);

            current.deleteCharAt(current.length() - 1);
        }
    }
}