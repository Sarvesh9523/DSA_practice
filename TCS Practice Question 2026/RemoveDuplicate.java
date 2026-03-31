import java.util.* ;


public class RemoveDuplicate {
    public static void main(String[] args){
        int[] arr = {5, 3, 3, 5, 1, 1, 5} ;
        // int[] ans = removeDup(arr);
        // System.out.println(Arrays.toString(ans));

        
        // int[] ans = removedupl(arr);
        // System.out.println(Arrays.toString(ans));

        int[] ans = removeDuplicate(arr);
        System.out.println(Arrays.toString(ans));

        

        // String str = "aabbcdeeffhhgg" ;
        // System.out.println(nonRepeatingChar(str)) ;

    }

    //extract unique element in unorder way
    static int[] removeDup(int[] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr){
            set.add(num);
        }

        int[] result = new int[set.size()] ;
        int i = 0 ;
        for(int num : set){
            result[i++] = num ;
        }
        return result ;
        
    }

    //extract unique element in ordered manner
    static int[] removedupl(int[] arr){
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for(int num : arr){
            set.add(num) ;
        }

        int[] result = new int[set.size()] ;
        int i = 0 ; //index of new array (result)

        for(int ele : set){
            result[i++] = ele ;

        }
        return result ;
    }

    //find unique element in same order for String
    static String nonRepeatingChar(String str){
        char[] ch = str.toCharArray() ;  // coverting the string into char array 
        LinkedHashSet<Character> set = new LinkedHashSet<>() ;
        for(char c : ch){
            set.add(c) ;
        }

        StringBuilder sb = new StringBuilder();
        for(char c : set){
            sb.append(c) ;
        }

        return sb.toString() ;

    }

    //If your interviewer insists on no extra data structures (pure array solution), sort first then apply your original logic: (this method remove duplicate element in place without using extra DS )
    static int[] removeDuplicate(int[] arr){
        Arrays.sort(arr) ;
        int index = 1;
        for(int i = 1; i<arr.length; i++){
            if(arr[i] != arr[i-1]){
                arr[index++] = arr[i];
            }           

        }

        return Arrays.copyOfRange(arr, 0, index) ;
        
    }
    
}
