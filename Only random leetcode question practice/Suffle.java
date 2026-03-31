public class Suffle{
    public static void main(String[] args){

    }

    static void alignStr(String str, int[] indices){
        char[] shuffled = new char[str.length()] ;
        for(int i=0; i<str.length(); i++){
            shuffled[indices[i]] = str.charAt(i) ;
            
        }
        return new String(shuffled) ;
    }
}