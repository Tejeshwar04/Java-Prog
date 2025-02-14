import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int  n=scan.nextInt();
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        double mean=calMean(arr,n);
        double median=calMedian(arr,n);
        System.out.printf("Mean : %.2f%n",mean);
        System.out.printf("Median : %.2f%n",median);
    }
    public static double calMean(int[] arr,int n){
        double sum=0;
        for(int num : arr){
            sum+=num;
        }
        return sum/n;
    }
    public static double calMedian(int[] arr, int n){
        Arrays.sort(arr);
        if(n%2==1){
            return arr[n/2];
        }
        else{
            return(arr[(n/2)-1]+arr[n/2])/2.0;
        }
    }
}   
