public class Sorter {

    public void BubbleSort(int[] arr){
        int n = arr.length;
        for (int i=0; i<n-1 ; i++){
            for (int j=0; j<n-1-i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public void SmartSort(int[] arr){
        QuickSort(arr, 0, arr.length-1);
    }

    private void QuickSort(int[] arr, int low, int high){
        if(low < high){
            int pivot = Pivots(arr, low, high);
            QuickSort(arr, pivot+1, high);
            QuickSort(arr, low, pivot-1);
        }
    }

    private int Pivots(int[] arr, int low, int high){
        int pivot = arr[high];
        int i = low - 1;

        for (int j=low; j < high; j++){
            if (arr[j] <= pivot){
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }

        int temp = arr[high];
        arr[high] = arr[i+1];
        arr[i+1] = temp;

        return i+1;
    }
}