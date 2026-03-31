public class ReverseWord {
    public static void main(String[] args){
        String str = "Hello World Java" ;
        System.out.println(reverse(str));

    }

    static String reverse(String str){
        String[] StrArr = str.split("\s+");

        int left = 0;
        int right = StrArr.length - 1 ;
        while(left < right){
            String temp = StrArr[left] ;
            StrArr[left] = StrArr[right];
            StrArr[right] = temp ;
            left++ ;
            right--;
        }
        return String.join(" ", StrArr) ;

    }
    
}
