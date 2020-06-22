import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        int max = 0;
        String integer = e.nextLine();
        String[] split = integer.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);;
        String s = e.nextLine();
        String[] sa = s.split(" ");
        int[] a = new int[n];
        for (int i=0;i<n;i++){
            a[i]=Integer.parseInt(sa[i]);
            if (i==(k-1)){
                max=a[i];
            }
        }
        int count=0;
        for (int i =0;i<n;i++){
            if(a[i]!=0&&a[i]>=max){
                count++;
            }
        }
        System.out.println(count);
    }
}
