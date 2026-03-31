import java.util.* ;
public class Find_Union{
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2, 3, 6, 7};
        
        ArrayList<Integer> unionList = findUnion(a, b);
        
        System.out.println("Union: " + unionList);
    }
    public static ArrayList<Integer>findUnion(int[] a, int[] b){
        HashSet<Integer> set = new HashSet<>() ; // creating the new Hashset named set to store the unique values from the array a and b .
        for(int num : a){  // itrate the array a with integer num and then store the num element in set .
            set.add(num) ;
        }
        for(int num : b){
            set.add(num) ;
        }

        ArrayList<Integer> resultList = new ArrayList<>(set) ; // converting hashset to arraylist named resultList .
        Collections.sort(resultList); // it's a predefined method in java to sort the list in ascending order.
        return resultList ; // returning the arraylist type integer ;


    }
}