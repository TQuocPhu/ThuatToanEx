package dieukien;

import java.util.Scanner;

public class B2_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so banh: ");
        int numberOfCake = sc.nextInt();

        if(numberOfCake <= 0) {
            System.out.println("Khong co banh nao duoc ran");
        } else{
            int count = (numberOfCake + 8) / 9; //để lấy phần dư thêm => 1 lần
            System.out.println("So lan ran banh  it nhat la: " + count);
        }
        sc.close();
    }
}
