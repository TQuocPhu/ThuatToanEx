package dieukien;

import java.util.Scanner;

public class B1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap 1 so: ");
        int number = sc.nextInt();
        String result = (number%2==0) ? "So chan" : "So le";
        System.out.println(result);
    }
}
