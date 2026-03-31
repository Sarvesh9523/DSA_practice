public class NumberOfSteps {
    public static void main(String[] args){
        int num = 14 ;
        System.out.println(StepsCount(num));

    }
    static int StepsCount(int num){
        if(num == 0){
            return 0 ;
        }
        if(num % 2 == 0){
            return 1 + StepsCount(num/2) ;
        }
        
        return 1 + StepsCount(num - 1) ;
    }
    
}
