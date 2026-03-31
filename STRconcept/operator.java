public class operator {
    public static void main(String[] args){
        System.out.println('a' + 'b') ; // it's just adding the ascii value of the character . 
        System.out.println("a" + "b"); // Now it ('+') concatinate the string .
        System.out.println((char) ('a' + 3)); // it will print d because the 3rd character after a is d .
        System.out.println("a" + 1); /* note: 
        this is same as after a few steps: "a" + "1" 
        when an integer is cancatinated with a string it is converted in to wrapper class 
        integer will be converted to Integer that will call toString() */
    }
    
}
