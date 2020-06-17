import java.util.Scanner;

public class WayTooLongWords {
    public static void main(String[] args) {
        Scanner ens = new Scanner(System.in);

        int n = ens.nextInt();
        String[] s = new String[n+1];
        int i=0;
        while(0<=n){
            s[i]=ens.nextLine();
            i++;
            n--;
        }

        for (int j=0;j<s.length;j++){
            int nS=s[j].length();
            if (nS>10){
                System.out.println(new StringBuilder().append(s[j].charAt(0)).append(nS - 2).append(s[j].charAt(nS - 1)).toString());
            }else{
                System.out.println(s[j]);
            }
        }
    }
}
