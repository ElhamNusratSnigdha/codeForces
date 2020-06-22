import java.util.Arrays;
import java.util.Scanner;

public class Team {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        //numberOfProblems
        int n = e.nextInt();
        e.nextLine();

        //how many problems they will solve
        int count = 0;

        while(n>0) {
            //three friends array
            int[] a = new int[3];

            String s = e.nextLine();
            String[] sa = s.split(" ");
//            System.out.println(Arrays.toString(sa));
            for (int i = 0;i<sa.length;i++){
                a[i]=Integer.parseInt(sa[i]);
            }
            int count1 = 0;
            int count0 = 0;
            for (int i =0;i<a.length;i++){
                if (a[i]==1){
                    count1++;
                }else count0++;
            }
            if(count1>count0){
                count++;
            }
            //System.out.println(Arrays.toString(a));
            n--;
        }
        System.out.println(count);
        e.close();
    }
}
