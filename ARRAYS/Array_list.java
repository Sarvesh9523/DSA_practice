import java.util.ArrayList ;
public class Array_list{
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(2);  // ArrayList is the class of collection framework and it is use when we don't know the size of Array . It is slower than the standard array.
        list.add(67);  // add() function is used to add element in the list. we can add more than 2 or less also as already defined in line 4 initial capacity is 2. 
        list.add(68); 
        list.add(69); 
        list.add(65); 
        list.add(66); 
        list.add(63); 
        System.out.println(list);  // print() function is used to print the list.

        //Method to find the Element is yes then will print true otherwise False
        System.out.println(list.contains(66)); // contains() function is used to find the element that already exist in the list if it found then will print ture otherwise print flase .
        System.out.println(list.contains(99)); // here is the example of true and false contains. Because 99 is not in the list that's why it will print false.

        // Method to change the element at particular index.
        list.set(0, 23); // Basically here i am change the element in the list by using list.set(index, new element).
        System.out.println(list); // then print the new list .

        //Method to remove the element from specific index.
        list.remove(0) ; // This function will remove the 0th index element.
        System.out.println(list); // then print the new list .
    }
}