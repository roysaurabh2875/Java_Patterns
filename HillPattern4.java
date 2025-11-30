import java.util.*;

// full hash pattern 

public class HillPattern4 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("#");
            }

            for (int s = 0; s < (i * 2) - 1; s++) {
                System.out.print(" ");
            }

            if (i != 0) { // skip one # in the middle for first line
                for (int j = i; j < n; j++) {
                    System.out.print("#");
                }
            } else {
                for (int j = i + 1; j < n; j++) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }

        // 🔹 Lower half
        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                System.out.print("#");
            }

            for (int s = 0; s < (i * 2) - 1; s++) {
                System.out.print(" ");
            }

            if (i != 0) {
                for (int j = i; j < n; j++) {
                    System.out.print("#");
                }
            } else {
                for (int j = i + 1; j < n; j++) {
                    System.out.print("#");
                }
            }

            System.out.println();
        }
    }
}
