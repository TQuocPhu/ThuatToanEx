package dieukien;

import java.util.Map;
import java.util.Scanner;

public class B1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap canh thu nhat: ");
        double a = sc.nextDouble();
        System.out.println("Nhap canh thu hai: ");
        double b = sc.nextDouble();
        System.out.println("Nhap canh thu ba: ");
        double c = sc.nextDouble();

        if(isTrangle(a,b,c)){
            String type = getTrangle(a,b,c);
            System.out.println("Day la tam giac " + type);
        } else {
            System.out.println("Ba canh tren khong phai la tam giac");
        }
        sc.close();
    }

    public static String getTrangle(double a, double b, double c){
        if(a == b && b == c){
            return "deu";
        } else if(a == b || b == c || a == c){
            if(isRightTrangle(a,b,c)){
                return "vuong can";
            }
            return "can";
        } else if(isRightTrangle(a,b,c)){
            return "vuong";
        } else {
            return "thuong";
        }
    }

    public static boolean isTrangle(double a, double b, double c){
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    public static boolean isRightTrangle(double a, double b, double c){
        double a2 = a*a, b2 = b*b, c2 = c*c;
        return Math.abs(a2 + b2 - c2) < 1e-6 ||
                Math.abs(a2 + c2 - b2) < 1e-6 ||
                Math.abs(b2 + c2 - a2) < 1e-6;
    }

}
