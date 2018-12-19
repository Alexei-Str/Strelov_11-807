import java.util.Scanner;

public class task51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sw = 1;
        String s;
        int a = 0;
        int x = 0;
        int b;
        while (1 == sw) {
            if (x == 0) {
                System.out.println("Введите первое число");
                a = sc.nextInt();
            }
            System.out.println("Введите операцию (+,-,*,/)");
            String op = sc.next();
            System.out.println("Введите второе число");
            b = sc.nextInt();
            if (op.equals("+")) {
                System.out.println(a += b);
            }
            if (op.equals("-")) {
                System.out.println(a -= b);
            }
            if (op.equals("*")) {
                System.out.println(a = a * b);
            }
            if (op.equals("/")) {
                System.out.println(a = a / b);
            }
            System.out.println("Для продолжения введите 1, для завершения 0");
            sw = sc.nextInt();
            if (sw==1) {
                System.out.println("Сохранить ответ для дальнейшего счёта? да/нет");
                s = sc.next();
                if (s.equals("нет")) {
                    x = 0;
                } else {
                    x = 1;
                }
            }
        }
    }
}
