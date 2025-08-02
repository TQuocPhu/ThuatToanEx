package dieukien;

import java.util.Scanner;

public class B2_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap diem mon thu 1: ");
        double score1 = sc.nextDouble();

        System.out.println("Nhap diem mon thu 2: ");
        double score2 = sc.nextDouble();

        System.out.println("Nhap diem mon thu 3: ");
        double score3 = sc.nextDouble();

        double avgScore = (score1 * 1 + score2 * 2 + score3 * 3) / 6;

        if(avgScore >= 9.0 && avgScore <= 10){
            System.out.println("Xuat sac");
        } else if(avgScore >= 8.0 && avgScore < 9.0){
            System.out.println("Gioi");
        } else if(avgScore >= 6.5 && avgScore < 8.0){
            System.out.println("Kha");
        } else if(avgScore >= 5.0 && avgScore < 6.5){
            System.out.println("Trung binh");
        } else if(avgScore >= 3.5 && avgScore < 5){
            System.out.println("Yeu");
        } else if(avgScore >= 1.0 && avgScore < 3.5){
            System.out.println("Kem");
        } else if(avgScore >= 0 && avgScore < 1.0){
            System.out.println("Rat kem");
        } else {
            System.out.println("diem khong hop le!");
        }
        sc.close();
    }
}
