import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] predictions = new int[n];
        for (int i = 0; i < n; i++) {
            predictions[i] = sc.nextInt();
        }
        int actualScore = sc.nextInt();
        boolean found = false;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (predictions[i] == actualScore) {
                count++;
                System.out.println("lucky prize winner " + count + " at location " + (i + 1) + ".");
                found = true;
            }
        }
        if (!found) {
            System.out.println("None of the persons predicted the score correctly.");
        }
    }
}
