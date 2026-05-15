import java.util.*;
public class permutation {
    public static void main(String[] args) {
        Permutation("", "abc");

        // System.out.println("-----------Solve same question with ArrayList concept-----------") ;
        
        // ArrayList<String> ans = PermutationList("", "abc");
        // System.out.println(ans);

        // System.out.println("-----------The total permutation is -----------") ;
        // System.out.println(permutationcount("", "abc"));


        
    }
    
    static void Permutation(String p , String Up) {
        if(Up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = Up.charAt(0) ;
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length()) ;
            Permutation(f + ch + s , Up.substring(1));
        }
    }

    // Second approach for same question
    

    static ArrayList<String> PermutationList(String p , String Up) {
        if(Up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p) ;
            return list ;
            
        }
        char ch = Up.charAt(0) ;

        ArrayList<String> ans = new ArrayList<>() ;
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length()) ;
            ans.addAll(PermutationList(f + ch + s, Up.substring(1))) ;
        }
        return ans ;
    }

    // program to find the number of permutation

    static int permutationcount(String p , String Up) {
        if(Up.isEmpty()){
            return 1;
        }
        int count = 0 ;
        char ch = Up.charAt(0) ;
        for(int i=0; i<=p.length(); i++){
            String f = p.substring(0, i);
            String s = p.substring(i, p.length()) ;
            count = count + permutationcount(f + ch + s , Up.substring(1));
        }
        return count ;
    }
    
}
