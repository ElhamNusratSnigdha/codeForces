import java.util.Scanner;

public class DominoPiling {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String s = e.nextLine();
        String[] sa = s.split(" ");

        int m = Integer.parseInt(sa[0]);
        int n = Integer.parseInt(sa[1]);

        int product = m*n;

        int numberOfDominos = product/2;

        System.out.println(numberOfDominos);

        e.close();
    }
}
