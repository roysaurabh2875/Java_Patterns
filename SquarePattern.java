import java.util.Scanner;

public class SquarePattern {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the pattern:");
        int size = sc.nextInt();

        for (int rows = 1 ; rows <= size ;rows++){
            for(int col = 1 ; col<= size ; col++){
                System.out.print("# ");
            }
            // prints the next row after printing a new coloum
            System.out.println();
        }
    }
}