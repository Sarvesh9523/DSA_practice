/*
 Polymorphism is that where function name is same but the purpose of that function is different and they different in terms of argument, return type so 
 that means there should be one of the diffrentiating factor .
 */

class Student{
    String name;
    int age ;
    void info(){
        System.out.println("Age of the Student is " + this.age);
    }

    void info(String name){
        System.out.println("Name of the Student is: " + name);
    }

    void info(String name, int age){
        System.out.println("Name and Age of the Student is: " + name + " " + age);
    }
}

public class pilymorphism {
    public static void main(String[] args){
        Student s1 = new Student() ;
        s1.name = "Sarvesh" ;
        s1.age = 21 ; // it will automatically detect which function should i call so it will call the first void function
        s1.info(s1.name , s1.age) ; // same thing also goes here it will detect 3rd function because of argument that allready passed in function 

    }
    
}
