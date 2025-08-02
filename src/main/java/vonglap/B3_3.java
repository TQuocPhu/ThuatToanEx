package vonglap;

import java.util.Scanner;

public class B3_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập khoảng a đến b
        System.out.print("Nhập số a: ");
        int a = sc.nextInt();

        System.out.print("Nhập số b: ");
        int b = sc.nextInt();

        System.out.println("Các số chính phương từ " + a + " đến " + b + " là:");

        for(int i = a ; i <= b; i++){
            int sqrt = (int)Math.sqrt(i);
            if(sqrt * sqrt == i){
                System.out.println(i + " ");
            }
        }
    }
}
