import java.util.Scanner;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);
        String[] s=e.nextLine().split("");
        int c=0;
        for (int i=0;i<s.length;i++){
            for (int j=i+1;j<s.length;j++){
                if (s[i].equals(s[j])){
                    c++;
                    break;
                }
            }
            c++;
        }
        if (c%2==0){
            System.out.println("CHAT WITH HER!");
        }else System.out.println("IGNORE HIM!");
    }
}
