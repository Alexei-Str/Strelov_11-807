import java.util.Scanner;

public class task52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String st = sc.next();
        char[] arr = st.toCharArray();
        for (int i = 0; i < st.length(); i++) {
            if (arr[i] >= '0' & arr[i] <= '9') {
                arr[i] = '*';
            }
            System.out.print(arr[i]);
        }
    }
}
