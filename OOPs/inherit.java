/*
 Inheritance means copy the properties 
 so in heritance one child class inherit the properties of parent class just like in this example 
 Shape is parent class and triangle is child class 
 even after triangle class is not having the property of color and shape it will print the info() function that triangle class have 
 triangle class inherit the property using extend keyword 
 */

class Shape{
    String color ;
    String shape ;
}

class triangle extends Shape{
    void info(){
        System.out.println("The color of "+ this.shape + " is " + this.color);
    }
}


public class inherit {

    public static void main (String[] args){
        triangle t1 = new triangle() ;
        t1.color = "Red" ;
        t1.shape = "Triangle" ;
        t1.info();

    }
    
    
}
