package Forjava;

import java.util.Scanner;

/**
 * Created by mac on 16/11/14.
 */
public class JavaStdinAndStdoutI {
    public static void main(String[] args) {
        /* Enter your code here. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        scan.close();
    }
}
