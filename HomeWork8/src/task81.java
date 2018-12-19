import java.util.Scanner;

public class task81 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Матрица n*n");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }


        boolean Magic;
        int g = 0;
        int o = 0;
        for (int i = 0; i < n; i++) {
            g += matrix[i][i];
            o += matrix[n - i - 1][n - i - 1];
        }
        Magic = (g == o);
        for (int i = 0; i < n; i++) {
            int sum = 0; int sum2 = 0;
            for (int j = 0; j < n; j++) {
                sum += matrix[i][j];
                sum2 += matrix[j][i];
            }
            if (sum!=g || sum2 !=g) Magic = false;
        }
        System.out.println(Magic);
    }
}
