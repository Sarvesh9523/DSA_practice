public class linear_Search {
    public static void main (String[] args){
        int[] arr = {1, 2, 3, 5, 55, 66, 78};
        int target = 66 ;
        System.out.println(search(arr, target, 0));
        System.out.println(search2(arr, target, 0));

    }

    static int search(int[] arr, int target, int index){
        if(index == arr.length){
            return -1 ;
        }
        if(arr[index] == target){
            return index ;
        }
        else{
            return search(arr, target, index+1) ;

        }
        
    }

    // second way 

    static boolean search2(int[] arr, int target, int index){
        if(index == arr.length){
            return false ;
        }
        return arr[index]==target || search2(arr, target, index+1) ;

    }
    
}
