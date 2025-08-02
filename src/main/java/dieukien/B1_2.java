package dieukien;

import java.util.Scanner;

public class B1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so thu nhat: ");
        int firstNumber = sc.nextInt();

        System.out.println("Nhap so thu hai: ");
        int secondNumber = sc.nextInt();

        System.out.println("Nhap so thu ba: ");
        int finalyNumber = sc.nextInt();

        int max = firstNumber;
        if(secondNumber > max) {
            max = secondNumber;
        } else if (finalyNumber > max){
            max = finalyNumber;
        }
        System.out.println("So lon nhat: "+max);
    }
}
