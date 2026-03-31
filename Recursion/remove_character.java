// this programe will remove 'a' character from the given string .

public class remove_character {
    public static void main(String[] args) {
        String str = "baccadh" ;
        skip1("", str);
        System.out.println(skip2(str)) ;
        
    }
    // here i am taking two variables processed and Unprocessed string the Unprocessed string will be given and the processed will be answer .
    static void skip1(String processed , String Unprocessed){
        if(Unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = Unprocessed.charAt(0) ;
        if(ch == 'a'){
            skip1(processed, Unprocessed.substring(1));

        }else{
            skip1(processed + ch, Unprocessed.substring(1));
        }
    }

    //2nd approach 

    static String skip2(String str){
        if(str.isEmpty()){
            return "";
        }
        char ch = str.charAt(0) ;

        if(ch == 'a'){
            return skip2(str.substring(1));
        }
        else{
            return ch + skip2(str.substring(1)) ;
        }
        

    }


    
}



