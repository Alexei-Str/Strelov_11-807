import java.util.Scanner;

public class hw3 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Введите число студентов");
        int q= sc.nextInt();
        System.out.println("Введите рост студентов");
        double[] h= new double[q];
        double sum= 0;
        for(int i=0;i<q;i++){
            h[i]= sc.nextDouble();
            sum= sum + h[i];
        }
        double ave= sum/q;
        System.out.println("Средний рост "+ ave);
        int qua= 0;
        for(int i=0;i<q;i++){
            if (h[i]>ave){
                qua++;
            }
        }
        System.out.println(qua+ " студента выше среднего роста");
    }
}
