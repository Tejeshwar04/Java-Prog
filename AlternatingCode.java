import java.util.*;
public class Main{
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        String code= sc.nextLine().trim().toUpperCase();

        if(code.length() <2){
            System.out.println("No");
            return;

        }

        char first = code.charAt(0);
        char second=code.charAt(1);

        if(first==second){
            System.out.println("No");
            return;

        }
        for(int i=2;i<code.length();i++){
            if(i%2==0 && code.charAt(i)!=first || i%2!=0 && code.charAt(i)!=second ){
                System.out.println("No");
                return;
            }
        }
        System.out.println("Yes");
    }
}
