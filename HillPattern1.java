import java.util.*;

public class HillPattern1 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no of rows pattern:");
        int n = sc.nextInt();

        for (int i = 1 ;i <= n ;i++){
            for(int j = 1 ;j <= 2*n-1 ;j++){
                if((i+j >= n+1)&&(i >= j-n+1)){
                    System.out.print("#");
                }else{
                    System.out.print(" ");
                }
            } 
            System.out.println();
        }
    }
}
