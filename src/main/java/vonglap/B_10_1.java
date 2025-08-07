package vonglap;

import java.util.Scanner;

public class B_10_1 {
    public static void main(String[] args) {
        Scanner scannerNumber = new Scanner(System.in);

        System.out.println("Nhap 3 so khac nhau, khac 0: ");
        int a = scannerNumber.nextInt(), b = scannerNumber.nextInt(), c = scannerNumber.nextInt();

        int[] digtals = {a, b, c};
        int count = 0;

        for(int i : digtals){
            for(int j : digtals){
                for(int k : digtals){
                    if(i != j && i != k && j != k && i != 0){
                        count++;
                    }
                }
            }
        }
        System.out.println("So luong so 3 chu so co the tao ra la: " + count);
    }
}
