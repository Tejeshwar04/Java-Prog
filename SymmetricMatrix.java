import java.util.*;

class Utility{
    public static boolean isSymmetric(int[][] mat,int row,int col){

        if(row!=col){
            return false;
        }

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(mat[i][j]!=mat[j][i]){
                    return false;
                }
            }
        }
        return true;
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();

        int[][] mat=new int[m][n];
        
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }

        boolean symmetric=Utility.isSymmetric(mat,m,n);

        if(symmetric){
            System.out.println("Symmetric");

        }
        else{
            System.out.println("Not Symmetric");
        }
    }
}      
