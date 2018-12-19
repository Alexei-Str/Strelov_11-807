import java.util.Scanner;

public class task62 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку");
        String st = sc.nextLine();
        System.out.println(spaceRemove(st));
    }

    public static String spaceRemove(String st) {
        int i = 0;
        while (st.charAt(i) == ' ') {
            i++;
        }
        return st.substring(i);
    }
}
