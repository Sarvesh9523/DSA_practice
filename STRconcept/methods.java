import java.util.Arrays;

public class methods {
    public static void main(String[] args){
        String name = "Sarvesh Kumar" ;
        System.out.println(Arrays.toString(name.toCharArray())); // toCharArray() change the string into array .
        System.out.println(name.toLowerCase()); // .toLowerCase() will not change the original string it will create a new string obj . 
        System.out.println(name) ; // This is the proof of string immutability and even after doing lowercase it will print the original string .
        System.out.println(name.indexOf('a')); // .indexOf() method give the index of entered character from the original String.


    }
    
}
