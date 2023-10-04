package sequencial;

import java.util.Scanner;

public class Bee1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double raio = scan.nextDouble();
        double n = 3.14159;
        double area = Math.pow(raio, 2) * n;

        System.out.printf("A=%.4f\n",area);

        scan.close();
    }
}
