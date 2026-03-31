public class StrLength {
    public static void main(String[] args){
        String str = "sarvesh";
        System.out.println(Length(str));

    }
    static int Length(String str){
        if(str.equals("")){
            return 0;
        }
        else{
            return Length(str.substring(1)) + 1 ;
        }
    }
    
}
