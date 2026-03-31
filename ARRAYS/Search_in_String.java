public class Search_in_String {
    public static void main(String[] args) {
        String str = "Hello, World!";
        char target = 'W';
        boolean ans = Search_String(str, target) ;
        System.out.println(ans);
        
    }
    static boolean Search_String(String str, char target){
        if(str.length()==0){
            return false ;
        }
        for(int i=0; i<str.length(); i++){
            
            if(target == str.charAt(i)){
                return true ;
            }
        }
        return false ;
    }
    
}
