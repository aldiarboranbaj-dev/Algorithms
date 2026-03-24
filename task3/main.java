package task3;
import java.util.Scanner;
public class main {

    public static boolean prime(int n, int i){
        if (n<=2) return (n==2);
        if (n%i == 0) return false;
        if (i * i > n) return true;
        return prime(n,i+1 );
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (prime(n, 2)) {
            System.out.println("Prime");
        } else {
            System.out.println("Composite");
        }
    }
}
