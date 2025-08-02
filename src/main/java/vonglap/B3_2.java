package vonglap;

import java.util.Scanner;

public class B3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap a: "); int a = sc.nextInt();
        System.out.println("Nhap b: "); int b = sc.nextInt();

        for(int i = a; i <= b; i++){
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            } else if(i % 3 == 0){
                System.out.println("Fizz");
            } else if(i % 5 == 0){
                System.out.println("Buzz");
            }
        }
    }
}
