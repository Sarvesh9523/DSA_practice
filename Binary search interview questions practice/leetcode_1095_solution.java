/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */

 // question number 1095 leetcode hard level .
 
 /**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class leetcode_1095_solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int peak = peakIndexInMountainArray(mountainArr);
        
        // First, search in the ascending part of the mountain array
        int firstTry = orderAgnosticbinarySearch(mountainArr, target, 0, peak, true);
        if (firstTry != -1) {
            return firstTry;
        }
        
        // If not found, search in the descending part
        return orderAgnosticbinarySearch(mountainArr, target, peak + 1, mountainArr.length() - 1, false);
    }
    
    public int peakIndexInMountainArray(MountainArray arr) {
        int start = 0;
        int end = arr.length() - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);
            int midNextVal = arr.get(mid + 1);  // Only one extra call to check the next element
            
            if (midVal > midNextVal) {
                // You are in the decreasing part of the mountain
                end = mid;
            } else {
                // You are in the increasing part of the mountain
                start = mid + 1;
            }
        }
        return start;  // start will be the peak element
    }

    public int orderAgnosticbinarySearch(MountainArray arr, int target, int start, int end, boolean isAsc) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int midVal = arr.get(mid);  // Call MountainArray.get() only once here
            
            if (midVal == target) {
                return mid;
            }
            
            if (isAsc) {
                if (midVal > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (midVal < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        
        return -1;
    }
}


