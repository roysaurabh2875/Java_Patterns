import java.util.*;

public class BoxPattern3 {
        public static void main(String args[]){
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the size of the pattern :");
            int s = sc.nextInt();

            int n = s - 1 ;

            for(int i = 1 ; i <= n ;i++){
                for(int j = 1 ; j <= n ;j++){
                    if((i == 1)||(i == n)||(i+j == n+1)){
                        System.out.print("# ");
                    }
                    else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        }
}
