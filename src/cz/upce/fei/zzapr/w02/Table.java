package cz.upce.fei.zzapr.w02;
import java.util.Scanner;  // Import the Scanner class

public class Table {
    public static void main(String[] args) {
        int size = askSize();
        table(size);
    }
    public static int askSize() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the multiplication table: ");
        int size = scanner.nextInt();
        return size;
    }
    public static void table(int size) {
        size += 1;
        printHeader(size);
        printDivider(size);
        printContent(size);
    }
    public static void printHeader(int size) {
        System.out.printf("%7s", "||");
        for (int i = 0; i < size; i++) {
            System.out.printf("%4d", i);
        }
        System.out.println();
    }

    public static void printDivider(int size) {
        for (int j = 0; j < 7; j++) {
            System.out.print("=");
        }
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("=");
            }
        }

        System.out.println();
    }

    public static void printContent(int size) {
        for (int i = 0; i < size; i++) {
            System.out.printf("%4d", i);
            System.out.print(" ||");
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", i * j);
            }
            System.out.println();
        }
    }
}
