import java.util.* ;
public class subseq {
    public static void main(String[] args) {
        String str = "abc" ;
        // ArrayList<String> ans = new ArrayList<>() ;
        SubSeq("", str);
        
        // System.out.println(SubSeq1("",str, ans));
        // System.out.println(SubSeq2("", str));

    }

    static void SubSeq(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return ;
        }

        char ch = up.charAt(0) ;
        SubSeq(p +ch, up.substring(1)) ;
        SubSeq(p, up.substring(1)) ;        
    }

    //Another apprach using String datatype ArrayList
    static ArrayList<String> SubSeq1(String p, String up, ArrayList<String> ans){
        if(up.isEmpty()){
            ans.add(p);
            return ans ;
        }

        char ch = up.charAt(0) ;

        SubSeq1(p + ch, up.substring(1), ans);
        SubSeq1(p, up.substring(1), ans);

        return ans ;

    }
//best for Interview and recursion understanding (use return type ArrayList but don't pass any arraylist in parameter)
    static ArrayList<String> SubSeq2(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> ans = new ArrayList<>() ;
            ans.add(p);
            return ans ;
        }

        char ch = up.charAt(0) ;

        ArrayList<String> left = SubSeq2(p + ch, up.substring(1));
        ArrayList<String> right = SubSeq2(p, up.substring(1));

        left.addAll(right) ;
        return left ; 
    }
    
}
