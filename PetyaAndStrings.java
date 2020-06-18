import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner e = new Scanner(System.in);

        String s1 = e.nextLine();
        String s2 = e.nextLine();

        //converting them into lowercase
        String s1L = s1.toLowerCase();
        String s2L = s2.toLowerCase();


        int a = s1L.compareTo(s2L);

        if(a<0){
            System.out.println("-1");
        }else if (a>0) {
            System.out.println("1");
        }else System.out.println("0");

    }
}
