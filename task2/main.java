package task2;

import  java.util.Scanner;
public class main {

    public static int sum(int[] arr, int n){
        if ( n == 0) return 0;
        return  arr[n-1] + sum (arr, n-1);
}
public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);
    int n = sc.nextInt();
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = sc.nextInt();
    }

    int total = sum(arr, n);
    double average = (double) total / n;

    System.out.println(average);
}
}
