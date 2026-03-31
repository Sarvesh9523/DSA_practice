/*These are the string methodes : 
 * .equal() --> this method is used to compare the object only it doesn't care about the reference varuable
 * .charAt()--> this methed is used to get the character from the given index in this method.
 * == --> this is comparator, it is used to compare the reference variable of the string.
 * Example:
 * String a = "Sarvesh" ;
 * String b = "Sarvesh" ; 
 * where String is the data type 
 *   a is the refrence variable 
 *   "Sarvesh" is the object .
*/


public class comparision {
    public static void main (String[] args){
        String a = "Sarvesh" ;
        String b = "Sarvesh" ; 
        String c = a ;
        System.out.println(c == a ); // it will give true because it is create in same string pool .
        System.out.println(a == b ); // it will give true because it is create in same string pool .
        // == 
        // System.out.println(a == b); // it will print true if it is equal by local variable or refrence variable .

        String name1 = new String("sarvesh");
        String name2 = new String("sarvesh");
        System.out.println(name1 == name2 ); // it will give false because it creating new object within the heap memory not in the same stringpool .

        // what if i want to compare only vlaue 
        System.out.println(name1.equals(name2)); // .equals() compare only the object value and this line print true .
        System.out.println(name1.charAt(0)); // .charAt() give the index value in the String . And it will print A because at "0" index in string "S" is .

    }
    
    
}


