import java.util.Scanner;

public class hw33 {
    public static void  main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите размер массива");
        int v= sc.nextInt();
        System.out.println("Введите числа");
        int max=0;
        int[] arr= new int[v];
        for(int i=0;i<v;i++){
            arr[i]= sc.nextInt();
        }
        for(int f= 1;f<v-1;f++){
            if(arr[f-1]<arr[f] & arr[f+1]<arr[f]){
                max++;
            }

        }
        System.out.println("Во введенном массиве "+ max+ " локальных максимумов.");
    }
}
