import java.util.Scanner;

public class task41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите количество чисел первого массива");
        int lenght1 = sc.nextInt();
        String st1 = "";
        String st2 = "";
        System.out.println("Введите первый массив");
        for (int i = 0; i < lenght1; i++) {
            st1 += sc.nextInt();
        }
        System.out.println("Введите количество чисел второго массива");
        int lenght2 = sc.nextInt();
        System.out.println("Введите второй массив");
        for (int i = 0; i < lenght2; i++) {
            st2 += sc.nextInt();
        }
        int a = st1.indexOf(st2);
        if (a > -1) {
            System.out.println("Индекс первого вхождения: " + a);
        } else {
            System.out.println("Не входит");
        }
    }
}