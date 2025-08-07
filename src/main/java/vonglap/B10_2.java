package vonglap;
//Nhập a,b,c. In ra các số 3 chữ số có thể tạo ra từ a,b,c (có thể trùng, khác 0).
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class B10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap vao 3 so nguyen co the trung nhau, !0: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] digits = {a, b, c};

        Set<Integer> result = new HashSet<>();

        for(int i : digits){
            for(int j : digits){
                for(int k : digits){
                    if(i != 0){
                        int num = 100 * i + 10 * j + k;
                        result.add(num);
                    }
                }
            }
        }

        System.out.println("Cac so 3 chu so duoc tao ra: ");
        for(int num : result){
            System.out.println(num + " ");
        }
    }
}
