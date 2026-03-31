public class RotationCount {
    public static void main(String [] args){
        int[] arr = {1, 2, 3, 4, 5, 6, 7} ; // here 4 rotation is happend
        System.out.println(CountRotations(arr));
    }
    static int CountRotations(int[] arr){
        int pivot = findPivot(arr);
        return pivot + 1 ;  // pivot + 1 is the count because pivot is the index of largest element and index start from zero than's why +1 should be give the correct count ;.

    }

    // this function is not for the array who contains the duplicate values 
    static int findPivot(int[] arr){
        int start = 0;
        int end = arr.length - 1 ;
        while(start < end){
            int mid = start + (end- start)/2 ;
            //mid element always lies in between start and end.
            if(mid < end && arr[mid] > arr[mid + 1]){ // mid should be less then end because of safe from searching out of the array due to mid+1 .
                return mid ;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] <= arr[start]){
                end = mid - 1 ;
            }else{
                start = mid + 1 ;
            }
        }
        return -1 ;

    }

    // Now this function is for duplicate values
    static int findPivotforDuplicateValues(int[] arr){
        int start = 0;
        int end = arr.length - 1 ;
        while(start < end){
            int mid = start + (end- start)/2 ;
            //mid element always lies in between start and end.
            if(mid < end && arr[mid] > arr[mid + 1]){ // mid should be less then end because of safe from searching out of the array due to mid+1 .
                return mid ;
            }
            if(mid > start && arr[mid] < arr[mid-1]){
                return mid - 1;
            }
            if(arr[mid] == arr[start] && arr[mid] == arr[end]){
                if(arr[start] > arr[start + 1]){
                    return start ;
                }
                start++ ;
                if(arr[end] < arr[end-1]){
                    return end -1 ;
                }
                end-- ;
            }
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])){
                start = mid+1;
            }else{
                end = mid - 1;
            }
        }
        return -1 ;

    }

    
}
