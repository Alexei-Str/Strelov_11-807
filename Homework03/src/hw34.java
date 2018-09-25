import java.util.Scanner;

public class hw34 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите размер массива");
        int v= sc.nextInt();
        System.out.println("Введите числа");
        int[] a= new int[v];
        for(int i= 0;i<v;i++){
            a[i]= sc.nextInt();
        }
        int max= 0;
        int min= 0;
        boolean gg= false;
        for(int f= 1;f<v-1;f++){
            if(a[f-1]<a[f] & a[f+1]<a[f]){
                max++;
            }
            if(a[f-1]>a[f] & a[f+1]>a[f]){
                min++;
            }
            if(a[0]<=a[1] & a[v-1]<=a[v-2]){
                gg= true;
            }
        }
        if ((max==1 | max ==0) & min==0 & gg==true) {
            System.out.println("Условие соблюдено");
        }
        else{
            System.out.println("Условие не соблюдено");
        }
    }
}
