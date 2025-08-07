package timkiem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class B_26_3 {
    public static void main(String[] args) {
//        Tìm số lần xuất hiện của x trong mảng. Dùng Map.
        Scanner scannerNumber = new Scanner(System.in);

        System.out.println("Nhap so luong phan tu trong mang: ");
        int length = scannerNumber.nextInt();
        int[] arr = new int[length];

        System.out.println("Nhap cac phan tu cua mang: ");
        for (int i = 0; i < length; i++) {
            System.out.println("Nhap phan tu thu: " + (i + 1));
            arr[i] = scannerNumber.nextInt();
        }

        System.out.println("Nhap phan tu x: ");
        int x = scannerNumber.nextInt();

        Map<Integer, Integer> map = new HashMap<>();
        for(int num : arr){
//            map.put(num, map.getOrDefault(num, 0) + 1);
            if(map.containsKey(num)){
                int count = map.get(num);
                count = count + 1;
                map.put(num, count);
            } else {
                int count = 0;
                map.put(num, count);
            }
        }

//        if(map.containsKey(x)){
//            System.out.println("So " + x + " xuat hien " + map.get(x) + " lan ");
//        } else {
//            System.out.println("Khong co so " + x + " trong mang");
//        }

        Set<Integer> keys = map.keySet();
        for(int key : keys) {
            System.out.println("So lan xuat hien cua " + key + " la " + map.get(key));
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println("Số " + entry.getKey() + " xuất hiện " + entry.getValue() + " lần.");
        }

        scannerNumber.close();
    }
}
