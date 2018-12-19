import java.util.Scanner;

public class task43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Индекс начала удаления");
        int a = sc.nextInt();
        System.out.println("Индекс конца удаления");
        int b = sc.nextInt();
        System.out.println("Введте слово");
        String str = sc.next();
        String s =" ";
        char[] arr = str.toCharArray();
        for (int i = 0; i < a; i++) {
            s+=arr[i];
        }
        for (int i = b+1; i < arr.length; i++) {
            s += arr[i];
        }
        System.out.println(s);
    }
}
