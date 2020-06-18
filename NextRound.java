import java.util.Arrays;
import java.util.Scanner;

public class NextRound {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String integer = e.nextLine();
        String[] split = integer.split(" ");
        int n = Integer.parseInt(split[0]);
        int k = Integer.parseInt(split[1]);;

        String intArr = e.nextLine();
        String[] splitA = intArr.split(" ");

        int[] a = new int[splitA.length];
        for (int i=0;i<a.length;i++){
            a[i]=Integer.parseInt(splitA[i]);
        }

        int count=0;
        for (int i=0;i<a.length;i++){
            if(a[i]>k){
                count++;
            }
        }

        System.out.println(count);
    }
}
