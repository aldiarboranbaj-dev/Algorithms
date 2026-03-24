package task8;

import java.util.Scanner;

public class main {

    public static String check(String s){
    if (s.length()== 0) return "yes";
    if (s.charAt(0) < '0' || s.charAt(0) > '9') return "no";
    return check(s.substring(1));
    }
public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(check(s));
}
}