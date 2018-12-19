import java.util.Arrays;
import java.util.Scanner;

public class task42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String st = sc.next();
        System.out.println("Введите сдвиг");
        int k = sc.nextInt();
        char[] arr1 = st.toCharArray();
        char arr2[] = new char[arr1.length];
        for(int i = 0; i < arr2.length; i++) {
            arr2[(i + k) % arr2.length] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
