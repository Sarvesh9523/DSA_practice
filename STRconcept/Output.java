import java.util.Arrays ;
public class Output {
    public static void main(String[] args) {
        System.out.println(56);
        System.out.println("Sarvesh");
        System.out.println(new int[]{2, 3, 4, 5}); // this will print some random number becuase by it usage its own .toString class to print .
        System.out.println(Arrays.toString(new int[]{2, 3, 4, 5})); // it will print correct because it usage Array.toString to print the array but it will in string data type .
        String name = null ;
        System.out.println(name);

        // wrapper class 
        System.out.println(56);
        Integer num = new Integer(56) ; // here Integer is the wrapper class .
        System.out.println(num.toString()); //it will also print 56 but by using num.toString method .
        System.out.println(num); // the line 14 and 15 will do the same thing because in java .toString is inbuilt .
    }
    
}
