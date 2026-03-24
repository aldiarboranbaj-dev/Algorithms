package task4;

import java.util.Scanner;

public class main {

    public static int factorial(int n) {
        if (n == 0) return 1; // базовый случай
        return n * factorial(n - 1); // рекурсивный вызов
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.println(factorial(n));
    }
}