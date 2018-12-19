import java.util.Scanner;

public class task64 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Введите массив чисел");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(repet(arr));
    }
    public static boolean repet(int[] arr) {
        boolean sw = false;
        outerLoop: for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    sw = true; break outerLoop;
                }
            }
        }
        return sw;
    }
}
