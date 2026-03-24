package task7;

import java.util.Scanner;

public class main {

    public static void reversePrint(int n, Scanner sc) {
        if (n == 0) return;
        int x = sc.nextInt();
        reversePrint(n - 1, sc);
        System.out.print(x + " ");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        reversePrint(n, sc);
        System.out.println();
    }
}
