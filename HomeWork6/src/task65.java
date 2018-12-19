import java.util.Scanner;

public class task65 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину первого массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите длину второго массива");
        n = sc.nextInt();
        int[] arr2 = new int[n];
        System.out.println("Введите первый массив");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Введите второй массив");
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = sc.nextInt();
        }
        System.out.println("Уникальных чисел " + (uniq(arr,arr2) + uniq(arr2,arr) + 1));
    }

    public static int uniq(int[] arr, int[] arr2) {
        int a = 0;
        int b = 0;
        for (int i = 0; i < arr.length; i++) {
            for (b = 0; b < arr2.length; b++) {
                if (arr[i] == arr2[b]) break;
            }
            if (b == arr2.length) a++;
        }
        return a;
    }
}
