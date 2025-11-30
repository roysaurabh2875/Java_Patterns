import java.util.*;

public class TriangularPattern3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Size of the pattern:");
        int n = sc.nextInt();
        
        for(int i = n ; i >= 1 ; i--){
            for(int j = 0; j < n-i ; j++){
                System.out.print(" ");
            }
            for(int j = 0 ;j < i ; j++){
                System.out.print("*");
            }
        System.out.println();
        }
    }
}