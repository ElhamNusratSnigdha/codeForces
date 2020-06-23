import java.util.Arrays;
import java.util.Scanner;

public class StonesOnTheTable {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int n = e.nextInt(); //number of stones
        e.nextLine();
        String[] s =e.nextLine().split("");

        int c=0;
        for (int i=0;i<n-1;i++){
            if(s[i].equals(s[i+1])){
                c++;
            }
        }
        System.out.println(c);
    }
}
