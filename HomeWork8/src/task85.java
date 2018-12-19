import java.util.Scanner;

public class task85 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2, m1, m2;
        do {
            System.out.println("Введите высоту и ширину первой матрицы");
            n1 = sc.nextInt();
            m1 = sc.nextInt();
            System.out.println("Введите высоту и ширину второй матрицы");
            n2 = sc.nextInt();
            m2 = sc.nextInt();
        } while (n2 != m1);
        int[][] matrix1 = new int[n1][m1];
        int[][] matrix2 = new int[n2][m2];
        System.out.println("Введите первую матрицу");
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Введите вторую матрицу");
        for (int i = 0; i < n2; i++) {
            for (int j = 0; j < m2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }
        int[][] mat3 = new int[n1][m2];
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < m2; j++) {
                int sum = 0;
                for (int k = 0; k < m1; k++) {
                    sum += (matrix1[i][k] * matrix2[k][j]);
                }
                mat3[i][j] = sum;
            }
        }
        for (int i = 0; i < n1; i++) {
            System.out.println();
            for (int j = 0; j < m2; j++) {
                System.out.print(mat3[i][j] + " ");
            }
        }
    }
}
