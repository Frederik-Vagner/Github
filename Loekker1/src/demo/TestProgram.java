package demo;

import java.util.Scanner;

public class TestProgram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the numbers of rows u would like:");
        int rows = scanner.nextInt();
        System.out.println("Enter how many (+) per line u would like:");
        int chars = scanner.nextInt();

        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < chars; j++) {
                System.out.print("+");

            }
            System.out.println();
        }
    }
}
