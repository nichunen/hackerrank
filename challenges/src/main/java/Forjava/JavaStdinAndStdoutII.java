package challenges.src.main.java.Forjava;

import java.util.Scanner;

/**
 * Created by mac on 16/11/16.
 */
public class JavaStdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        String s = scan.nextLine();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
