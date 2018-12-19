import java.util.Scanner;

public class task54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String s1 = sc.next();
        System.out.println("Введите индекс (u- верхний регистр, l- нижний)");
        String a = sc.next();
        if (a.equals("u")) {
            System.out.println(s1.toUpperCase());
        }
        else {
            System.out.println(s1.toLowerCase());
        }
    }
}
