import java.util.*;
 public class Main{
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String cratch=sc.nextLine();
        int zeroc=0,onec=0;

        for(int i =0;i<cratch.length();i++){
            if(cratch.charAt(i)=='0'){
                zeroc++;
                

            }
            if(cratch.charAt(i)=='1'){
                onec++;
            }


        }
        if(zeroc==1 || onec==1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
     }
 }
