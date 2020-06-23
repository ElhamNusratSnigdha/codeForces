import java.util.Scanner;

public class Tram{
    public static int countPassanger(int[] z,int[] y){
        int total=0;
        int x=0;
        for (int i=1;i< z.length;i++){
           total=(z[i]+x)-y[i];
           if(total<0){
               x=0;
           }else x = total;
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner ens = new Scanner(System.in);

        int n = ens.nextInt();
        ens.nextLine();

        int[] a = new int[n];
        int[] b = new int[n];

        for (int i=0;i<n;i++){
            String[] s = ens.nextLine().split(" ");
            a[i]=Integer.parseInt(s[0]);
            b[i]=Integer.parseInt(s[1]);
        }

        int maxCapacity = countPassanger(a,b);
        System.out.println(maxCapacity);
    }
}