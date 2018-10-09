import java.util.Scanner;

public class ClassTestTask01 { //Вариант 2
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        int m = n * n;
        System.out.println("Введите " + m + " чисел");
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        int[] arr = getSideDiagonalAsVector(matrix);
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(arr[i] + " ");
        }
        mult(matrix, arr); // Заменить
        sortArr(arr);

    }

    static int[] getSideDiagonalAsVector(int[][] matrix) {
        int[] arr = new int[matrix[0].length];
        for (int i = 0; i < matrix[0].length; i++) {
            arr[i] = matrix[i][matrix.length - i - 1];
        }
        return arr;
    }

    static void mult(int[][] matrix, int[] arr) {
        int[] arr1 = new int[matrix[0].length];
        int sum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            sum = 0;
            for (int j = 0; j < matrix[0].length; j++) {
                sum += matrix[j][i] * arr[i];
            }
            arr1[i] = sum;
        }
        System.out.println("\n");
        for (int i = 0; i < matrix[0].length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static void sortArr(int[] arr1) {
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1.length - 1; j++) {
                if (sumOfRecurs(arr1[j]) < sumOfRecurs(arr1[j + 1])) {
                    int buf = arr1[j + 1];
                    arr1[j + 1] = arr1[j];
                    arr1[j] = buf;
                }
            }
        }
        System.out.println("\n");
        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + " ");
        }
    }

    static int sumOfRecurs(int arrNum) {
        int sum = 0;
        while (arrNum > 0){
            sum+=arrNum%10;
            arrNum = arrNum/10;
        }
        return sum;
    }
}

