import java.util.Scanner;

public class hw36 {
     public static void main(String[] args){
         Scanner sc= new Scanner(System.in);
         System.out.println("Введите размер массива");
         int v= sc.nextInt();
         System.out.println("Введите числа");
         int[] a= new int[v];
         for(int i= 0;i<v;i++){
             a[i]= sc.nextInt();
         }
         for(int i=v-1;i>-1;i--){
             System.out.print(a[i] + " ");
         }
     }
}
