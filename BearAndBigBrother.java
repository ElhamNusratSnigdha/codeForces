import java.util.Scanner;

public class BearAndBigBrother {
    public static void main(String[] args) {
        Scanner ens = new Scanner(System.in);
        int a = ens.nextInt();
        int b = ens.nextInt();
        int c=0;
        while (a<=b){
            a*=3;
            b*=2;
            c++;
        }
        System.out.println(c);
    }
}
