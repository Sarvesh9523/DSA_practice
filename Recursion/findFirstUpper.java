public class findFirstUpper {
    public static void main(String[] args){
        String str = "geekforgeeKs" ;
        // System.out.println(FindFindUpperCase(str));
        System.out.println(first(str, 0));


    }
    static char FindFindUpperCase(String str){
        for(int i=0; i < str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                return str.charAt(i) ;
            }
        }
        return 0 ;
    }

    // Now make it recursive 

    static char first(String str, int i){

        if(str.charAt(i) == 0){
            return 0 ;
        }
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i) ;
        }
        return first(str, i + 1) ;
    }
    
}
