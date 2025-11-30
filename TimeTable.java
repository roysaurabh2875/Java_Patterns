import java.util.*;

public class TimeTable {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the size of the pattern:");
        int n = sc.nextInt();

        System.out.println("   ");
         System.out.printf("%4s", "");
        for (int i = 1 ;i <= n;i++ ){
            System.out.printf("%4d",i);
        }
        System.out.println();

        System.out.println("   ");
        for(int i = 1; i <= n ; i++){
            System.out.printf("-----");
        }
        System.out.println("   ");
        for (int i = 1 ;i<=n;i++){
            System.out.printf("%4d|",i);
            for(int j = 1 ;j <= n ; j++){
                System.out.printf("%4d",i*j);
            }
            System.out.println();
        }
    }
}
