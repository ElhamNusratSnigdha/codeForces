import java.util.Arrays;
import java.util.Scanner;

public class HelpfulMaths {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String s = e.nextLine();
        String[] sa = s.split("\\+");
        int[] a = new int[sa.length];

        for (int i=0;i< sa.length;i++){
            a[i]=Integer.parseInt(sa[i]);
        }
        for (int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if (a[j-1]>a[j]){
                    int temp = a[j-1];
                    a[j-1] = a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print(a[0]);
        for (int i=1;i<a.length;i++){
            System.out.print("+"+a[i]);
        }
    }

}