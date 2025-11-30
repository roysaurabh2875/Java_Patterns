import java.util.Scanner;

public class CheckerPattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();

        for(int rows = 1 ; rows <= size ; rows++){
            if (rows % 2 == 0){
                System.out.print(" ");
            }
            for (int col = 1 ; col <= size ; col++){
                System.out.print("# ");
            }
            System.out.println();
        }
    }
}
