import java.util.*;
class Main{
    public static void main(String args[]){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of elements in an array");
        int n =scan.nextInt();
        System.out.println("Enter the array elements");
        int a[]=new int[n];
        int sum=0;
        for(int i =0;i<n;i++){
            a[i]=scan.nextInt();
        }
        System.out.println("Cumulative sum array");
         for(int i =0;i<n;i++){
            sum+=a[i];
        System.out.print(sum+" ");
        }
    }
}   
