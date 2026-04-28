import java.util.Random;

public class Experiment {
    public int[] GenerateRandomArray(int size){
        Random rand = new Random();
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = rand.nextInt(10000);
        }
        return arr;
    }

    public long MeasureSortTime(int[] arr, Boolean advanced, Sorter sorter){
        long start = System.nanoTime();

        if(advanced){
            sorter.SmartSort(arr);
        }
        else{
            sorter.BubbleSort(arr);
        }

        long end = System.nanoTime();
        return end-start;
    }

    public SearchResult MeasureSearchTime(int[] arr, int target, Searcher searcher)
    {
        long start = System.nanoTime();
        int index = searcher.BinarySearch(arr, target);
        long end = System.nanoTime();
        SearchResult result = new SearchResult(end-start, index);
        return result;
    }

    public class SearchResult{
        public long time;
        public int index;

        public SearchResult(long time, int index){
            this.time = time;
            this.index = index;
        }
    }
}