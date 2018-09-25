import java.util.Scanner;

public class hw35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = {3, 4, 2, 11, 133};
        String str = "";
        System.out.println("Output");
        for (int i = 0; i < 5; i++) {
            str += mas[i];
        }
        int x = Integer.parseInt(str);
        System.out.print(x);
    }
}
