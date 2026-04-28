import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Sorter sort = new Sorter();
        Searcher search = new Searcher();
        int ArraySize = sc.nextInt();
        Experiment exp = new Experiment();
        Random rand = new Random();


        int[] RandArray = exp.GenerateRandomArray(ArraySize);


        long SortTime = exp.MeasureSortTime(RandArray, true, sort);
        System.out.println(Arrays.toString(RandArray));
        System.out.println("Sort time = "+ SortTime + " nanosseconds");

        int target = rand.nextInt(ArraySize);
        Experiment.SearchResult result = exp.MeasureSearchTime(RandArray, RandArray[target], search);
        System.out.println("our target has index: " + result.index);
        System.out.println("Search time = "+ result.time + " nanoseconds");

    }
}