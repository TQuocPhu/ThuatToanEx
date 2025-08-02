package dieukien;

import java.util.Scanner;

public class B2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap so tien gui: ");
        double soTienGoc = sc.nextDouble();

        System.out.println("Nhap so thang gui: ");
        int soThang = sc.nextInt();

        if(soTienGoc <= 0) {
            System.out.println("So tien gui phai lon hon 0");
            return;
        }
        if(soThang <= 0){
            System.out.println("So thang khong duoc am ");
            return;
        }

        double laiSuat = 6.5;

        if(soThang <= 6){
            laiSuat = 4.5;
        } else if(soThang >= 3*12){
            laiSuat = 7.5;
        }

        if(soTienGoc >= 1000000000){
            laiSuat+=0.5;
        }

        double tienLai = soTienGoc * laiSuat * (soThang * 12) / 100;
        double tongTien = soTienGoc + tienLai;

        // Hiển thị kết quả
        System.out.println("\n=== Kết quả ===");
        System.out.printf("Lãi suất áp dụng: %.2f%%\n", laiSuat);
        System.out.printf("Tổng lãi sau %d thang: %.0f VND\n", soThang, tienLai);
        System.out.printf("Tổng tiền nhận được: %.0f VND\n", tongTien);

        sc.close();

    }
}
