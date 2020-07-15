import java.awt.*;
import java.util.Arrays;
import java.util.Scanner;

public class wrongSubtraction {
    public static int lastElement(int n){
        int j = 0, len = Integer.toString(n).length();
        int[] arr = new int[len];
        while(n!=0){
            arr[len-j-1]=n%10;
            n=n/10;
            j++;
        }
        return arr[len-1];
    }
    public static void main(String[] args) {
        Scanner ens = new Scanner(System.in);
        int n = ens.nextInt(), k = ens.nextInt(), num=n;
        for (int i=1;i<=k;i++){
            if (lastElement(num)==0){
                num=num/10;
            }else num=num-1;
        }
        System.out.println(num);
    }
}
