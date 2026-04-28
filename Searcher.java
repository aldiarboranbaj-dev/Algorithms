public class Searcher {
    public int BinarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int middle;

        while (low <= high){
            middle = (low + high) / 2;
            if (target > arr[middle]){
                low = middle+1;
            }
            else if (target < arr[middle]){
                high = middle-1;
            }
            else{
                return middle;
            }
        }
        return -1;
    }
}