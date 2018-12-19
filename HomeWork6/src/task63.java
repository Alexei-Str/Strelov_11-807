import java.util.Scanner;

public class task63 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int l = sc.nextInt();
        int[] arr = new int[l];
        System.out.println("Введите массив чисел");
        for (int i = 0; i < l; i++) {
            arr[i] = sc.nextInt();
        }
        int m = 1;
        int max = 0;
        for (int i = 0; i < l - 1; i++) {
            if (arr[i + 1] == arr[i]) {
                m++;
                if (m > max) max = m;
            } else {
                m = 1;
            }
        }
        System.out.println(max);
    }
}
