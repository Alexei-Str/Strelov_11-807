public class hw32 {
    public static void main(String[] args){
        double[] arr= {3,-5,-6.6,0,-1,5};
        double min=-1;
        int a=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr[i]= arr[i]*-1;
            }
            if(arr[i]>min) {
                min = arr[i];
                a= i;
            }
        }
        System.out.println("Индекс максимального по модулю элемента в массиве- "+ a);
    }
}
