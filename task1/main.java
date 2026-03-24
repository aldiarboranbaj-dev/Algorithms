package task1;

import java.util.Scanner;

public class main {
    //task1
    public static void Number(int n) {
        if (n == 0) return;
        Number(n / 10);
        System.out.println(n % 10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Number(n);
    }
}