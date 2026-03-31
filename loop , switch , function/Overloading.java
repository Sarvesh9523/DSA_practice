public class Overloading{
    public static void main(String[] args){
        // Now here the argument going to be passes after making the function named fun.
        fun(1);
        fun("Sarvesh");

    }

    // Basically Method overloading contains Multiple function with the same name but only differences is in thier passed argument  , let see the one example.

    static void fun(int a ){ // function 1st
        System.out.println("This is the first one ");
        System.out.println(a);

    }
    static void fun(String name){  // function 2nd
        System.out.println("This is the second one ");
        System.out.println(name);
    }

}