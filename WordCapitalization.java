import java.util.Arrays;
import java.util.Scanner;

public class WordCapitalization {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String s = e.nextLine();
        String[] sa = s.split("");
        sa[0]=sa[0].toUpperCase();
        for (int i=0;i< sa.length;i++){
            System.out.print(sa[i]);
        }
    }
}
