import java.util.Scanner;

public class Bit {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        int n = e.nextInt();
        e.nextLine();
        int X=0;
        String[] s = new String[n];
        for (int i=0;i<n;i++){
            s[i]=e.nextLine();
        }
        for (int i=0;i<n;i++){
            if(s[i].equals("++X")||s[i].equals("X++")){
                X++;
            }else X--;
        }
        System.out.println(X);
    }
}
